package com.study.d7_abstract_demo2;

public abstract class People {
    public void write(){
        System.out.println("\t\t\t《作文题目》");
        System.out.println("\t\t第一段介绍……");
        //正文 调用方法
        mainWrite();
        System.out.println("\t\t最后一段结尾…………");
    }

    public abstract void mainWrite();
}
