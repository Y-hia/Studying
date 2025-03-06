package com.study_Basics.extend.extend_modifier2;

import com.study_Basics.extend.extend_modifier1.Father;

public class Son extends Father {
        public void print(){
//            privateMethod(); //报错
//            Method();  //报错
            protectedMethod();
            publicMethod();
        }
}
