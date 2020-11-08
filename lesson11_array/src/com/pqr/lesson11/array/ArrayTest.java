package com.pqr.lesson11.array;
//数组
//查找元素快 O(1)
//插入元素慢 O(N)
//删除元素慢 O(N)
public class ArrayTest {
    public static void main(String[] args){
        // 指定容量为5
        int[] array1 = new int[5];
        //int数据元素默认为0
        System.out.println(array1[3]);  // output --> 0
        // 穷举法
        int[] array2 = new int[] {1,2,3,4,5};
        // output index 3 --> 4th element
        System.out.println(array2[3]);
        System.out.println();

        //其他类型数组
        byte[] b = new byte[6];
        //自定义类数组
        bird[] birdarray = new bird[10];
        //二维数组
        int[][] array3 = new int[4][3];
        array3[2][1] = 23;
        for(int i = 0; i < array3.length; i++){
            for(int j = 0; j <array3[0].length; j++){
                System.out.print(array3[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        //遍历一个数组
        for(int i = 0;i < array2.length; i++){
            System.out.println(array2[i]);
        }
        System.out.println();
        //加强for循环
        for(int a: array2){
            System.out.println(a);
        }
    }
}
