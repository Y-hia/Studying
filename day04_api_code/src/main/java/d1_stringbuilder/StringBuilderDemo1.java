package d1_stringbuilder;

/**
 * 学习StringBuilder
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        System.out.println(sb);

        System.out.println(sb.reverse());
    }
}
