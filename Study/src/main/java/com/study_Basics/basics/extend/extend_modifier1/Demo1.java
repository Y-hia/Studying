package com.study_Basics.basics.extend.extend_modifier1;

public class Demo1 {
    public static void main(String[] args) {
        Father fu = new Father();
//            fu.privateMethod();//报错
        fu.Method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
