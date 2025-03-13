package d1_innerclass_01;

public class Test {
    //调用成员内部类：外部类.内部类 对象名 = new 外部类().new 内部类();
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        inner.run();
    }
}
