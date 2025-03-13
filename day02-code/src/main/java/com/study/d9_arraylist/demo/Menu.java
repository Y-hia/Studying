package com.study.d9_arraylist.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Food> foodList = new ArrayList<>();

    public void start() {
        while (true) {
            displayMainMenu();
            int option = sc.nextInt();
            switch(option) {
                case 1:
                    addFood();
                    break;
                case 2:
                    displayMenu();
                    break;
                case 3:
                    removeFood();
                    break;
                case 4:
                    updateFood();
                    break;
                case 5:
                    searchFood();
                    break;
                case 0:
                    System.out.println("感谢使用，程序已退出");
                    return;
                default:
                    System.out.println("无效的选项，请重新输入");
            }
        }
    }

    // 显示主菜单
    private void displayMainMenu() {
        System.out.println("\n=== 欢迎使用餐厅菜品管理系统 ===");
        System.out.println("1. 新增菜品");
        System.out.println("2. 查看所有菜品");
        System.out.println("3. 下架菜品");
        System.out.println("4. 修改菜品");
        System.out.println("5. 搜索菜品");
        System.out.println("0. 退出系统");
        System.out.print("请输入您的选择：");
    }

    // 新增菜品
    private void addFood() {
        System.out.println("\n=== 新增菜品 ===");
        Food food = new Food();
        
        System.out.print("请输入菜品名称：");
        sc.nextLine(); // 清除缓冲区
        food.setName(sc.nextLine());
        
        while (true) {
            try {
                System.out.print("请输入菜品价格：");
                double price = sc.nextDouble();
                if (price <= 0) {
                    System.out.println("价格必须大于0，请重新输入");
                    continue;
                }
                food.setPrice(price);
                break;
            } catch (Exception e) {
                System.out.println("价格格式不正确，请输入有效的数字");
                sc.nextLine(); // 清除错误输入
            }
        }
        
        sc.nextLine(); // 清除缓冲区
        System.out.print("请输入菜品介绍：");
        food.setDesc(sc.nextLine());
        
        foodList.add(food);
        System.out.println("菜品添加成功！");
    }

    // 展示菜品
    private void displayMenu() {
        System.out.println("\n=== 菜品列表 ===");
        if (foodList.isEmpty()) {
            System.out.println("暂无菜品信息");
            return;
        }

        System.out.println("序号\t菜品名称\t\t价格\t\t描述");
        System.out.println("----------------------------------------");
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.printf("%d\t%-10s\t%.2f\t%s%n", 
                (i + 1), 
                food.getName(), 
                food.getPrice(), 
                food.getDesc());
        }
    }

    // 下架菜品
    private void removeFood() {
        System.out.println("\n=== 下架菜品 ===");
        if (foodList.isEmpty()) {
            System.out.println("暂无菜品可下架");
            return;
        }

        displayMenu();
        System.out.print("请输入要下架的菜品序号：");
        try {
            int index = sc.nextInt() - 1;
            if (index >= 0 && index < foodList.size()) {
                Food removedFood = foodList.remove(index);
                System.out.println("已成功下架菜品：" + removedFood.getName());
            } else {
                System.out.println("无效的序号！");
            }
        } catch (Exception e) {
            System.out.println("输入格式错误！");
            sc.nextLine(); // 清除错误输入
        }
    }

    // 新增：修改菜品信息
    private void updateFood() {
        System.out.println("\n=== 修改菜品 ===");
        if (foodList.isEmpty()) {
            System.out.println("暂无菜品可修改");
            return;
        }

        displayMenu();
        System.out.print("请输入要修改的菜品序号：");
        try {
            int index = sc.nextInt() - 1;
            if (index >= 0 && index < foodList.size()) {
                Food food = foodList.get(index);
                sc.nextLine(); // 清除缓冲区
                
                System.out.print("请输入新的菜品名称（直接回车保持不变）：");
                String newName = sc.nextLine();
                if (!newName.trim().isEmpty()) {
                    food.setName(newName);
                }

                System.out.print("请输入新的价格（输入0保持不变）：");
                double newPrice = sc.nextDouble();
                if (newPrice > 0) {
                    food.setPrice(newPrice);
                }

                sc.nextLine(); // 清除缓冲区
                System.out.print("请输入新的描述（直接回车保持不变）：");
                String newDesc = sc.nextLine();
                if (!newDesc.trim().isEmpty()) {
                    food.setDesc(newDesc);
                }

                System.out.println("菜品信息已更新！");
            } else {
                System.out.println("无效的序号！");
            }
        } catch (Exception e) {
            System.out.println("输入格式错误！");
            sc.nextLine(); // 清除错误输入
        }
    }

    // 新增：搜索菜品
    private void searchFood() {
        System.out.println("\n=== 搜索菜品 ===");
        if (foodList.isEmpty()) {
            System.out.println("暂无菜品信息");
            return;
        }

        sc.nextLine(); // 清除缓冲区
        System.out.print("请输入要搜索的菜品名称关键词：");
        String keyword = sc.nextLine().toLowerCase();
        
        boolean found = false;
        System.out.println("搜索结果：");
        System.out.println("----------------------------------------");
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            if (food.getName().toLowerCase().contains(keyword)) {
                System.out.printf("%d\t%-10s\t%.2f\t%s%n", 
                    (i + 1), 
                    food.getName(), 
                    food.getPrice(), 
                    food.getDesc());
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("未找到匹配的菜品");
        }
    }
}
