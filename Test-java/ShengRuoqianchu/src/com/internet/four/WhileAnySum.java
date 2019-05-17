package com.internet.four;

import java.util.Scanner;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：用while语句求从键盘上输入的任意个double类型数值的和
	 */
public class WhileAnySum {
	public static void main(String[] args) {
		double x=0;
		double sum=0;
		int i=0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入多个数，每输入一个数后按Enter或Tab键或者空格键确认：");
		//hasNextDouble()方法判断输入的数是否是double类型的数据
		while( input.hasNextDouble()) {
			x = input.nextDouble();
			sum += x;
			i++;
		}
		System.out.println("共输入"+i+"个数，其和为："+sum);
	}
}
