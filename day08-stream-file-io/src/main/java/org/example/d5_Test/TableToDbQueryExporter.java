package org.example.d5_Test;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.sql.*;
import java.util.*;

public class TableToDbQueryExporter {
    // 数据库连接配置（请替换为你的实际信息）
    private static final String DB_URL = "jdbc:mysql://39.98.165.79:6612/aws_prod?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "aws_zd";
    private static final String DB_PASSWORD = "Awszd123";

    public static void main(String[] args) throws IOException {
        // 配置参数（根据实际需求修改）
        String inputFilePath = "C:\\Users\\PC\\Downloads\\迁移ID1.xlsx";    // 输入表格文件路径（支持.xls/.xlsx）
        String outputFilePath = "C:\\Users\\PC\\Downloads\\result.xlsx";  // 导出结果文件路径
        int targetSheetIndex = 0;                  // 输入表格中目标工作表索引（0开始，第一个表为0）
        int targetColumn = 1;                      // 目标列索引（0开始，A列为0，B列为1...）
        int startRow = 1;                          // 开始读取的行索引（跳过表头，从数据行开始，0为第一行）
        String querySql = "SELECT ORGID,MEDIA_ACCOUNT_ID,MEDIA_ACCOUNT_NAME,SURPLUS_VALID_POINT FROM BO_EU_BOOK_RECHARGE_POINT WHERE MEDIA_ACCOUNT_ID = ? GROUP BY ORGID,MEDIA_ACCOUNT_NAME";  // 数据库查询SQL（?为占位符）

        try {
            // 1. 读取输入表格指定列的数据
            List<String> queryValues = readTableColumn(inputFilePath, targetSheetIndex, targetColumn, startRow);
            System.out.println("成功读取 " + queryValues.size() + " 条查询数据");

            // 2. 根据读取的数据查询数据库
            List<List<String>> queryResults = queryDatabase(queryValues, querySql);
            System.out.println("数据库查询完成，共获取 " + queryResults.size() + " 条结果");

            // 3. 将结果导出为本地表格
            exportToExcel(queryResults, outputFilePath);
            System.out.println("结果已成功导出至：" + outputFilePath);

        } catch (Exception e) {
            System.err.println("执行失败：" + e.getMessage());
            e.printStackTrace();
        }
        List<String> queryValues = readTableColumn(inputFilePath, targetSheetIndex, targetColumn, startRow);
        System.out.println("成功读取 " + queryValues.size() + " 条查询数据");

// 打印读取到的数据
//        printData(queryValues, "读取到的查询数据");
    }

