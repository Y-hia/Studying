package d4_sf;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,9,11,34,56,78,90,100,132,144,155};
        System.out.println("输入你想要查找的数字");
        int number = scanner.nextInt();
        int index = searchNumber(arr, number);
        if(index == -1){
            System.out.println("没有这个数字");
        }
        System.out.println("数字"+number+"的索引位置在"+index);
    }


    public static int searchNumber(int[] arr,int number){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int middle = (left + right) / 2;

            if(number > arr[middle]){
                left = middle + 1;
            }else if(number < arr[middle]){
                right = middle - 1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}

