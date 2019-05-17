package com.internet.four;

import java.util.Scanner;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：if语句嵌套的，用于判断某个月属于哪个季节
	 */
public class StatementNestedSeason {
	public static void main(String[] args) {
		String season;		//season用于表示季节
		int month = 0;		//month表示具体的一个月份
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		if(month==3 || month==4 || month==5)
			season="春季";
		else if(month==6 || month==7 || month==8)
			season="夏季";
		else if(month==9 || month==10 || month==11)
			season="秋季";
		else if(month==12 ||month==1 || month==2)
			season="冬季";
		else
			season="对不起，你选择的月份不是1~12月，不在一年四季中";
		System.out.println(season);
	}
}
