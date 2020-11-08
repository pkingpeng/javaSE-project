package com.pqr.lesson13.homework;

import java.util.Scanner;

/**
 * 长度为10数组，按递增排列，用户输入一个数，插入适当位置
 */
public class H3 {
    public static void main(String[] args){
        int[] arr=new int[] {1,2,3,4,5,6,7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入插入的值");
        int UserInputValue = scanner.nextInt();
        System.out.println("请输入插入的索引");
        int UserInputIndex = scanner.nextInt();
        if(UserInputIndex > arr.length - 1){
            System.out.println("输入的索引太大");
            return ;
        }
        int[] arr2 = new int[arr.length + 1];
        for ( int i = arr.length - 1 ; i >= UserInputIndex;  i--){
            arr2[i + 1] = arr[i];
        }
        arr2[UserInputIndex] = UserInputValue;
        for(int i = 0; i < UserInputIndex; i++){
            arr2[i] = arr[i];
        }
        for (int a: arr2){
            System.out.print(a + " ");
        }
    }
}
