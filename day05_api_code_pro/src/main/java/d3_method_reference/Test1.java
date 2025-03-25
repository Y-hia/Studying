package d3_method_reference;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        stu[0] = new Student("张三", 23, '男', 1.78);
        stu[1] = new Student("李四", 19, '女', 1.67);
        stu[2] = new Student("王五", 17, '男', 1.83);
        stu[3] = new Student("赵六", 45, '女', 1.72);
        stu[4] = new Student("孙七", 18, '男', 1.75);
        //最基本的写法
        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        //lambda简化后，格式：（被重写方法的形参列表）-> {被重写方法的方法体代码}
        Arrays.sort(stu,(o1,o2) -> Double.compare(o1.getHeight(),o2.getHeight()));

        //进一步简化后的
        Arrays.sort(stu,(o1,o2) -> Student.madeSort(o1,o2));
        /**
         * 静态方法引用：
         * 1、类名::方法名
         * 2、如果某个lambda表达式只是在调用一个静态方法，并且前后参数的形式一致，就可以使用静态方法引用
         */
        //静态方法引用后的终极简化代码
        Arrays.sort(stu,Student::madeSort);
        System.out.println(Arrays.toString(stu));

    }
}
