package com.study.d6_abstract_demo;

public class test {
    public static void main(String[] args) {
        Animal a = new cat();
        a.cry();
        Animal a2 = new Dog();
        a2.cry();
    }
}

abstract class Animal {
    //方法体无意义时可以不写（简化代码），强制子类重写（更好的支持多态）
    abstract void cry();
}
class cat extends Animal{
    @Override
    void cry() {
        System.out.println("喵喵喵");
    }
}
class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("汪汪汪");
    }
}