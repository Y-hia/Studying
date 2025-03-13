package d4_innerclass_04;

/**
 * 认识匿名类
 * 匿名类就是一种特殊的局部内部类，为什么加匿名，指的是不需要为这个类定义名字
 * 1、特点：匿名类本质上就是一个子类，并会立即创建出一个子类对象 new Animals()
 * 2、作用：用于更方便地创建一个子类对象
 */
public class Test {
    public static void main(String[] args) {
        //因为Animals是一个抽象类，无法被实例化，所以需要使用匿名类
        //Animals a = new Animals();  报错
        //定义一个匿名类
        Animals a = new Animals(){
            @Override
            void Cry() {
                System.out.println("哈利法特");
            }
            /*
            匿名类反编译后的字节码：
            class Test$1 extends Animals {
            Test$1() {
                }

            void Cry() {
                System.out.println("哈利法特");
                }
            }
             */
        };
    }
}
//定义一个抽象类
abstract class Animals{
    //抽象方法
    abstract void Cry();
}

//定义一个子类
//class Dog extends Animals{
//    @Override
//    void Cry() {
//        System.out.println("汪汪汪");
//    }
//}
