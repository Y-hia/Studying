package d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，\n" +
                "电话: 18512516758, 18512508907\n" +
                "或者联系邮箱:  boniu@itcast.cn\n" +
                "座机电话: 01036517895, 010-98951256\n" +
                "邮箱: bozai@itcast.cn, \n" +
                "邮箱2: dlei0009@163.com, \n" +
                "热线电话: 400-618-9090, 400-618-4000, \n" +
                "4006184000, 4006189090\n";
        //1、定义爬取规则对象，封装要爬取的格式
        Pattern pattern = Pattern.compile("(\\w{2,10}@\\w{1,10}(\\.\\w{2,5}){1,2})|(1[3-9]\\d{9})|(400-?[2-9]\\d{2,3}-?[2-9]\\d{2,3})|(010-?\\d[1-9]{2,9})");
        //2、通过匹配规则对象 pattern 与内容 data 建立联系，得到一个匹配器对象
        Matcher matcher = pattern.matcher(data);
        //3、使用匹配器对象，开始爬取内容 (matcher.find() 官方定义的爬取方法，每次匹配成功返回true
        while (matcher.find()){
            //matcher.group() 获取爬取到的信息
            System.out.println(matcher.group());
        }
    }
}
