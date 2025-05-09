package d1_stringbuilder;

/**
 * 学习StringBuilder
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 添加数据
        sb.append("hello");
        sb.append("world");
        //链式拼接
        sb.append("java").append("你好");
        System.out.println(sb);
        // 反转数据
        System.out.println(sb.reverse());
        // 修改、替换数据
        sb.replace(0,3,"java");
        System.out.println(sb);
        // 删除数据
        sb.delete(0,3);
        System.out.println(sb);
        //获取长度
        System.out.println(sb.length());
        // 把StringBuilder转换成String类型
        String str = sb.toString();
        System.out.println(str);
    }
}
