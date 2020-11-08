package com.pqr.lesson16.linkedlist.Test;

import com.pqr.lesson16.linkedlist.homework.Computer;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @file: LinkedList.java
 * @time: 2020/11/1 8:21 PM
 * Author by pengquanrun
 *
 *ArrayList 随机访问通过首地址可以直接计算元素的内存地址
 *LinkedList 随机访问只能通过遍历
 *LinkedList 增加删除更高效，只需要移动指针，不用移动其他元素的内存
 *
 */
public class Test {
    public static void main(String[] args){
        List<Computer> computerList = new LinkedList<Computer>();
        // size
        System.out.println(computerList.size());
        // add
        computerList.add(0,new Computer());
        computerList.add(1,new Computer());
        System.out.println(computerList.size());
        // System.out.println();
        // remove
        computerList.remove(0);
        //get element
        Computer computer1 = computerList.get(0);
        System.out.println(computer1);

        //Vector 线程安全的数据结构
        Vector<Computer> vector = new Vector<Computer>();
        vector.add(new Computer());

    }

}
