package com.internet.four;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用do-while语句求1加到100的和
	 */
public class DowhileSum {
	public static void main(String[] args) {
		int i=1;
		int n=100;
		int sum=0;
		do {
			sum += i;
			i++;
		}while( i <= n);
		System.out.println("1加到100的和是："+sum);
		System.out.println("循环后变量i的值是："+i);
	}
}
