package com.internet.cool;
	/*
	 * 开发者:***
	 * 开发时间:***
	 * 开发时间:****年**月**日
	 * 最后一次修改时间:****年**月**日
	 * 功能简介:验证数据类型转换
	 */
public class TypeConversion {
	public static void main(String[] args) {
		int x=100;
		//隐式类型转换
		long y=x;
		System.out.println("类型转换:整型"+x+"转换为长整型"+y);
		double d=56789;
		//显示类型转换，即强制类型转换
		int a=(int)d;
		System.out.println("类型转换:整型"+d+"装换为int类型"+a);
	}
}
