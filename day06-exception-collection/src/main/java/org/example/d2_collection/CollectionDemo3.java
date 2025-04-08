package org.example.d2_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<Movies> collection = new ArrayList<>();
        collection.add(new Movies("《战狼》", "吴京", 200));
        collection.add(new Movies("《长津湖》", "吴京、易烊千玺", 150));
        collection.add(new Movies("《高山下的花环》", "人名群众", 400));


        //1、增强for循环遍历，格式：for(元素的数据类型 变量名 : 数组或者集合)
        for (Movies movies : collection) {
            System.out.println(movies);
        }


    }
}
