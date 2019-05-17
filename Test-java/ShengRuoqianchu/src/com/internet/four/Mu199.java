package com.internet.four;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用for语句的多重循环（循环语句中又有循环语句，称为多重循环结构）输出九九乘法表
	 */
public class Mu199 {
	public static void main(String[] args) {
		int i;
		int j;
		int n=9;
		System.out.print("   *   |");
		for( i=1; i<=n; i++)
			System.out.print("   "+i);
			System.out.print("\n-------|");
		for( i=1; i<=n; i++)
			System.out.print("----");
			System.out.println();
		for( i=1; i<=n; i++)
		{
			System.out.print("   "+i+"   |");
			for( j=1; j<=i; j++)
				System.out.print("  "+i*j);
				System.out.println();
		}
	}
}
