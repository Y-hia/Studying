package org.example.d2_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        //map集合的常见使用方法
        Map<String,Integer> map = new HashMap<>();
        map.put("张三", 100);
        map.put("李四", 90);
        map.put("王五", 80);
        map.put("赵六", 70);
        map.put("李四", 60);//键重复，值覆盖
        map.put("丁七", 80);

        //1、获取集合的大小
        System.out.println(map.size());
        //2、判断集合是否为空
        System.out.println(map.isEmpty());
        //3、清空集合
        //map.clear();
        System.out.println(map);
        //4、判断集合中是否包含指定的键
        System.out.println(map.containsKey("张三"));
        System.out.println(map);
        //5、根据键去获取对应的值
        System.out.println(map.get("李四"));
        //6、根据键去删除对应的值
        System.out.println(map.remove("赵六"));
        System.out.println(map.containsKey("赵六"));
        //7、判断集合中是否包含指定的值
        System.out.println(map.containsValue(80));
        //8、获取Map集合的所有键，到Set集合中返回
        System.out.println(map.keySet());
        //9、获取Map集合的所有值，到Collection集合中返回
        System.out.println(map.values());
    }
}
