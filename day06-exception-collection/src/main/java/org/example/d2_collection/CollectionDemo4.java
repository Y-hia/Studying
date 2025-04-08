package org.example.d2_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<Movies> collection = new ArrayList<>();
        collection.add(new Movies("《战狼》", "吴京", 200));
        collection.add(new Movies("《长津湖》", "吴京、易烊千玺", 150));
        collection.add(new Movies("《高山下的花环》", "人名群众", 400));


        //1、lambda表达式遍历
        //第一种写法
        collection.forEach(new Consumer<Movies>() {
            @Override
            public void accept(Movies movies) {
                System.out.println(movies);
            }
        });
        //第二种写法
        collection.forEach(movies -> System.out.println(movies));
        //第三种写法
        collection.forEach(System.out::println);
    }
}