    /**
     * 读取表格文件中指定列的数据
     * @param filePath 表格文件路径（.xls或.xlsx）
     * @param sheetIndex 工作表索引（0开始）
     * @param columnIndex 目标列索引（0开始）
     * @param startRow 开始读取的行索引（0开始）
     * @return 列数据列表
     */
    private static List<String> readTableColumn(String filePath, int sheetIndex, int columnIndex, int startRow) throws IOException {
        List<String> values = new ArrayList<>();
        Workbook workbook = null;
        FileInputStream fis = null;

        try {
            // 读取文件流
            fis = new FileInputStream(filePath);
            // 自动识别Excel版本（.xls/.xlsx）
            workbook = WorkbookFactory.create(fis);

            // 获取目标工作表
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            if (sheet == null) {
                throw new RuntimeException("工作表索引 " + sheetIndex + " 不存在");
            }

            // 遍历行（从startRow开始）
            for (int rowNum = startRow; rowNum <= sheet.getLastRowNum(); rowNum++) {
                Row row = sheet.getRow(rowNum);
                if (row == null) continue; // 跳过空行

                // 获取指定列的单元格
                Cell cell = row.getCell(columnIndex);
                if (cell == null) continue; // 跳过空单元格

                // 转换单元格值为字符串（兼容各种类型）
                String cellValue = getCellStringValue(cell);
                if (cellValue != null && !cellValue.trim().isEmpty()) {
                    values.add(cellValue.trim());
                }
            }
        } finally {
            // 关闭资源
            if (workbook != null) workbook.close();
            if (fis != null) fis.close();
        }
        return values;
    }
    private static void printData(List<String> data, String title) {
        System.out.println(title + " (共" + data.size() + "条):");
        for (int i = 0; i < data.size(); i++) {
            System.out.println("  [" + i + "] " + data.get(i));
        }
        System.out.println();
    }
    /**
     * 将Excel单元格值转换为字符串（处理不同数据类型）
     */
    private static String getCellStringValue(Cell cell) {
        if (cell == null) return null;

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                // 处理数字和日期（Excel日期存储为数字）
                if (DateUtil.isCellDateFormatted(cell)) {
                    return new java.text.SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue());
                } else {
                    // 数字转字符串（避免科学计数法）
                    double num = cell.getNumericCellValue();
                    return num == (long) num ? String.valueOf((long) num) : String.valueOf(num);
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                // 公式单元格取计算结果
                return getCellStringValue(cell.getSheet().getWorkbook().getCreationHelper().createFormulaEvaluator().evaluateInCell(cell));
            default:
                return null;
        }
    }

    /**
     * 根据读取的列数据查询数据库
     * @param queryValues 查询参数列表（表格中读取的列值）
     * @param sql 查询SQL（包含?占位符）
     * @return 查询结果（二维列表，每行包含原始查询值+数据库字段值）
     */
    private static List<List<String>> queryDatabase(List<String> queryValues, String sql) throws SQLException {
        List<List<String>> results = new ArrayList<>();

        // 自动关闭资源（try-with-resources）
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            for (String value : queryValues) {
                pstmt.setString(1, value); // 设置SQL中的第一个占位符（根据实际占位符数量调整）

                // 执行查询并处理结果
                try (ResultSet rs = pstmt.executeQuery()) {
                    ResultSetMetaData metaData = rs.getMetaData();
                    int columnCount = metaData.getColumnCount(); // 数据库返回的字段数量

                    while (rs.next()) {
                        List<String> row = new ArrayList<>();
                        row.add(value); // 保留原始查询值，方便对照

                        // 读取数据库返回的每个字段
                        for (int i = 1; i <= columnCount; i++) {
                            row.add(rs.getString(i) == null ? "" : rs.getString(i));
                        }
                        results.add(row);
                    }
                }
            }
        }
        return results;
    }

    /**
     * 将查询结果导出为Excel表格
     * @param data 要导出的数据（二维列表）
     * @param outputPath 导出文件路径（.xlsx格式）
     */
    private static void exportToExcel(List<List<String>> data, String outputPath) throws IOException {
        // 创建.xlsx格式的工作簿
        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            // 创建工作表
            Sheet sheet = workbook.createSheet("查询结果");

            // 1. 定义单元格样式
            CellStyle headerStyle = createHeaderStyle(workbook);   // 表头样式
            CellStyle dataStyle = createDataStyle(workbook);       // 数据样式

            // 2. 写入表头
            if (!data.isEmpty()) {
                Row headerRow = sheet.createRow(0);
                // 表头内容（第一列为原始查询值，其他列从数据库字段名获取）
                headerRow.createCell(0).setCellValue("原始查询值");
                headerRow.getCell(0).setCellStyle(headerStyle);

                // 注：如果需要动态获取数据库字段名作为表头，需在查询时保存metaData信息
                // 此处简化处理，使用"查询结果1、2..."作为表头
                for (int i = 1; i < data.get(0).size(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue("查询结果" + i);
                    cell.setCellStyle(headerStyle);
                }
            }

            // 3. 写入数据行
            for (int rowIdx = 0; rowIdx < data.size(); rowIdx++) {
                List<String> rowData = data.get(rowIdx);
                Row row = sheet.createRow(rowIdx + 1); // 从第2行开始（0是表头）

                for (int colIdx = 0; colIdx < rowData.size(); colIdx++) {
                    Cell cell = row.createCell(colIdx);
                    cell.setCellValue(rowData.get(colIdx));
                    cell.setCellStyle(dataStyle);
                    sheet.autoSizeColumn(colIdx); // 自动调整列宽
                }
            }

            // 4. 写入文件
            workbook.write(fos);
        }
    }

    /**
     * 创建表头样式（加粗、居中、带边框）
     */
    private static CellStyle createHeaderStyle(Workbook workbook) {
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 11);
        style.setFont(font);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        setCellBorder(style); // 添加边框
        return style;
    }

    /**
     * 创建数据样式（左对齐、带边框）
     */
    private static CellStyle createDataStyle(Workbook workbook) {
        CellStyle style = workbook.createCellStyle();
        style.setAlignment(HorizontalAlignment.LEFT);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        setCellBorder(style); // 添加边框
        return style;
    }

    /**
     * 为单元格添加边框
     */
    private static void setCellBorder(CellStyle style) {
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
    }
}