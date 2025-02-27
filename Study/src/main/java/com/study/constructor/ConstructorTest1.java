package com.study.constructor;

public class ConstructorTest1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConstructorTest1(){

    }

    public ConstructorTest1(String name){
        this.name = name;
    }

}
