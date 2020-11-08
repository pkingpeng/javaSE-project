package com.pqr.lesson18.map.homework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @file: ReviewTest.java
 * @time: 2020/11/2 10:08 PM
 * Author by pengquanrun
 */
public class ReviewTest {
    // hashSet 是一个基于hash的结构
    // 均匀的分布 冲突会导致性能的下降
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("c");
        hashSet.add("chong");
        hashSet.add("zhong");
        hashSet.add("bsdfs");

        //遍历
        for(String s:hashSet){
            System.out.println(s);
            //无序
        }
        //遍历：迭代器
        Iterator<String> iterator = hashSet.iterator();
        //有没有下一个？
        // 有输出
        System.out.println("迭代器：");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("迭代器结束");


        HashSet<Computer> comSet = new HashSet<Computer>();
        Computer computer1 = new Computer();
        computer1.code = 1;
        computer1.name = "computer";
        Computer computer2 = new Computer();
        computer2.code = 1;
        computer2.name = "computer";
        //hash如何去重呢？
        //重写方法，使生成的hash值相同，即可去重
        //调用hashcode方法和equal()
        //hashcode相同 --> 会调用equals也相同 就会去重
        //hashcode不同 -->不会去重
        comSet.add(computer1);
        comSet.add(computer2);

        System.out.println(comSet.size());
        //不同的实例对象，内存地址不同，因此对应的code值不同，此时hash的size为2
        //如果认为属性一直，就是相同的对象，这里的code都为1，应该被去重

    }



}

class Computer{
    public int code;
    public String name;

    @Override
    public int hashCode() {
        //所有的computer对象生成相同的hashcode -->
        return this.code;
    }

    @Override
    public boolean equals(Object obj) {
        Computer computer = (Computer) obj;
        if(computer.name.equals(name)){
            return true;
        }else{
            return false;
        }
    }
}