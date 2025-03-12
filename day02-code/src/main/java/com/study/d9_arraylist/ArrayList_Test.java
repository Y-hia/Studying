package com.study.d9_arraylist;

import java.util.ArrayList;

public class ArrayList_Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1、添加元素
        list.add("张三");
        System.out.println(list);
        //2、指定下标添加元素
        list.addFirst("李四");
        System.out.println(list);
    }
}
