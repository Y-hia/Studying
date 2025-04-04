package d5_regex;

import java.util.Scanner;

public class RegexTest1 {
    public static void main(String[] args) {
        //使用学习的正则表达式校验数据的准确性
        checkEmail();
    }

    private static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String email = sc.next();
        while (true){
           /*
             正则表达式含义：
                1、\\w: 表示字母、数字
                2、@: 表示@
                3、{2,10}: 表示长度在2-10之间
                4、(\\.\\w{2,5}){1,2}: 表示.com或.cn或.com.cn
            */
            if(email.matches("\\w{2,10}@\\w{1,10}(\\.\\w{2,5}){1,2}")) {
                System.out.println("邮箱正确");
                break;
            }else{
                System.out.println("你输入的邮箱格式错误，请重新输入：");
                email = sc.next();
            }
        }
    }
}
