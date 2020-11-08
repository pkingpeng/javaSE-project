package com.pqr.lesson26.io;

import java.io.File;

/**
 * @File：FileTest.java
 * @Date:2020-11-06 7:59 下午
 * @Author:pengquanrun
 */
public class FileTest {    //文件类File 常用方法
    public static void fileTest(){
        File file = new File("/Users/pengquanrun/IdeaProjects/study_project/" +
                "lesson26_io/src/com/pqr/lesson26/io/test.txt");
        System.out.println(file.canExecute());
        //判断文件是否存在
        System.out.println(file.exists());
        //是否能读写
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        //获取文件名字
        System.out.println(file.getName());
        //获取文件长度（字节数）
        System.out.println(file.length());
        //输出完整路径
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        //判断是不是文件
        System.out.println(file.isFile());
        //判断是不是文件夹
        System.out.println(file.isDirectory());

    }

    public static void main(String[] args) {
        fileTest();
    }
}
