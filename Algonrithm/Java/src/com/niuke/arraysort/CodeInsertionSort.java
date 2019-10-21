package com.niuke.arraysort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * ��������ʱ�临�Ӷ� ���������� O(N)�� ��������O(N^2) 		����ð�� �� ���� ���������������
 * ˼·��ȡ�ƣ���0���ƿ�ʼ��ÿȡһ�Ŷ������θ�����ǰһ�űȽϣ������ǰһ�Ŵ�
 * �������� �����ǰһ��С�򽻻���
 * ��index=1��ʼ�� ǰһ������j��ʾ�� j >= 0  ��Ϊ�˷�ֹ����Խ�磬 ���������߾ͱȽϲ���
 *  arr[j] > arr[j+1] ˵��ǰ������Ⱥ���������򽻻��� j-- ����ǰ������ ����������һ����
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
