package com.study.Static.Utils;

public class Account {
    public static final String username = "admin";
    public static final String password = "123456";


    public static String checkLogin(String username,String password){
        if (username.equals(Account.username) && password.equals(Account.password)){
            return "登录成功";
        }
        if (!username.equals(Account.username) && !password.equals(Account.password)){
            return "用户名错误和密码错误";
        }
        if (!username.equals(Account.username)){
            return "用户名错误";
        }
        return "密码错误";
    }
}
