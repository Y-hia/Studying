package com.study.Array;

public class Captcha {

    public static int roudm;

    public static String printCaptcha(String[] args) {
        String number = String.valueOf((int) (Math.random() * 10000));
        roudm ++;
        return number;
    }
}

