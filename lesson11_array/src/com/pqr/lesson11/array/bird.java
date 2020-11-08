package com.pqr.lesson11.array;

public class bird implements Fly, Test{

    @Override
    public void fly() {
        System.out.println("use engine");
    }
    @Override
    public void test(){
        System.out.println("test fly");

    }
    public static void main(String[] args){
        Fly f = new bird();
        f.fly();
    }
}
