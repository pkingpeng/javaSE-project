package com.pqr.lesson13.homework;

import java.util.Scanner;

/**
 * 长度为10数组，删除某一个位置的元素，后边元素前置
 * 1 2 3 4 5 6 7
 * delete 4
 * 1 2 3 5 6 7
 */
public class H2 {
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7};
        Scanner scanner = new Scanner(System.in);
        int usrInputIndex = scanner.nextInt();
        for(int i = usrInputIndex; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0; i<arr2.length; i ++){
            arr2[i] = arr[i];
        }
        for (int a :arr2){
            System.out.println(a);
        }
    }
}
