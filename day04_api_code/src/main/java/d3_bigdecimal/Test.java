package d3_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        //学会处理浮点型运算失真的问题
        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);//输出为 0.30000000000000004
        //解决方法一：使用BigDecimal，把两个数据包装成BigDecimal对象
        //不推荐使用此种方法，因为double类型本身就存在精度问题，这个只是为了解决大数字运算
        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);
        System.out.println(a1.add(b1));//输出为 0.3000000000000000166533453693773481063544750213623046875
        // public BigDecimal(String val)：这个接受字符串的对象才可以解决运算失真的问题
        BigDecimal a2 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));
        BigDecimal sum = a1.add(b2);
        double c2 = sum.doubleValue();// 把BigDecimal对象转换成double类型，因为实际开发场景中，BigDecimal只是处理数据的手段，真正承载数据的还是 double类型
        System.out.println(c2);//输出为 0.3
        //但是阿里巴巴不推荐用 BigDecimal(String val)
        BigDecimal a3 = BigDecimal.valueOf(a);
        BigDecimal b3 = BigDecimal.valueOf(b);
        double c3 = sum.doubleValue();
        System.out.println(c3);
        //调用方法进行运算
        BigDecimal c4 = a3.add(b3);//加
        System.out.println(c4);
        BigDecimal c5 = a3.subtract(b3);//减
        System.out.println(c5);
        BigDecimal c6 = a3.multiply(b3);//乘
        System.out.println(c6);
        BigDecimal c7 = a3.divide(b3, 2, RoundingMode.HALF_UP);//除法，参数为：除数，保留位数，舍入模式
        System.out.println(c7);

    }

}