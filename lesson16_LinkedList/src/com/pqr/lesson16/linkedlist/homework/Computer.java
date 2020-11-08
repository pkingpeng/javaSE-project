package com.pqr.lesson16.linkedlist.homework;


/**
 * @file: H1.java
 * @time: 2020/11/1 5:46 PM
 * Author by pengquanrun
(1)编号（即计算机的唯一标识）
(2)CPU型号
(3)主板型号
(4)硬盘大小
(5)内存大小
(6)显卡型号
(7)价格
 * 2. 准备工作：创建一个Computer类
包含成员变量如下：
(1)编号（即计算机的唯一标识）
(2)CPU型号
(3)主板型号
(4)硬盘大小
(5)内存大小
(6)显卡型号
(7)价格
包含方法如下：
(1)输出当前计算机的所有属性
(2)设置计算机CPU型号
(3)设置计算机主板型号
(4)设置计算机硬盘大小
(5)设置计算机内存大小
(6)设置计算机显卡型号
(7)设置计算机价格
(8)获取计算机价格

题目：
（1）要求使用ArrayList存储计算机对象，
形如：ArrayList<Computer> cList = new ArrayList<Computer> ();

（2）为ArrayList对象（例如：上面的cList）添加3个元素。
//添加计算机

（3）模拟用户输入（Scanner对象）获取对应的Computer信息，并且输出具体的参数。
//根据用户输入的code码查找计算机

（4）遍历输出ArrayList中的Computer，同时输出Computer的详细信息。
//遍历所有计算机的信息
 *
 *
 * */
public class Computer {
    private String code;
    private String cpu;
    private String mainBorad;
    private String rom;
    private String ram;
    private String graphicsCard;
    private double price;

    //输入所有属性
    //重写 Object方法 -->toString()   输出方法的内存地址
    @Override
    public String toString() {
        return "Computer{" +
                "code='" + code + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBorad='" + mainBorad + '\'' +
                ", rom='" + rom + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", price=" + price +
                '}';
    }

    //提供对外的方法
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBorad() {
        return mainBorad;
    }

    public void setMainBorad(String mainBorad) {
        this.mainBorad = mainBorad;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


