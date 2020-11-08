package com.pqr.lesson16.linkedlist.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @file: Test.java
 * @time: 2020/11/1 6:15 PM
 * Author by pengquanrun
 * (1)编号（即计算机的唯一标识）
 * (2)CPU型号
 * (3)主板型号
 * (4)硬盘大小
 * (5)内存大小
 * (6)显卡型号
 * (7)价格
 *  * 2. 准备工作：创建一个Computer类
 * 包含成员变量如下：
 * (1)编号（即计算机的唯一标识）
 * (2)CPU型号
 * (3)主板型号
 * (4)硬盘大小
 * (5)内存大小
 * (6)显卡型号
 * (7)价格
 * 包含方法如下：
 * (1)输出当前计算机的所有属性
 * (2)设置计算机CPU型号
 * (3)设置计算机主板型号
 * (4)设置计算机硬盘大小
 * (5)设置计算机内存大小
 * (6)设置计算机显卡型号
 * (7)设置计算机价格
 * (8)获取计算机价格
 *
 * 题目：
 * （1）要求使用ArrayList存储计算机对象，
 * 形如：ArrayList<Computer> cList = new ArrayList<Computer> ();
 *
 * （2）为ArrayList对象（例如：上面的cList）添加3个元素。
 * //添加计算机
 *
 * （3）模拟用户输入（Scanner对象）获取对应的Computer信息，并且输出具体的参数。
 * //根据用户输入的code码查找计算机
 *
 * （4）遍历输出ArrayList中的Computer，同时输出Computer的详细信息。
 * 遍历所有计算机的信息
 */
public class Test {
    //实例化一个ArrayList，且泛型只能装Computer类的对象

    static List<Computer> computerList = new ArrayList<Computer>();
    //默认查找索引
    static int index = -1;
    //static代码块
    static {
        //添加3个computer对象
        Computer computer1 = new Computer();
        computer1.setCode("1");
        computer1.setCpu("core i7");
        computer1.setGraphicsCard("GTX2080");
        computer1.setMainBorad("B368");
        computer1.setPrice(8000.00);
        computer1.setRam("64G");
        computer1.setRom("4T");

        Computer computer2 = new Computer();
        computer2.setCode("2");
        computer2.setCpu("core i5");
        computer2.setGraphicsCard("GTX2070");
        computer2.setMainBorad("B367");
        computer2.setPrice(6000.00);
        computer2.setRam("32G");
        computer2.setRom("2T");

        Computer computer3 = new Computer();
        computer3.setCode("3");
        computer3.setCpu("core i3");
        computer3.setGraphicsCard("GTX2060");
        computer3.setMainBorad("B366");
        computer3.setPrice(4000.00);
        computer3.setRam("16G");
        computer3.setRom("1T");

        //添加
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);
    }

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入电脑编号");
        String UserInput = scanner.next();
        //查找
        for(int i = 0; i < computerList.size(); i++){
            Computer computer = computerList.get(i);
            if(computer.getCode().equals(UserInput)){
                index = i;
            }
        }
        if(index != -1){
            System.out.println(computerList.get(index));
        }else{
            System.out.println("对不起找不到该电脑");
        }
        System.out.println("==============输出所有电脑信息==============");
        for(Computer com: computerList){
            System.out.println(com);
        }
    }
}
