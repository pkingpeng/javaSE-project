package com.pqr.lesson8.homework;

public class Dog {
    private String name;
    //只访问不修改
    public String getName(){
        return name;
    }

    public Dog(String name){
        this.name = name;
    }
    public void bite(Human human){
        System.out.println(this.name + "咬了" + human.getName());

    }

    public void run(){
        System.out.println(this.name + "跑了");

    }
}
