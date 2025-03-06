package com.study_day01.extend.d6_extend_constructors;

public class Test {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Wolf wolf1 = new Wolf("张三");
    }
}
class  Animal{

//父类的无参构造器已被注释
//    public  Animal(){
//        System.out.println("-------父类无参构造器---------");
//    }

    public  Animal(String name ){
        System.out.println("-------父类有参构造器---------" + name);
    }
}

class Wolf extends Animal{

    public Wolf(){
        super("张三"); //调用父类的有参构造器，不然会报错
        System.out.println("-------子类无参构造器------");
    }

    public Wolf(String name){
        super(name);//调用父类的有参构造器，不然会报错
        System.out.println("-------子类无参构造器------"+ name);
    }
}