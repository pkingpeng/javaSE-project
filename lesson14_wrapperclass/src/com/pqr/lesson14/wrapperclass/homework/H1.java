package com.pqr.lesson14.wrapperclass.homework;

public class H1 {
    public static void h3(){
        String str = "422201199805170014";
        char c = str.charAt(16);
        System.out.println(c);
        int a = c - '0';
        System.out.println(a);
        if (a%2 == 0){
            System.out.println("女");
        }else {
            System.out.println("男");
        }
    }
    public static void main(String[] args){
        h3();
    }
}
