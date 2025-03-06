package com.study_day01.extend.d2_extend_modifier2;

import com.study_day01.extend.d1_extend_modifier1.Father;

public class Son extends Father {
        public void print(){
//            privateMethod(); //报错
//            Method();  //报错
            protectedMethod();
            publicMethod();
        }
}
