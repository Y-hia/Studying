package com.study;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 12;
//        Test t = new Test();
        int [] result = twoSum(nums,target);
        if (result.length >0){
            System.out.println(Arrays.toString(result));
        }else {
            System.out.println("没有满足条件的值");
        }
    }

    public static int[] twoSum(int [] nums,int target){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
