package com.internet.four;

import java.util.Scanner;
/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：if语句嵌套使用，用于判断考试等级。分数是100分制，判断等级标准为优秀（大于等于90分），良好（大于等于80分，小于90分）
	 * 中等（大于等于70分，小于80分），及格（大于等于60， 小于70分），不及格（小于60分）。本程序可以实现输入任意一个100以内的非负数进行成绩等级判断
	 */
public class StatementNestedScore {
	public static void main(String[] args) {
		float score;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入成绩：");
		score = input.nextFloat();	
		if(score<90)
			if(score<80)
				if(score<70)
					if(score<60)
						System.out.println("你的成绩等级为：不及格！");
					else
						System.out.println("你的成绩等级为：及格！");
				else
					System.out.println("你的成绩等级为：中等！");
			else
				System.out.println("你的成绩等级为：良好！");
			else
				System.err.println("你的成绩等级为：优秀！");
	}
}
