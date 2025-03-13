package com.study.d9_arraylist.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Food> list = new ArrayList<>();
    public void start() {
        Menu m = new Menu();
        while (true) {
            System.out.println("输入操作");
            int option = sc.nextInt();
            switch(option) {
                case 1:
                    m.addFood();
                    break;
                case 2:
                    m.displayMenu();
                    break;
                case 3:
                    m.removeFood();
                    break;
                case 0:
                    System.out.println("程序退出");
                    return;
                default:
                    System.out.println("输入错误");
            }
        }
    }
    // 新增菜品的方法
    public void addFood() {
        Food f = new Food();
        System.out.println("请输入菜品名称：");
        f.setName(sc.next());
        System.out.println("请输入菜品价格：");
        f.setPrice(sc.nextDouble());
        sc.nextLine(); // 消耗掉上一次输入的换行符
        System.out.println("请输入菜品介绍：");
        f.setDesc(sc.nextLine());
        list.add(f);
        System.out.println("菜品添加成功！");
    }
    //展示菜品的方法
    public void displayMenu(){
        if(list.isEmpty()){
            System.out.println("暂无菜品");
        }else{
            for (int i = 0; i < list.size(); i++) {
                Food food = list.get(i);
                System.out.print("第"+(i+1)+"号菜品"+"菜品名称："+food.getName()+"，菜品价格："+food.getPrice()+"，菜品介绍："+food.getDesc());
                System.out.println();
            }
        }

    }
    //下架菜品的方法
    public void removeFood() {
        System.out.println("请输入要下架的菜品名称：");
        boolean found = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            Food food = list.get(i);
            if (food.getName().contains(sc.next())) {
                list.remove(i);
                System.out.println("删除成功");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("没有该菜品");
        }
    }

}
