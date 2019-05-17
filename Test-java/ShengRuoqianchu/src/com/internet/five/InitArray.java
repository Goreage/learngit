package com.internet.five;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用关键字new来实例化有10个整数元素的数组，初始值为0，使用for语句输出数组元素的值
	 */
public class InitArray {
	public static void main(String[] args) {
		int array[];
		array = new int[ 10 ];
		System.out.printf("%s%8s\n","数组元素","对应的值");
		for( int i=0; i<array.length; i++)		
			System.out.printf("%6d%9d\n",i,array[i]);
	}
}
