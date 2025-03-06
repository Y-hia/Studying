package com.study_Basics.static_utils;

public class AccountUtils {
    public static final String username = "admin";
    public static final String password = "123456";


    public static String checkLogin(String username,String password){
        if (username.equals(AccountUtils.username) && password.equals(AccountUtils.password)){
            return "登录成功";
        }
        if (!username.equals(AccountUtils.username) && !password.equals(AccountUtils.password)){
            return "用户名错误和密码错误";
        }
        if (!username.equals(AccountUtils.username)){
            return "用户名错误";
        }
        return "密码错误";
    }
}
