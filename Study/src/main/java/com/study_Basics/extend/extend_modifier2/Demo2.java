package com.study_Basics.extend.extend_modifier2;

import com.study_Basics.extend.extend_modifier1.Father;

public class Demo2 {
    public static void main(String[] args) {
        Father fu = new Father();
//        fu.privateMethod(); //报错
//        fu.Method(); //报错
//        fu.protectedMethod(); //报错
        fu.publicMethod();
    }
}
