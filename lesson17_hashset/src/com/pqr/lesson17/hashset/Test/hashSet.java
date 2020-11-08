package com.pqr.lesson17.hashset.Test;

import com.pqr.lesson17.hashset.homework.H1;

import java.util.HashSet;

/**
 * @file: hashSet.java
 * @time: 2020/11/1 11:18 PM
 * Author by pengquanrun
 */
public class hashSet {
    public static void  main(String[] args){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        for(int i :hashSet){
            System.out.println(i);
        }
        //重复元素被去掉了，第二个增加的一不存在

        //HashSet能不能存储自定义的类
        HashSet<Computer> comSet = new HashSet<Computer>();
        Computer computer1 = new Computer();
        computer1.code = "1";
        Computer computer2 = new Computer();
        computer2.code = "1";

        comSet.add(computer1);
        comSet.add(computer2);

        System.out.println(comSet.size());
        //不同的实例对象，因此对应的code值不同，此时hash的size为2
        //如果认为属性一直，就是相同的对象，这里的code都为1，应该被去重
        //hash如何去重呢？
        //重写方法，使生成的hash值相同，即可去重
    }
}

class Computer{
    public String code;

}