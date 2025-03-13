package d2_innerclass_02;



class Test {
    //调用静态内部类：外部类.内部类 对象名 = new 外部类().new 内部类();
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.run();
    }
}


/**
 * 学习静态内部类
 */
public class OuterClass {
    //外部类静态变量
    private static String dog = "狗子1";
    //外部类静态方法
    private static void go(){
        System.out.println("开始跑");
    }
    //外部类的实例变量
    private String bord = "小鸟1";
    //外部类实例方法
    private void fly(){
        System.out.println("开始飞");
    }
    //静态内部类
    public static class InnerClass{
        public void run(){
            //静态内部类可以直接访问外部类的静态方法和静态变量
            go();
            System.out.println(dog+"跑的很快~~~~");
            //静态内部类不能直接访问外部类的实例方法和实例变量
//            fly(); 报错
//            System.out.println(bord +"飞的很高~~~~"); 报错
        }

    }
}


