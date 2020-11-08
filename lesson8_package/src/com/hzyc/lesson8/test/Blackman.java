package com.hzyc.lesson8.test;

public class Blackman extends Human{
    //继承了Human类里面的所有方法
    //子类 继承了 父类
    // 子类可以有特殊行为
    String skin = "black";

    public void rar(){
        System.out.println("black can rap");
    }

    public static void main(String[] args){
        Blackman blackman = new Blackman();
        blackman.useTools();
    }
}
