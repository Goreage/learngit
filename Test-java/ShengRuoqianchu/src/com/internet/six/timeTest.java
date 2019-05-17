package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：通过TimeTest类检测Time类的功能。该类实例化Time类的对象，通过对象调用Time类的方法
	 */
public class timeTest {
	public static void main(String[] args) {
		Time t1=new Time(8,16,36);		//08:16:36
		Time t2=new Time(26,66,66);		//00:00:00
		Time t3=new Time(t1);			//08:16:36
		System.out.printf("%s\n",t1.toUniversalString());
		System.out.printf("%s\n",t1.toString());
		System.out.printf("%s\n",t2.toUniversalString());
		System.out.printf("%s\n",t2.toString());
		System.out.printf("%s\n",t3.toUniversalString());
		System.out.printf("%s\n",t3.toString());
	}
}
