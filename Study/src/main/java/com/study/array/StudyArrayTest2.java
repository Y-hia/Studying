package com.study.array;

import java.util.Scanner;

public class StudyArrayTest2 {
    /**
     * 输入6个学生成绩，求出平均分(动态给数组赋值)
     * @param args
     */
    public static void main(String[] args) {
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入你的分数");
            double TyScores = sc.nextDouble();
            scores[i] = TyScores;
        }

        double sum = 0;
        for (double score : scores) {
            sum = sum + score;
        }

        System.out.println("总分为" + sum + "\n平均分为" + sum / scores.length);
    }
}
