package org.example.d3_map_travexal;

import java.util.*;

public class MapDemo4 {
    public static void main(String[] args) {
        //目标：使用Map集合完成投票案例
        //1、创建一个景点数组
        String[] Attractions = {"东湖绿岛", "黄鹤楼", "江汉路", "光谷广场", "武汉大学"};
        //2、创建一个List集合，存储景点
        List<String> list = new ArrayList<>();
        //3、随机选择景点，把景点添加到List集合中
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(Attractions.length);
            list.add(Attractions[index]);
        }
        System.out.println(list);
        //4、创建一个Map集合，把景点作为key，value是景点出现的次数
        Map<String, Integer> map = new HashMap<>();
        //5、遍历list集合，得到每一个景点，然后判断Map集合中是否有这个景点，如果有，次数+1，如果没有，次数为1
        for (String s : list) {
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }
        }
        map.forEach((key,value)-> System.out.println(key + "想去的人数：" + value));
    }
}
