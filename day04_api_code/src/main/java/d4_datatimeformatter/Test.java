package d4_datatimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        //DateTimeFormatter,格式化日期
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日  HH:mm:ss EEE a");
        //获取当前时间
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //格式化时间
        String result = dtf.format(ldt);
        System.out.println(result);
        //第二种格式化时间
        String result1 = dtf.format(ldt);ldt.format(dtf);
        System.out.println(result1);
        //解析时间
        String tima = "2025-03-22 02:32:36.946162";
        //第一步，必须创建一个跟时间格式一样的解析器
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.nnnnnn");
        LocalDateTime parse = LocalDateTime.parse(tima, dtf1);
        System.out.println(parse);
    }
}
