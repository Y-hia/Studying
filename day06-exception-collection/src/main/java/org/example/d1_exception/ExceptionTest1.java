package org.example.d1_exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // 报错：数组越界异常
//        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

        String name = null;
        //报错：空指针异常
//        System.out.println(name.length()); // NullPointerException

        //报错：数学处理异常
//        System.out.println( 10 / 0); //ArithmeticException

        //报错：类型转换异常
        Object str = "hello";
//        Integer num = (Integer)str; // ClassCastException

        //数字格式化异常
        String str1 = "123a";
//        int num = Integer.parseInt(str1); // NumberFormatException
    }
}
