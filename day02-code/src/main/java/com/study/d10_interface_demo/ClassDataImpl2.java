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
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        System.out.println("总分为："+sum);
    }
}
