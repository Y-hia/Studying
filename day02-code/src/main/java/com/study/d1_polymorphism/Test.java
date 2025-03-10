package com.study.d1_polymorphism;
/**
 * 主要是理解多态，多态的实现方式，多态的优缺点
 */
public class Test {
    public static void main(String[] args) {
        // 多态分为两种：对象多态、行为多态
        // 对象多态：父类引用指向子类对象
        // 行为多态：父类引用指向子类对象，调用子类的方法
        Animal a = new Cat();
        a.cry(); // 编译看左，运行看右边 输出：🐱是喵喵喵的叫
        System.out.println(a.name); // 变量没有多态性，编译看左，运行也看左 输出：动物

        Animal a1 = new Dog();
        a1.cry(); // 编译看左，运行看右边 输出：🐕是汪汪汪的叫
        System.out.println(a1.name);
    }
}

class Animal {
    String name = "动物";
    public void cry() {
        System.out.println("动物都会叫");
    }
}

class Cat extends Animal {
    String name = "猫猫";
    @Override
    public void cry() {
        System.out.println("🐱是喵喵喵的叫");
    }
}

class Dog extends Animal {
    String name = "狗狗";
    @Override
    public void cry() {
        System.out.println("🐕是汪汪汪的叫");
    }
}