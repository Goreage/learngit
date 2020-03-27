package com.niuke.arraysort;

import java.util.Arrays;

/**
 * ð�����򷨣��Ƚ�ǰһ�������һ�����Ĵ�С �������飬
 * ð������ĵ��е��ǱȽ�ǰ���������ֵĴ�С 
 * ÿһ�ν�������С�����ҵ�ð����������ײ�
 * ÿ�α��������ڵ�Ԫ�ر䶯 
 * @author Goerage
 *
 */
public class CodeBubbleSort {

	public static void bubbleSort(int arr[]) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int end = arr.length - 1; end > 0; end--) {
			for (int i = 0; i < end; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	//for
	public static void rightMathod(int [] arr) {
		Arrays.sort(arr);
	}
	//for test
	public static int[] generateRandomArray(int size, int value) {
		//Math.random() -> double[0,1)
		//(int ) ((size + 1) * Math.random()) -> [0, size] ����
		//size = 6, size + 1 =7;
		//Math.random() -> [0,1) * 7 -> [0,7)double
		//double -> int [0, 6] -> int 
		
		//���ɳ������������ ������鷢����
		int[] arr = new int[(int)((size + 1) * Math.random())];
		for(int i = 0;  i < arr.length; i++) {
			arr[i] = (int)((value + 1) + Math.random())  -  (int) (value * Math.random());
		}
		return arr;
	}
	
	//for test
	public static int[] copyArray(int[] arr) {
		if(arr == null) {
			return null;
		}
		int[]  res = new int [arr.length];
		for(int i =0; i<arr.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}
	
	//for test
	public static boolean isEqual(int [] arr1, int [] arr2) {
		if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
			return false;
		}
		if(arr1 == null && arr2 ==null) {
			return true;
		}
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	//for test
	public static void main(String[] args) {
		int testTime = 500000;
		int size = 10;
		int value = 100;
		boolean succeed = true;
		for(int i=0; i<testTime; i++) {
			int[] arr1 = generateRandomArray(size, value);
			int[] arr2 = copyArray(arr1);
			int[] arr3 =copyArray(arr1);
			bubbleSort(arr1);
			rightMathod(arr2);
			if(!isEqual(arr1, arr2));{
				succeed = false;
			
				break;
			}
		}
		System.out.println(succeed ?  "Nice!" :  "Fucking fucked!");
	}
}