package org.example.d3_map_travexal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式，第一种：键找值
        Map<String,Integer> map = new HashMap<>();
        map.put("xiaomi", 15);
        map.put("iphone", 16);
        map.put("oppo", 8);
        map.put("vivo", 200);
        map.put("huawei", 70);

        //1、获取集合的全部键
        Set<String> Keys = map.keySet();
        //2、根据键提取值
        for (String key : Keys) {
            Integer i = map.get(key);
            System.out.println(key +" " + i);
        }
    }
}
