package d1_arrays;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //1、输出数组
        int[] arr = {22,12,43,64,55,89};
        System.out.println(arr); //输出的是数组地址
        System.out.println(Arrays.toString(arr));//输出数组内容
        //2、复制数组
        int[] arr2 = Arrays.copyOfRange(arr, 0, 4); //包前不包后
        System.out.println(Arrays.toString(arr2));
        //3、扩容数组
        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3));
        //4、修改数组
        Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int index) {
                return arr[index] + 10;
            }
        });
        //使用lambda表达式简化后的代码
        Arrays.setAll(arr, (int index) -> arr[index] + 10);

        System.out.println(Arrays.toString(arr));
        //5、排序数组
        Arrays.sort(arr); //升序排列
        System.out.println(Arrays.toString(arr));
    }
}
