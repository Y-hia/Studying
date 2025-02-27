package com.study.Array;

public class Login {
    public static void main(String[] args) {

        System.out.println("六位纯数字的验证码: "+Captcha.printCaptcha(args));
        System.out.println("六位包含英文和数字的验证码: "+Captcha.generatorCaptcha(args));
    }
}
