package com.pqr.lesson27.io2.Test;

import java.io.*;

/**
 * @File：Test.java
 * @Date:2020-11-06 8:15 下午
 * @Author:pengquanrun
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.InputAndOutput();
        test.copyPic();
    }

    public void InputAndOutput(){
        InputStream inputStream = null;
        OutputStream outputStream = null;
        //字节流
        try {
            File file = new File("/Users/Pking/IdeaProjects/study_project/lesson26_io/src/com/pqr/lesson26/io/test.txt");
            inputStream = new FileInputStream(file);
            try {
                //返回文件的字节(b)总数
                //byte 字节
                int allBytes = inputStream.available();
                byte[] bytes = new byte[allBytes];
                inputStream.read(bytes);
                String s = new String(bytes,"UTF-8");
                String s1 = new String(bytes,"UNICODE");
                System.out.println("b" + bytes);
                System.out.println('s' + s);
                System.out.println("s1" + s1);
                //utf-8 中文是三个字节
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //无论如何都会被执行
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //拷贝一个图片到另外一个路径
    public void copyPic(){
        InputStream inputStream = null;
        OutputStream outputStream = null;
        //字节流
        try {
            File file = new File("/Users/Pking/IdeaProjects/study_project/lesson27_io2/src/com/pqr/lesson27/io2/homework/huanhuan.jpg");
            inputStream = new FileInputStream(file);


            try {
                //返回文件的字节(b)总数
                //byte 字节
                //方法一：读取全部
//                int allBytes = inputStream.available();
//                byte[] bytes = new byte[allBytes];
//                inputStream.read(bytes);
                //read读取所有字节到bytes数据中

                //方法二：kb写入
                byte[] bytes = new byte[1024];
                int len = 0;
                outputStream = new FileOutputStream("/Users/Pking/IdeaProjects/study_project/lesson27_io2/src/com/pqr/lesson27/io2/Test/huanhuan.jpg");
                while((len = inputStream.read(bytes)) != -1){
                    //写入
                    outputStream.write(bytes,0, len);

                }

                //输出流写入文件

                outputStream.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //无论如何都会被执行
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
