package com.study.d8_interface;

/**
 * 接口：1.8之前的接口，只能定义常量和抽象方法
 * 接口不能创建的对象，接口都是用来被实现（implements）的，实现接口的类一半都称之为 实现类
 */
public interface A {
    //public static final String NAME=  null ;
    String NAME = null ; // 常量，可以省略 public static final

    //public abstract void go();
    void go(); // 抽象方法，可以省略 public abstract
}

