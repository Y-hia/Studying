package com.study.Array;

import java.util.Random;

public class Captcha {
    /**
     * 验证码
     * @param args
     * @return 6位数的验证码
     */
    public static String printCaptcha(String[] args) {
        Random random = new Random();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < 6; i++) {
           int num = random.nextInt(10);
           number.append(num);
        }
        return number.toString();
    }

    public static String generatorCaptcha(String[] args) {

        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(charSet.length());
            captcha.append(charSet.charAt(index));
        }

        return captcha.toString();
    }



}

