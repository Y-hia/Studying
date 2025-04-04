package d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest5 {
    public static void main(String[] args) {
        String data = "欢迎张全蛋光临本系统！他删库并跑路欢迎李二狗子光临本系统！" +
                " 欢迎马六子光临本系统！它浏览了很多好看的照片！欢迎夏洛光临本系统！他在六点钟送出了一个嘉年华!";
        Crawling(data, "欢迎(.*)光临");//贪婪匹配，匹配到最远
        System.out.println("-----------------------");
        Crawling(data, "欢迎(.*?)光临");//非贪婪匹配，匹配到最短
    }
    public static void Crawling(String data, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(data);
        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
