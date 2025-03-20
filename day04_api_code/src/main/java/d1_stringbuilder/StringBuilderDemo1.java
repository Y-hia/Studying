package d1_stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //目标：认识StringBuilder
        //1、创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        System.out.println(sb);
    }
}
