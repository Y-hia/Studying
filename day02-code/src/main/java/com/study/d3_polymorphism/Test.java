package com.study.d3_polymorphism;

/**
 * 在多态中实现子类独有的方法
 */

public class Test{
    public static void main(String[] args) {
        // 1. 使用instanceof判断类型，再强制转换
        Animal a = new Cat();
        if(a instanceof Cat){
            Cat c = (Cat) a;  // 向下转型
            c.catchMouse();   // 现在可以调用Cat独有的方法了
        }

        // 2. 在go方法中使用instanceof判断并调用特有方法
        go(new Animal());
        go(new Cat());
        go(new Dog());
    }
    
    public static void go(Animal a) {
        a.cry();  // 所有动物都能调用的方法
        
        // 判断具体类型并调用特有方法
        if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }else if(a instanceof Dog){
            Dog d = (Dog) a;
            d.watchDoor();
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