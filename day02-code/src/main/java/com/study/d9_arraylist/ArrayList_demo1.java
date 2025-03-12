package com.study.d9_arraylist;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayList_demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("BCD");
        list.add("CDE");
        list.add("DEF");
        list.add("EFG");

        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), "ABC")){
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            //判断集合中的元素是否包含C
            if(list.get(i).contains("C")){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
