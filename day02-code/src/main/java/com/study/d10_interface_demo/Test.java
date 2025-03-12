package com.study.d10_interface_demo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("張三", '男', 78.5));
        student.add(new Student("李四", '女', 35.8));
        student.add(new Student("王五", '男', 89.41));
        student.add(new Student("赵四", '男', 100));
        student.add(new Student("金六", '女', 90.99));
        student.add(new Student("银七", '女', 65.45));

        ClassData c = new ClassDataImpl2(student);
        c.printAllStudentInfo();
        c.printStudentScore();
    }
}
