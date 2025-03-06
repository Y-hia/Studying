package com.study_Basics.basics.static_code;
import java.util.ArrayList;

/**
 * 静态代码块，在类加载的时候时会执行一次
 */
public class CodeTest1 {

    public static ArrayList<String> names = new ArrayList<>();

    static{
        System.out.println("静态代码块被执行一次");
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
    }

    public static void main(String[] args) {
        System.out.println("main方法被执行");
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        System.out.println(names);
    }
}
