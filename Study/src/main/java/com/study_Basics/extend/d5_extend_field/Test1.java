package com.study_Basics.extend.d5_extend_field;

public class Test1 {
    /**
     *1、在子类方法中访问其他成员（成员变量、成员方法），是依照就近原则。
     *  先子类局部找、再子类成员找、再父类成员找、再父类局部找，找不到则报错
     *
     *2.如果子父类中都有同名的成员，则访问的是子类的成员。如果此时一定要访问父类成员
     * 可以通过super关键字，指定访问父类成员：super.成员变量/成员方法访问父类成员。
     */
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}


class Son extends Father {
    public int age = 20;
    public void print() {
        System.out.println(age);//子类 age
        //通过super关键字 调用父类成员变量
        System.out.println(super.age);//父类 age
    }
}

class Father {
    public int age = 40;
    public void print() {
        System.out.println(age);
    }
}
