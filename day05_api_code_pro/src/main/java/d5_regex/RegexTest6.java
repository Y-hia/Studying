package d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest6 {
    public static void main(String[] args) {
        String s1 = "古力娜扎i8888迪丽热巴99fafas9aa5566马尔扎哈fbbADFFfsfs42425卡尔扎巴";
        //1、将名称中间的字符替换为 -
        String data = s1.replaceAll("\\w+", "-");
        System.out.println(data);
        System.out.println("---------");
        //2、获取信息中的姓名
        String[] name = s1.split("\\w+");
        for (String s : name) {
            System.out.println(s);
        }
    }
}
