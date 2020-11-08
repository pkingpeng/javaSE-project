package com.pqr.lesson13.homework;

/**
 * 长度为10数组，从大到小排序
 */
public class H1 {
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        for(int i = 0; i < arr.length - 1; i++){
            for(int j =0; j< arr.length - 1- i;j++){
                if (arr[j] < arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
