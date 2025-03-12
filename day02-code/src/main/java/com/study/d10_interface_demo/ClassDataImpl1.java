package com.study.d10_interface_demo;

import java.util.ArrayList;

public class ClassDataImpl1 implements ClassData{

    private final ArrayList<Student> students;
    public ClassDataImpl1(ArrayList<Student> student) {
        this.students = student;
    }

    @Override
    public void printAllStudentInfo() {
        for (Student s : students) {
            System.out.println("姓名：" + s.getName() + " " + "性别：" + s.getSex() + " " + "分数：" + s.getScore());
        }
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
