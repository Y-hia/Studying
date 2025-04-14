package org.example.d2_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        //map体系整体特点：键值对，键唯一，值可以重复，键和值都可以为null。无序，不重复，无索引
        Map<String,Integer> map = new HashMap<>();
        map.put("张三", 100);
        map.put("李四", 90);
        map.put("王五", 80);
        map.put("赵六", 70);
        map.put("李四", 60);//键重复，值覆盖
        map.put("丁七", 80);
        System.out.println(map);
    }
}
