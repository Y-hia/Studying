package com.study_day01.arrayList;

import java.util.ArrayList;

public class ArrayList_study {
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
