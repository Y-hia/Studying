package org.example.d1_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StreamTest1 {
    public static void main(String[] args) {
        //目标：了解Stream流
        //1、将集合中所有以数字开头的数据提取出来，放入到新集合中。
        List<String> list = new ArrayList<>();
        list.add("123测试test");
        list.add("test测试123");
        list.add("测试123test");
        list.add("测试test123");
        list.add("456测试test");
        list.add(null);
        //2、创建一个新集合，用于存储满足条件的数据
        List<String> newlist = new ArrayList<>();
        for (String s : list) {
            if (startWithNumber(s)) {
                newlist.add(s);
            }
        }
        System.out.println(newlist);


        //使用stream流实现
        list.stream().filter(StreamTest1::startWithNumber).forEach(System.out::println);
    }
    //定义一个方法，判断字符串是否以数字开头
    public static boolean startWithNumber(String str){
        if (str == null || str.isEmpty()){
            return false;
        }
        return Pattern.matches("[0-9].*", str);
    }
}
