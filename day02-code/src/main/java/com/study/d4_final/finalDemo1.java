package com.study.d4_final;

public class finalDemo1 {

}
//1、final修饰类，类不能被继承
/*
final class a{}
class b extends a{} 报错，不能继承
*/

//2、final 修饰方法，方法不能被重写
/*
class a{
    public final void run(){}
}
class b extends a{
    @Override
    public void run(){ 报错，方法不能被重写
        System.out.println("b");
    }
}
*/
//3、final修饰变量
/**
 * 变量分为两种：
 *  1、成员变量 {静态变量、实例变量}
 *  2、局部变量
 */
//final修饰成员变量

//final修饰局部变量
class  a{
    public static void main(String[] args) {

        final int a1 = 123; //final修饰局部变量
//        a1 = 456; 报错，不能被修改
        buy(123);//这里已经确定a的值，所以可以final修饰
    }
    public static void buy(final int a){
//        a = 123; 报错，因为是局部变量，不能被修改
    }
}
//final修饰成员变量 {静态变量}
class a1{
    //static final修饰的称之为 常量，值只有一个，不能被修改，且变量都有大写字母组成
    public static final String NAME = "John";//final修饰 静态成员变量

    public static void main(String[] args) {
//        NAME = ""; 报错，不能被修改
    }
}
// final修饰成员变量 {成员变量}
class a2{
    public static void main(String[] args) {
        final String NAME = "John";//final修饰成员变量
//        NAME = ""; 报错，不能被修改
    }
}