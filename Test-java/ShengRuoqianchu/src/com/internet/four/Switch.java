package com.internet.four;

import java.util.Scanner;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用switch语句，判断某月属于哪个季节
	 */
public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入1~12的整数：");
		int month = input.nextInt();
		switch ( month ) {
		case 3:
		case 4:		//空语句，无操作继续下一个case检查
		case 5:System.out.println("春季");break;
		case 6:
		case 7:
		case 8:System.out.println("夏季");break;
		case 9:
		case 10:
		case 11:System.out.println("秋季");break;
		case 12:
		case 1:
		case 2:System.out.println("冬季");break;
		default:System.out.println("你输入的月份不在有效范围内！");
		}
	}
}
