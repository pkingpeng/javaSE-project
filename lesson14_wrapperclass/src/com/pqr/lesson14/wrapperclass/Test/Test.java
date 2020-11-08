package com.pqr.lesson14.wrapperclass.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @file: Test.java
 * @time: 2020/11/1 1:52 PM
 * Author by pengquanrun
 */
public class Test {
    public static void main(String[] args){
        int a = 100;
        String s = String.valueOf(a);
        System.out.println(s);
        String s2 = 100 + "";

        //Date类表示时间
        Date date = new Date(); //date表示当前时间
        System.out.println(date);
        //将日期变成想要的格式 2020-11-01 13:54:00
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formateDate = simpleDateFormat.format(date);
        System.out.println(formateDate);

        //日历类 Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date1 = calendar.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + date1);

        //201101字符串 转化为 Date对象
        String str1 = "060101";
        DateFormat sdf2 = new SimpleDateFormat("yyMMdd");
        Date date2 = sdf2.parse(str1);
        System.out.println(date2);

    }
}
