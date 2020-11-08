package com.pqr.lesson.bubblesort;

public class Test {
	
	//�����㷨                                      2,8
						   //  3,8
	//��һ���ܹ���10�����Ҳ�
	//����һ��int���� , {1,6,7,8,2,3,5,1,10,8,3}
	//��С��������   ð���㷨

	
		public static void main(String[] args) {
			
			int[] array = new int[] {21,99,3,1024,16};
			//��Ҫ�Ƚ�4��  ʱ�临�Ӷ�  O��n��ƽ����
			for(int i = 0 ; i < array.length - 1 ; i++) {
				//i����0�ǵ�һ�֣���Ҫ�Ƚ�4��
				//i����1�ǵڶ��֣���Ҫ�Ƚ�3��
				for(int j = 0 ; j < array.length - 1 - i ; j++) {
					
					//array[j] ���� �滻array[j+1]
					if(array[j ] > array[j+1]) {
						//����
						//��ʱԪ�ش洢array[j]
						//99
						int temp = array[j];
						//3��ֵ
						array[j] = array[j+1];
						//��99��ֵ
						array[j+1] = temp;
					}
				}
			}
			
			
			for(int arr : array) {
				System.out.println(arr);
			}
		}
}
