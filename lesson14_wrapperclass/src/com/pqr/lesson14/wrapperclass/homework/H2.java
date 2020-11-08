package com.pqr.lesson14.wrapperclass.homework;

import java.util.Scanner;

/**
 * 用户输入学好，如果以pqr_开头，并且后边为4位数字，前两位大于06小于当前年份（20）
 * 判断用户输入是否合法，例如:pqr_1325 ->合格
 *                       pqr_9857 ->不合格
 */
public class H2 {
    public static void h8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        String UserInput = scanner.next();
        if (UserInput.length() != 8){
            System.out.println("Input Invalid");
            return;
        }

        //judge if startwith pqr_
        if(!UserInput.startsWith("pqr_")){
            System.out.println("您输入不合法");
        }
        String suffix4 = UserInput.substring(4);
        for(int i = 0; i < suffix4.length(); i++) {
            char c = suffix4.charAt(i);
            boolean b = Character.isDigit(c);
            if (!b) {
                System.out.println("后四位需要为数字");
                return;
            }
        }
        String twoNum = suffix4.substring(0,2);
        int twoNumInt = Integer.parseInt(twoNum);
        if(twoNumInt > 6 && twoNumInt <= 20){
            System.out.println("学号符合要求");
        }else{
            System.out.println("您输入的学号不符合年份要求");
        }
    }
    public static void main(String[] args){
        h8();
    }
}
