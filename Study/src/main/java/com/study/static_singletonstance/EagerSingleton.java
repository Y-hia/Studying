package com.study.static_singletonstance;

public class EagerSingleton {

    public static EagerSingleton name;

    private EagerSingleton(){

    }

    public static EagerSingleton getName(){
        return  name;
    }
}
