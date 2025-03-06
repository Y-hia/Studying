package com.study_Basics.basics.array;

import java.util.Random;
import java.util.Scanner;

public class RandomTest1 {
    public static void main(String[] args) {
        Random random = new Random();
        int LuckNumber= random.nextInt(100);
        System.out.println("LuckNumber = " + LuckNumber);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜测的数字");
            int guessNumber = scanner.nextInt();
            if( guessNumber == LuckNumber){
                System.out.println("恭喜你猜中了");
                break;
            }else if(guessNumber > LuckNumber){
                System.out.println("猜大了");
            }else {
                System.out.println("猜小了");
            }
        }

    }
}
