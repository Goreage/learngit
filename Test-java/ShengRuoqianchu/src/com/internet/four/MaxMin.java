package com.internet.four;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用if-else语句以及三目运算符，求3个数中的最大值和最小值，并输出结果
	 */
public class MaxMin {
	public static void main(String[] args) {
		int max,min;	//max保存最大值，min保存最小值
		int x=16,y=19,z=6;
		if( x>y )
			max = x;
		else
			max = y;
		if( z>max )
			max = z;
		System.out.println("最大值是："+max);
		min=x<y?x:y;
		min=z<min?z:min;
		System.out.println("最小值是："+min);
	}
}
