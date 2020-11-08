package com.pqr.lesson.arraylist.Test;

import java.util.ArrayList;

/**
 * @file: ArrayTest.java
 * @time: 2020/11/1 4:50 PM
 * Author by pengquanrun
 */
public class ArrayTest {
    // ArrayList使用连续的内存单元存储数据
    //与数组很像，实际就是由数组组成 因此添加删除的效率不高
    //比数组功能性更多，更少缺点
    // 数组 实例化的时候固定内存长度，不能增加
    // ArrayList可以扩容,默认分配的长度是10
    public static void main(String[] arg){
        ArrayList<String> list = new ArrayList();
        System.out.println("size:" + list.size());
        //add
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        System.out.println(list);
        System.out.println(list.size());
        String element = list.get(0);
        System.out.println(element);

        //基本类型
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        //自定义类型
        ArrayList<student> list3 = new ArrayList<student>();
        list3.add(new student());

    }
}

class student{
    private String studentNo;
    private String name;
}
