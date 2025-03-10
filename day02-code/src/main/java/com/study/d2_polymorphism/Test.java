package com.study.d2_polymorphism;

/**
 * 多态的好处
 * 1、多态右边的对象是解耦合的，更便于扩展和维护
 * 多态的缺点
 * 1、多态的右边对象是强耦合的，一旦右边对象有变化，左边代码也要跟着变化
 * 2、多态下不能调用子类独有的方法
 */

public class Test{
    public static void main(String[] args) {

        go(new Animal());
        go(new Cat());
        go(new Dog());

        //调用子类独有的方法，会报错，无法调用
//        a.lookDoor();
//        a.catchMouse();
    }
    
    public static void go(Animal a) {
       a.cry();
    }
}

class Animal{
    public void cry(){
        System.out.println("动物都会叫");
    }
 }

 class Cat extends Animal{

    @Override
    public void cry(){
         System.out.println("🐱是喵喵喵的叫");
     }
     //子类独有的方法 catchMouse，多态下不能调用
     public void catchMouse(){
         System.out.println("猫会抓老鼠");
     }
 }

class Dog extends Animal{

    @Override
    public void cry(){
        System.out.println("🐕是汪汪汪的叫");
    }
    //子类独有的方法 lookDoor，多态下不能调用
    public void lookDoor(){
        System.out.println("狗会看门");
    }
}