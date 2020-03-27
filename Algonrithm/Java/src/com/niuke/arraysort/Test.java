package com.niuke.arraysort;

import java.util.Arrays;

public class Test {

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
		public static void main(String[] args) {
			int[] num = {3,5,4,8,97,65,1,2,36,51,12,41};
			bubbleSort(num);
			System.out.println(Arrays.toString(num));
		}
}
