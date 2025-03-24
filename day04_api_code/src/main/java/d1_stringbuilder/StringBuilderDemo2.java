package d1_stringbuilder;

/**
 * 什么时候该用 StringBuilder？
 * 1.字符串拼接，并且拼接次数很多，并且字符串较长的时候就用StringBuilder
 *
 */
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
//        System.out.println(num); 输出很卡
    }
}
