package d4_innerclass_04;

public class Demo1 {
    public static void main(String[] args) {

        Go(new Run(){
            @Override
            public void run() {
                System.out.println("123");
            }
        });
    }
    public static void Go(Run r){
        System.out.println("开始");
        r.run();
        System.out.println("结束");
    }
}
interface Run{
    void run();
}