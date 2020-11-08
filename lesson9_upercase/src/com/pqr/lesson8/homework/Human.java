package com.pqr.lesson8.homework;

public class Human {
    private String name;

    public String getName(){
        return name;
    }
    public Human(String name){
        this.name = name;
    }
    public void walk(){
        System.out.println(this.name + "散步");
    }
    public void attack(Dog dog){
        System.out.println(this.name + "打了" + dog.getName());
    }
}
