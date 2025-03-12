package com.study.d9_arraylist;

import java.util.ArrayList;

public class ArrayList_Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1、添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        //2、指定下标添加元素
        list.add(1,"赵六");
        System.out.println(list);

        //3、删除元素，并返回真假，默认删除第一个符合条件的元素
        System.out.println(list.remove("张三"));
        System.out.println(list);

        //4、删除指定索引下的元素，并返回被删除的元素
        System.out.println(list.remove(1));
        System.out.println(list);

        //5、获取指定索引的元素
        System.out.println(list.get(1));

        //6、修改指定索引的元素
        list.set(1,"丁麻子");
        System.out.println(list);

    }
}
