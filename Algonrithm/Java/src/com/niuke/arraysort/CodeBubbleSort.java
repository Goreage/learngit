package com.niuke.arraysort;

import java.util.Arrays;

/**
 * 冒泡排序法：比较前一个数与后一个数的大小 定义数组，
 * 冒泡排序的的中的是比较前后两个数字的大小 
 * 每一次将最大或最小的数找到冒出到顶部或底部
 * 每次遍历数组内的元素变动 
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
		//(int ) ((size + 1) * Math.random()) -> [0, size] 整数
		//size = 6, size + 1 =7;
		//Math.random() -> [0,1) * 7 -> [0,7)double
		//double -> int [0, 6] -> int 
		
		//生成长度随机的数组 随机数组发生器
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
