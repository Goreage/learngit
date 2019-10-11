package com.niuke.arraysort;

import java.util.Arrays;
/**
 * 选择排序：每次选一个最小的数放在前一行
 * @author Administrator
 *
 */
public class CodeSecectionSort {
	
	public static void selectionSort(int [] arr ) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j= i +1; j<arr.length; j++) {
				minIndex = arr[j] <  arr[minIndex]  ?  j : minIndex;
			}
			swap(arr, i, minIndex); 
		} 
	}
	public static void swap(int[] arr,int  i , int j) {
		int tmp = arr[i];
		arr [i] = arr[j];
		arr[j] = tmp;
	}
	public static void main(String[] args) {
		int[] num = {9,6,5,7,1,3,45,86};
		selectionSort(num);
		System.out.println(Arrays.toString(num));
	}
}
