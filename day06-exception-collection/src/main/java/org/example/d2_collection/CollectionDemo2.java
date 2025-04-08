package org.example.d2_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Movies> collection = new ArrayList<>();
        collection.add(new Movies("《战狼》", "吴京", 200));
        collection.add(new Movies("《长津湖》", "吴京、易烊千玺", 150));
        collection.add(new Movies("《高山下的花环》", "人名群众", 400));


        //1、迭代器遍历、依次获取集合中的每一个元素，如果打印超出集合长度，就会报错
        Iterator<Movies> iterator = collection.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
//        System.out.println(iterator.next()); 会报错
        // 防止报错，可以在循环中使用迭代器自己的方法 hasNext进行判断，如果还有元素，就继续获取，如果没有元素了，就结束循环
        while (iterator.hasNext()){
            Movies s = iterator.next();
            System.out.println(s);
        }
    }
}
