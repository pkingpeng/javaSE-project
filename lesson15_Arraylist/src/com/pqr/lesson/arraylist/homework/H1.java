package com.pqr.lesson.arraylist.homework;

/**
 * H1.java
 * 2020/11/1 3:33 PM
 * Author by pengquanrun
 * 1. 本程序找出字符串数组
 * String[] arr = {“welcome”, “china”, “hi”, “congratulation”, “great”}
 * 中的长度最大的元素，并输出。
 * 4. 用户输入一个字符串，判断输入了多少个“中国”。
 *
 * 6. 获取当前计算机时间，将时间格式化为年-月-日 十：分：秒
 * 7. 已知时间：20060521090430，【使用Calendar对象】编程输出该时间的后30天零5小时的时间是多少？
 * 8. 已知时间：060101（年月日），【使用Calendar对象】编程输出该时间的前15天是哪天？
 * 9. 编写程序判断输入的年份（4位）是否为闰年？
 */
public class H1 {
    public static void h1(){
        String[] arr = {"welcome", "china", "hi", "congratulation", "great"};
        int max = 0;
        int maxIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i].length() > max){
                max = arr[i].length();
                maxIndex = i;
            }
        }
        System.out.println(arr[maxIndex]);
    }
    public static void main(String[] args){
        h1();
    }

}
