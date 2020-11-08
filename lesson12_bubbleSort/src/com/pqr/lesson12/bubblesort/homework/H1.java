package com.pqr.lesson12.bubblesort.homework;



public class H1 {
    public static void main(String[] args){
        int sum = 0;
        int[] array = new int[] {1,2,3,4,5};
        for (int arr:array){
            sum += arr;
        }
        System.out.println(sum);

        for(int index = 0; index < array.length; index++){
            if(index%2 == 1){
                //奇数
                System.out.println(array[index]);
            }
        }
        System.out.println();

        for (int arr:array){
            System.out.print(arr * 2);
        }
    }

}
