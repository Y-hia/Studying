package d2_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        People p = new People() {
            @Override
            void eat() {
                System.out.println("是个人就会吃东西");
            }
        };
        /**
         * 错误示范，使用lambda表达式简化代码
         * 格式：（被重写方法的形参列表）-> {被重写方法的方法体代码}
         */
//        People p1 = () -> {
//                System.out.println("是个人就会吃东西"); 代码报错
//        };
//        p1.eat();
        /**
         * 正确示范，使用lambda表达式简化代码
         * 格式：（被重写方法的形参列表）-> {被重写方法的方法体代码}
         */
        //普通写法
//        ItWorker it = new ItWorker() {
//            @Override
//            public void work() {
//                System.out.println("IT工程师会写代码");
//            }
//        };
//        it.work();
        // 使用lambda表达式简化代码的写法
        ItWorker it1 = () -> {System.out.println("IT工程师会写代码");};
        it1.work();
    }
}
@FunctionalInterface //函数式接口的注解
interface ItWorker{
    void work();
}
abstract class People {
    abstract void eat();
}