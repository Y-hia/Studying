package org.example.d2_file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //目标：掌握File对象的创建，来代表具体的文件
        //1、创建File对象
        //第一种写法 正斜杠
        File f1 = new File("C:\\Users\\23523\\Pictures\\Screenshots\\Apex.png");
        //第二种写法 反斜杠
        File f2 = new File("C://Users//23523//Pictures//Screenshots//Apex.png");
        //第三种写法 separator 自动适配分隔符
        File f3 = new File("C:" + File.separator + "Users" + File.separator + "23523" + File.separator + "Pictures" + File.separator + "Screenshots" + File.separator + "Apex.png");
        System.out.println(f1.length());//输出文件的大小，单位是字节
        System.out.println(f2.length());
        System.out.println(f3.length());
        //2、Filed对象可以代表文件，也可以代表文件夹。
        File f4 = new File("C:\\Users\\23523\\Pictures\\Screenshots");
        System.out.println(f4.length());//输出文件夹的大小，不包含文件夹里面的文件大小，单位是字节
        //3、File对象代表的文件路径是可以不存在的
        File f5 = new File("C:\\Users\\23523\\Pictures\\Screenshots123123");
        System.out.println(f5.length());
        //4、File对象的文件路径可以支持绝对路径和相对路径。
        // 相对路径：相对当前项目路径的相对路径。
        File f6 = new File("C:\\Users\\23523\\Pictures\\Screenshots");
        // 绝对路径：从盘符开始到文件或文件夹的路径。一般是用来找项目中的资源文件。绝对的重点
        File f7 = new File("day08-stream-file-io/src/main/java/org/example/Main.java");
        System.out.println(f7.length());
    }
}
