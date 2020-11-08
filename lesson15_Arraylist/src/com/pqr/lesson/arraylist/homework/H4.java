package com.pqr.lesson.arraylist.homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * H4.java
 * 2020/11/1 3:56 PM
 * Author by pengquanrun
 * 已知时间：20060521090430，【使用Calendar对象】编程输出该时间的后30天零5小时的时间是多少？
 */
public class H4 {
    public static void h4() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        String str = "20060521090430";
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH); // format -> date
        DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str); // string --> date
        String date1 = sdf2.format(date); //date --> string
        System.out.println(date1);
        // 设置calendar
        calendar.setTime(date);
        System.out.println(calendar);
        //类型
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        calendar.add(Calendar.HOUR_OF_DAY,5);
        //获取日期
        date = calendar.getTime();
        System.out.println(sdf.format(date));
    }
    public static void main(String[] args) throws Exception{
        h4();
    }

}
