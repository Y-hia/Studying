package d5_regex;

import java.util.Scanner;

public class RegexTest2 {
    public static void main(String[] args) {
        //使用学习的正则表达式校验数据的准确性
        checkPhoneNumber();
    }
    private static void checkPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNumber = sc.next();
        while (true){
           /*
             正则表达式含义：
                1、1 表示必须是1开头
                2、[3-9] 表示第二位数字必须是3到9之间的数字
                3、\\d{9} 表示后面的9位必须都是数字
                4、(\\.\\w{2,5}){1,2}: 表示.com或.cn或.com.cn
            */
            if(phoneNumber.matches("1[3-9]\\d{9}")) {
                System.out.println("手机号格式正确");
                break;
            }else{
                System.out.println("你输入的手机号错误，请重新输入：");
                phoneNumber = sc.next();
            }
        }
    }
}
