package com.study_day01.extend.d7_extend_this;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("雷军",56,"武汉大学");
        System.out.println(s.getName()+s.getAge()+"岁"+s.getSchool());

        Student s1 = new Student("张三",25);
        System.out.println(s1.getName()+s1.getAge()+"岁"+s1.getSchool());
    }
}


class  Student{
    private String name;
    private int age;
    private String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, int age) { //这里只定义了两个变量
        /**
         * 1、this()：调用本类的构造方法，this()必须放在构造方法的第一行，调用本类的构造方法，必须放在第一行，否则编译不通过
         * 2、this(...) super(...)都是调用构造方法的，不能同时存在
         */
        this(name,age,"社会大学");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}