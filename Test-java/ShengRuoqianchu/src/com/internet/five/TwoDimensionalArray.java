package com.internet.five;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ�ö�ά����洢���ݲ������ά�����е�Ԫ��
	 */
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int array1[] [] = {{16,6,36},{26,56,66}};
		int array2[] [] = {{19,27},{36},{38,59,69}};
		System.out.println("����array1������Ԫ��Ϊ��");
		for( int row=0; row<array1.length; row++) {
			for( int column=0; column<array1[row].length; column++)
				System.out.println(array1[row] [column]);
 	}
		System.out.println("����array2������Ԫ��Ϊ��");
		for( int row=0; row<array2.length; row++) {
			for( int column=0; column<array2[row].length; column++)
				System.out.println(array2[row] [column]);
		}
	}
}
