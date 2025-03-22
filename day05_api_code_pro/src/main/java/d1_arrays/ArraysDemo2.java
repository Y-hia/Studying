package d1_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        Student[] stu = new Student[4];
        stu[0] = new Student("张三", 23, '男', 1.78);
        stu[1] = new Student("李四", 19, '女', 1.67);
        stu[2] = new Student("王五", 17, '男', 1.83);
        stu[3] = new Student("赵六", 45, '女', 1.72);
//        Arrays.sort(stu);//排序报错

        //自定义排序1、让对象所在类实现比较规则接口：Comparable，重写compareTo方法,指定比较规则
        Arrays.sort(stu);
        //自定义排序2、sort存在重载的方法，支持自带Comparator比较器来直接指定比较的规则
        Arrays.sort(stu, new Comparator<Student>() {
            //用年龄比较
            @Override
            public int compare(Student o1, Student o2) {
                return  o2.getAge() - o1.getAge();
            }
        });

        Arrays.sort(stu, new Comparator<Student>() {
            //用年龄比较
            @Override
            public int compare(Student o1, Student o2) {
                //按身高排序
//                if (o1.getHeight() > o2.getHeight()) {
//                    return 1;
//                }
//                if (o1.getHeight() < o2.getHeight()) {
//                    return -1;
//                }
//                return 0;
                return Double.compare(o2.getHeight() , o1.getHeight()); //高级的写法
            }
        });

        System.out.println(Arrays.toString(stu));
    }

}
