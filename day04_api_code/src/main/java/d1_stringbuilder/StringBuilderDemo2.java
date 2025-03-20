package d1_stringbuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        String num = "123";
        for (int i = 0; i < 1000000; i++) {
            num += i ;
        }
//        System.out.println(num);
    }
}
