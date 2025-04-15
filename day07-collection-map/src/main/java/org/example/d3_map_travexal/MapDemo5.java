package org.example.d3_map_travexal;

import java.util.*;

public class MapDemo5 {
    public static void main(String[] args) {
        //1、学习集合的嵌套
        Map<String, List<String>> map = new HashMap<>();
        //2、建立三个List集合，存入省份信息
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"孝感市","武汉市","黄冈市","宜昌市","恩施自治区");

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"南京市","扬州市","苏州市","无锡市","常州市");

        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"石家庄市","唐山市","邢台市","保定市","张家口市");
        //3、把三个List集合存入map集合中
        map.put("湖北省",list);
        map.put("江苏省",list2);
        map.put("河北省",list3);

        map.forEach((key,value) -> System.out.println(key + " " + value));
    }
}
