package com.internet.four;
	/*
	 * 开发者：****
	 * 开发地点：***
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用break语句，输出break以前的变量count的值，并输出中断循环时count的值
	 */
public class BreakStatement {
	public static void main(String[] args) {
		int count;
		for( count=1; count<=10; count++) {
			if( count == 5)
				break;
			System.out.println(count);
		}
		System.out.println("循环中断的数是："+count);
	}
}
