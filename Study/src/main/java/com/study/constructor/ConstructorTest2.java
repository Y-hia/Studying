package com.study.constructor;

public class ConstructorTest2 {

    public static void main(String[] args) {
        ConstructorTest1 constructorTest1 = new ConstructorTest1();
        System.out.println(constructorTest1);
        System.out.println(constructorTest1.getName());
        constructorTest1.setName("张三");
        System.out.println(constructorTest1.getName());

        ConstructorTest1 constructorTest2 = new ConstructorTest1("李四");
        constructorTest2.setName("张三");
        String currentName = constructorTest2.getName();
        System.out.println(currentName);
    }
}
