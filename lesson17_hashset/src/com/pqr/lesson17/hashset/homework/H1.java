package com.pqr.lesson17.hashset.homework;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @file: H1.java
 * @time: 2020/11/1 8:44 PM
 * Author by pengquanrun
 *
 * 随机生成4个0到9的整数，组成一个序列（使用LinkedList<Integer>存储）
 * 例如：3  6  4  4
 *
 */
public class H1 {
    static LinkedList<Integer> intList = new LinkedList<Integer>();
    static LinkedList<String> historyList = new LinkedList<String>();
    static {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        int d = (int)(Math.random() * 10);
        intList.add(a);
        intList.add(b);
        intList.add(c);
        intList.add(d);
    }

    public static void h1(){
        for (int i :intList){
            System.out.print(i + " ");

        }
        System.out.println();
    }
    public static void h2(){
        //guess 10 times
        for(int i = 1; i <= 10; i++){
            System.out.println("请输入四个数字");
            Scanner scanner = new Scanner(System.in);

            //用户猜对的次数
            int count = 0;
            String UserGuess = "";
            for (int j = 0; j < 4; j++){
                int a = scanner.nextInt();
                if (j <= 2){
                    UserGuess += a + ",";
                }else{
                    UserGuess += a;
                }

                if(intList.get(j) == a){
                    count++;
                }
            }
            historyList.add(UserGuess);
            if(count == 4){
                System.out.println("游戏结束，你猜对了!");
                return;
            }
            System.out.println("您猜对了" + count + "个数字，剩余猜测次数" + (10-i) +"次,输入h可以查看猜测记录,输入其他任意字符可以继续猜测");


            String UserInput = scanner.next();
            if(UserInput.equals("h")){
                for(String s : historyList){
                    System.out.println(s);
                }
            }
        }

        System.out.println("您已经猜测10次，游戏失败");
    }
    public static void main(String[] arg){
        h1();
        h2();
    }
}
