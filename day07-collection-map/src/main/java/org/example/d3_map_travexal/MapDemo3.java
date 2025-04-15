package org.example.d3_map_travexal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式：lambda 表达式
        Map<String,Integer> map = new HashMap<>();
        map.put("xiaomi", 15);
        map.put("iphone", 16);
        map.put("oppo", 8);
        map.put("vivo", 200);
        map.put("huawei", 70);

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + " " + value);
            }
        });
        // lambda表达式
        map.forEach((String key, Integer value)->System.out.println(key + " " + value));
    }
}
