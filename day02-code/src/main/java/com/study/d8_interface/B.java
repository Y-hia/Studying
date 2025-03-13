package com.study.d8_interface;

/**
 * JDK8 以后接口新增了三种方法
 */
public interface B{
    void run();

    //默认方法，
    default void look() {

        test();
        System.out.println("吃东西");
    }
    //静态方法
    static void go() {
        System.out.println("去 somewhere");
    }
    //私有方法
    private void test() {
        System.out.println("test");
    }
}

