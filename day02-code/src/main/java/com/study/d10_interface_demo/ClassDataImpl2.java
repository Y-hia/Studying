package com.study.d10_interface_demo;

import java.util.ArrayList;

public class ClassDataImpl2 implements ClassData{
    private final ArrayList<Student> students;
    public ClassDataImpl2(ArrayList<Student> student) {
        this.students = student;
    }

    @Override
    public void printAllStudentInfo() {
        int count = 0;
        for (Student s : students) {
            if(s.getSex() == '男') count++;
            System.out.println("姓名：" + s.getName() + " " + "性别：" + s.getSex() + " " + "分数：" + s.getScore());
        }
        System.out.println("男学生數量："+count);
        System.out.println("女学生數量："+(students.size()-count));
    }

    @Override
    public void printStudentScore() {
        Student s1 = students.getFirst();
        double avg = s1.getScore();;
        double max = avg;
        double min = avg;
        double sum = 0;
        for (Student s : students) {
            if (s.getScore() > max){
                max = s.getScore();
            }
            if(s.getScore() < min){
                min = s.getScore();
            }
            sum += s.getScore();
        }
        System.out.println("最高分为："+max+","+"最低分为："+min+","+"平均分为："+((sum-max-min)/(students.size()-2)));
    }
}
