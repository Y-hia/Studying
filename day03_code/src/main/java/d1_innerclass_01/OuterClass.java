package d1_innerclass_01;

public class OuterClass {
    //外部类静态变量
    private static String dog = "狗子";
    //外部类静态方法
    private static void go(){
        System.out.println("开始跑");
    }

    //外部类的实例变量
    private String bord = "小鸟";
    //外部类实例方法
    private void fly(){
        System.out.println("开始飞");
    }
    //成员内部类
    public class InnerClass{
        public void run(){
            //内部类可以直接访问外部类的静态方法和静态变量
            go();
            System.out.println(dog+"跑的很快~~~~");
            //内部类可以直接访问外部类的实例方法和实例变量
            fly();
            System.out.println(bord+"飞的很高~~~~");
        }

    }
}
