package com.internet.cool;
	/*
	 * 开发者:***
	 * 开发地点:***
	 * 开发时间:****年**月**日
	 * 最后修改时间:****年**月**日
	 * 功能简介:本程序示范分隔符的使用。首先声明一个数组，然后通过for语句把数组的值取出并相加，最后输出计算结果
	 */
public class Separator {
	public static void main(String args[]) {
		//声明整型变量i和sum并初始化
		int i, sum=0;
		//声明整数数组a并初始化
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		//循环控制语句实现数组遍历
		for( i=0; i<a.length; i++)
		{
			//遍历数组并计算结果
			sum += a[i];	
		}//for语句结束
		System.out.println(sum);
	}//main()方法结束
}//类Separator结束
