package com.study_day01.static_code;

import java.util.ArrayList;

/**
 * 实例代码块，每次创建对象时都会执行一次
 */
public class CodeTest2 {
    public static ArrayList<String> names = new ArrayList<>();
    {
        System.out.println("实例代码块");
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
    }

    public static void main(String[] args) {

    }
}
