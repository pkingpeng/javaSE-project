package com.pqr.lesson19.exception.homework.hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

/**
 * @file: Test.java
 * @time: 2020/11/3 10:53 PM
 * Author by pengquanrun
 *
 *
 * 已知如下：
 * 下表为某班级四次考试成绩单，
 * 1. 要求使用HashMap<String, Integer>存储每次考试的成绩（key键为姓名，value为成绩）。
 * 2. 要求使用LinkedList存储考试次数，有几次考试就有几个HashMap
 * 3. 注意：后台用户是知道学生姓名的
 * 形式如：LinkedList<HashMap<String, Integer>>
 * 姓名	第一次考试成绩	第二次考试成绩	第三次考试成绩	第四次考试成绩
 * 张三	80	        88	        86	        88
 * 李四	65	        75	        67	        80
 * 王五	35	        45	        55	        59
 * 薛六	90	        92	        98	        88
 * 赵七	70	        75	        65	        68
 *
 * 要求是实现的功能
 * （1）查询某次考试的总成绩？（具体考试次数由后台用户输入Scanner决定）。
 * （2）查询某个学生的总成绩？（具体学生由后台用户输入Scanner决定）。
 * （3）查询某个学生的平均成绩？（具体学生由后台用户输入Scanner决定）。
 * （4）查询全班平均分最高的一次考试成绩是哪次，并输出平均成绩的具体值。
 * （5）查询某个学生的某次考试成绩（学生姓名和考试次数均由后台用户输入）。
 *
 * 提示：
 * 例如第一次考试成绩，应该存储为如下格式：
 * HashMap<String, Integer> m = new HashMap<String, Integer>();
 * m.put(“张三”, 80);
 * m.put(“李四”, 65);
 * m.put(“王五”, 35);
 * m.put(“薛六”, 90);
 * m.put(“赵七”, 70);
 *
 */
public class Test{
    static LinkedList<HashMap<String,Integer>> testList = new LinkedList<HashMap<String, Integer>>();

    public static void main(String[] args) {

        //第一次考试
        HashMap<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("zhangsan", 80);
        m1.put("lisi", 65);
        m1.put("wangwu", 35);
        m1.put("xueliu", 90);
        m1.put("zhaoqi", 70);

        HashMap<String, Integer> m2 = new HashMap<String, Integer>();
        m2.put("zhangsan", 88);
        m2.put("lisi", 75);
        m2.put("wangwu", 45);
        m2.put("xueliu", 92);
        m2.put("zhaoqi", 75);

        HashMap<String, Integer> m3 = new HashMap<String, Integer>();
        m3.put("zhangsan", 86);
        m3.put("lisi", 67);
        m3.put("wangwu", 55);
        m3.put("xueliu", 98);
        m3.put("zhaoqi", 65);

        HashMap<String, Integer> m4 = new HashMap<String, Integer>();
        m4.put("zhangsan", 88);
        m4.put("lisi", 80);
        m4.put("wangwu", 59);
        m4.put("xueliu", 88);
        m4.put("zhaoqi", 68);

        testList.add(m1);
        testList.add(m2);
        testList.add(m3);
        testList.add(m4);

        //(1)查询某次考试的总成绩？（具体考试次数由后台用户输入Scanner决定）
        System.out.println("请输入考试次数");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        HashMap<String, Integer> map = testList.get(userInput - 1);

        Set<String> set = map.keySet();
        int Sumoftest = 0;
        for(String s : set){
            int score = map.get(s);//s是key，score返回的value
            Sumoftest += score;
        }
        System.out.println("第" + userInput + "次考试的总成绩为："+Sumoftest);

        //（2）查询某个学生的总成绩？（具体学生由后台用户输入Scanner决定）
        int Sumofstudent = 0;
        System.out.println("请输入学生姓名：");
        String studenName = scanner.next();
        for(HashMap<String, Integer> oneMap: testList){
            Sumofstudent += oneMap.get(studenName);
        }
        System.out.println("学生" + studenName + "的总成绩为" + Sumofstudent);
        System.out.println();
    }
}
