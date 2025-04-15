package org.example.d3_map_travexal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        // 遍历Map集合的第二种方式：键值对
        Map<String,Integer> map = new HashMap<>();
        map.put("xiaomi", 15);
        map.put("iphone", 16);
        map.put("oppo", 8);
        map.put("vivo", 200);
        map.put("huawei", 70);
        //调用Map集合的entrySet方法，将Map集合转换成Set集合来遍历
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
        // 遍历Set集合
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
