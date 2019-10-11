package com.niuke.arraysort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 插入排序：时间复杂度 最好情况有序 O(N)， 最坏情况逆序O(N^2) 		对于冒泡 和 插入 不考虑数组的性质
 * 思路：取牌，从0张牌开始，每取一张都会依次更他的前一张比较，如果比前一张大，
 * 不交换， 如果比前一张小则交换。
 * 从index=1开始， 前一个数用j表示， j >= 0  是为了防止数组越界， 如果在最左边就比较不了
 *  arr[j] > arr[j+1] 说明前面的数比后面的数大，则交换， j-- 再向前交换， 不满足则下一个数
 * @author Administrator
 *
 */
public class CodeInsertionSort {
		public static void insertionSort(int [] arr) {
			if(arr == null || arr.length <=2) {
				return;
			}
			for(int i=1;  i<arr.length; i++) {
				for(int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
					swap(arr, j , j+1);
				}
			}
		}
		
		public static void swap(int[] arr, int  i, int j) {
//			arr[i] = arr[i] ^ arr[j];
//			arr[j] = arr[i] ^ arr[j];
//			arr[i] = arr[i] ^ arr[j];
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		public static void main(String[] args) {
			int[] num = {3,5,4,8,97,65,1,2,36,51,12,41};
			insertionSort(num);
			System.out.println(Arrays.toString(num));
		}
}
