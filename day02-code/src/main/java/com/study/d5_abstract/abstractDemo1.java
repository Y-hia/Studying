package com.study.d5_abstract;

public class abstractDemo1 {

}
//定义一个抽象类
abstract class test{
    //定义一个抽象方法
    abstract void show();//抽象方法没有方法体，没有{}
}

class test2 extends test{
    //必须重写方法，不然这个类就是抽象类
    @Override
    void show() {
        System.out.println("test2");
    }
}