package com.internet.four;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 来发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用for语句求i加到100的和
	 */
public class ForSum {
	public static void main(String[] args) {
		//声明循环变量i并初始化，用于构成循环条件
		int i = 1;
		//声明变量n并初始化，用于控制循环次数
		int n = 100;
		//声明变量total并初始化,用于保存计算结果
		int total = 0;
		for ( i=1; i<=n; i++)
			total += i;
		//格式化输出,%d表示输出的类型，控制输出total值的格式
		System.out.printf("结果是：%d\n",total);
	}
}
