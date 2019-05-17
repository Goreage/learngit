package com.internet.four;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用while语句求1加到100的和，并输出结果
	 */
public class WhileSum {
	public static void main(String[] args) {
		int i=1;
		int n=100;
		int sum=0;
			while( i<= n) {
				sum += i;
				i++;
		}
		System.out.println("1加到100的和是："+sum);
		System.out.println("循环后变量i的值是："+i);
	}
}
