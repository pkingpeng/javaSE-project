package com.pqr.lesson26.io;

import java.io.*;

/**
 * @File：Test.java
 * @Date:2020-11-06 7:13 下午
 * @Author:pengquanrun
 */
public class Test {



    public static void main(String[] args) {
         //writer 输入流
        //reader 输入流
        try {
            FileWriter fileWriter = new FileWriter(
                    "/Users/pengquanrun/IdeaProjects/study_project/" +
                            "lesson26_io/src/com/pqr/lesson26/io/test.txt",true);
            fileWriter.write("我是第二次新写入字符");
            fileWriter.close();

            FileReader fileReader = new FileReader(
                    "/Users/pengquanrun/IdeaProjects/" +
                    "study_project/lesson26_io/src/com/pqr/lesson26/io/test.txt");
            char[] c = new char[1024];
            fileReader.read(c);
            for(int i = 0; i < c.length; i++){
                System.out.print(c[i]);
            }
            //BufferedReader逐行处理 参数是一个reader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
