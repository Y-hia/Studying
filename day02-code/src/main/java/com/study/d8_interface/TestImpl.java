package com.study.d8_interface;

public class TestImpl implements A,B,C {

    @Override
    public void go() {
        System.out.println("go");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
