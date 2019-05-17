package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：测试日期类
	 */
public class DateTest {
	public static void main(String[] args) {
		Date oday1=new Date();		//默认参数的构造方法
		Date oday2=new Date(2014,1,2);	//指定参数的构造方法
		Date oday3=new Date(oday2);		//由已知对象创建新对象的构造方法
		oday1.print();
		oday2.print();
		oday3.print();
	}
}
