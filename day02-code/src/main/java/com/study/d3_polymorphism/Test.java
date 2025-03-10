package com.study.d3_polymorphism;

import java.util.Date;

/**
 * 搞清楚多态下的类型转换问题
 */

public class Test{
    public static void main(String[] args) {

        Animal a = new Dog();
            /*
            Cat c = (Cat)a;
            c.catchMouse();
            编辑不报错，但是运行报错: Dog cannot be cast to class com.study.d3_polymorphism.Cat
            所以在强转前要判断一下对象的类型是不是正确的
            */
        go(new Cat());
        go(new Dog());
    }
    public static void go(Animal a) {
        if(a instanceof Dog){//判断一下对象的类型是不是Dog,是就进行强制类型转换
            Dog d = (Dog)a;
            d.cry();
            d.watchDoor();
            System.out.println("----------------");
        }else if(a instanceof Cat){//同理
            Cat c = (Cat)a;
            c.cry();
            c.catchMouse();
            System.out.println("----------------");
        }
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
    //子类独有的方法 watchDoor，多态下不能调用
    public void watchDoor(){
        System.out.println("狗会看门");
    }
}