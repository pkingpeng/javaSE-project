package com.pqr.lesson.bubblesort;

public class Test1 {
    //排序算法 --> 冒泡排序 -->O(n2)
    //给定一个int数组,{1,6,7,8,2,3,5,1,10,8,3}
    //从小到大排序

    public static void main(String[] args){
        int[] array = new int[] {1,6,7,8,2,3,5,1,10,8,3};
        for(int i = 0; i<(array.length - 1);i++){
            for(int j = 0;j<(array.length - 1 - i); j++){
                //每一次i遍历，将最大的值放到后面
                //j 从 0 开始只需要遍历到length - i的位置
                // lengh - i 以后的位置已经是最大值排序过的数了
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int arr: array){
            System.out.print(array[arr] + " ");
        }
    }
}
