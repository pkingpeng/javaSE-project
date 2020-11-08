package com.pqr.lesson13.string;



public class Test {
    public static void main(String[] args){
        //字符串
        String s1 = "hello";
        String s2 = new String("hello");
        //使用char数组
        char[] chars = new char[]{'h','e','l','l','o'};
        String s3 = new String(chars);
        System.out.println(s3);
        String s4 = new String(chars, 1,2);
        System.out.println(s4);

        //字符串用法
        System.out.println(s1 == s2); // false
        // == 只能判断基本类型
        //应用类型（判断的是内存地址）就会失败
        System.out.println("s2 == s3: " + (s2 == s3));
        //字符串判断方法:
        boolean b = s1.equals(s2);
        System.out.println(b);
        //字符串常用方法
        System.out.println(s1.length());
        //
    }
}
