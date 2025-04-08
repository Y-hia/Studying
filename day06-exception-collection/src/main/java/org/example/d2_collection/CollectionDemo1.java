package org.example.d2_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //1、list集合对象：有序、可重复、有索引的
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("王五");
        list.add("丁飞");
        System.out.println(list);
        System.out.println(list.get(2));

        //2、set集合对象：无序、不可重复、无索引的
        HashSet<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("王五");
        set.add("丁飞");
        System.out.println(set);
//        set.get(1); 报错

    }
}
