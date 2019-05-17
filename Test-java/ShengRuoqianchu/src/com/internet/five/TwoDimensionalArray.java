package com.internet.five;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用二维数组存储数据并输出二维数组中的元素
	 */
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int array1[] [] = {{16,6,36},{26,56,66}};
		int array2[] [] = {{19,27},{36},{38,59,69}};
		System.out.println("数组array1的数组元素为：");
		for( int row=0; row<array1.length; row++) {
			for( int column=0; column<array1[row].length; column++)
				System.out.println(array1[row] [column]);
 	}
		System.out.println("数组array2的数组元素为：");
		for( int row=0; row<array2.length; row++) {
			for( int column=0; column<array2[row].length; column++)
				System.out.println(array2[row] [column]);
		}
	}
}
