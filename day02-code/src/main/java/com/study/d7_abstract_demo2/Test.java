package com.study.d7_abstract_demo2;

public class Test {
    public static void main(String[] args) {
        People p = new Teacher();
        p.write();
        People p1 = new Student();
        p.write();
    }
}
