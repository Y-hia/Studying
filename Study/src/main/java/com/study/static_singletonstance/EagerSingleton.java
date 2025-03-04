package com.study.static_singletonstance;

/**
 * 单例设计模式
 */
public class EagerSingleton {

    public static EagerSingleton name;

    private EagerSingleton(){

    }

    public static EagerSingleton getName(){
        return  name;
    }
}
