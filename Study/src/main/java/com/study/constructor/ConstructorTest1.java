package com.study.constructor;

public class ConstructorTest1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //无参构造方法
    public ConstructorTest1(){

    }
    //带参构造方法
    public ConstructorTest1(String name){
        this.name = name;
    }

}
