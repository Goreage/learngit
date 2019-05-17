package com.internet.Error;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：该类产生除数为的0的异常
	 */
public class ExceptionByZero {
	public static void main(String[] args) {
		int x=16;
		int y=0;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x/y"+x/y);
	}
}
