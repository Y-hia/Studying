package d3_method_reference;

public class Student{
    private String name;
    private int age;
    private  char gender;
    private  double height;

    public Student() {
    }

    public static int madeSort(Student o1,Student o2){
        return Double.compare(o1.getHeight(),o2.getHeight());
    }


    public Student(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    /**
     * 比较大小规则
     * 比较者：this
     * 被比较者：o
     */
//    @Override
//    public int compareTo(Student o) {
//        /**
//         *
//         * 官方规定：
//         * 1、如果左边比右边大，返回正整数
//         * 2、如果左边比右边小，返回负整数
//         * 3、如果左边等于右边，返回0
//         */
////        if(this.age > o.age){
////            return 1;
////        }if(this.age < o.age){
////            return -1;
////        }
////        return 0;
//        return this.age - o.age;//最便捷的写法
//
//    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                '}' +"\n";
    }
}

