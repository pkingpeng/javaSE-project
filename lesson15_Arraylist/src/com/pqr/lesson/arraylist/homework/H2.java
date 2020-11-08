package com.pqr.lesson.arraylist.homework;

import java.util.Scanner;

/**
 * @file: H2.java
 * @time: 2020/11/1 3:47 PM
 * Author by pengquanrun
 * 用户输入一个字符串，判断输入了多少个“中国”
 */
public class H2 {
    public static void h2(){
        Scanner scanner = new Scanner(System.in);
        String UserInput = scanner.next();
        //我作为一个中国人很爱中国
        String[] arr =(" " + UserInput + " ").split("中国");
        System.out.println(arr.length - 1);
    }
    public static void main(String[] args){
        h2();
    }
}
