package com.pqr.lesson.arraylist.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file: H3.java
 * @time: 2020/11/1 3:53 PM
 * Author by pengquanrun
 * 获取当前计算机时间，将时间格式化为年-月-日 十：分：秒
 */
public class H3 {
    public static void h3(){
        Date date = new Date(); // date -> cur_Time
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // format -> date
        System.out.println(sdf.format(date));
    }
    public static void main(String[] args){
        h3();
    }

}
