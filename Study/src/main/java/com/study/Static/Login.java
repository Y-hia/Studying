package com.study.Static;

import com.study.Static.Utils.Account;
import com.study.Static.Utils.Captcha;

import java.util.Scanner;

public class Login {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println("六位纯数字的验证码: "+ Captcha.printCaptcha(args));
//        System.out.println("六位包含英文和数字的验证码: "+Captcha.generatorCaptcha(args));
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("账号: ");
            String account = scanner.next();
            System.out.println("密码: ");
            String password = scanner.next();
            System.out.println(Account.checkLogin(account,password));
            if(Account.checkLogin(account, password).equals("登录成功")){
                break;
            }
        }


    }


}
