package com.study_day01.extend.d3_extend_feature;

public class Test {
    public static void main(String[] args) {

    }
    // 1、java是单继承的，不支持多继承，一个子类只能继承一个父类
//    class A{}
//    class B{}
//    class C extends A,B{} //报错
    //2、Java支持多层继承
    class A{}
    class B extends A{}
    class C extends B{}
    //3、Object是Java中所有类的父类，所以所有的类都是Object的子类
}
