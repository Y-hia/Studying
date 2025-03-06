package com.study_day01.extend.d5_extend_field;

public class Test2 {
    public static void main(String[] args) {
        Son2 s = new Son2();
        s.print();
        s.go();
//        s.super.print();//报错
    }
}

class Son2 extends Father2 {
    public int age = 20;

    @Override
    public void print() {
        System.out.println(age);//子类 age
        System.out.println(super.age);//父类 age
    }
    // 调用父类的方法，需要在子类中借助方法跳转，不能直接调用
    public void go(){
       super.print();
    }

}

class Father2 {
    public int age = 40;
    public void print() {
        System.out.println(age);
    }
}