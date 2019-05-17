package com.internet.four;
	/*
	 *开发者：***
	 *开发地点：***
	 *开发时间：****年**月**日
	 *最后一次修改时间：****年**月**日
	 *功能简介：使用continue语句输出特定数字序列 
	 */
public class ContinueStatement {
	public static void main(String[] args) {
		int count;
		for( count=1; count<=10; count++) {
			if(count == 5)
				continue;
			System.out.println(count);
		}
	}
}
