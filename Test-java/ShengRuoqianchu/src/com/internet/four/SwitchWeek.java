package com.internet.four;

import java.util.Scanner;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用switch语句，判断输入的数字是星期几
	 */
public class SwitchWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入1~7的整数：");
		int day = input.nextInt();	//Scanner对象调用方法获取一个整数
		switch(day) {
		case 7:System.out.println("星期日");break;
		case 1:System.out.println("星期一");break;
		case 2:System.out.println("星期二");break;
		case 3:System.out.println("星期三");break;
		case 4:System.out.println("星期四");break;
		case 5:System.out.println("星期五");break;
		case 6:System.out.println("星期六");break;
		default:System.out.println("你输入的日期不在有效范围内！");
		}
	}
}
