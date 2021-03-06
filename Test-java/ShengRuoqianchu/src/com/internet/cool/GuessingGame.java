package com.internet.cool;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {	
	public static void main(String[] args) {
		//声明一个变量用于保存Random类随机生成1~100的整数
		int game;
		//声明一个变量用于保存玩家猜的数
		int guess;
		//用于统计猜的次数
		int counter=0;
		//实例化一个Random类对象，用于产生随机数
		Random randomNumbers=new Random();
		//randomNumbers 对象调用 nextInt()方法生成一个随机整数
		//randomNumbers.nextInt(100)表示生成一个0~99的任意整数
		game=1+randomNumbers.nextInt(100);
		//实例化一个Scanner类对象，用于获取键盘输入的数据
		Scanner input = new Scanner(System.in);	
		do {
			System.out.println("请输入你猜的数字(1~100的整数):");
			//调用方法获取从键盘输入的数据 				 		
				guess = input.nextInt();
				counter++;
			if( guess == game)
				break;
			if( guess > game)
				System.out.println("你猜的数字太大!");
			else
				System.out.println("你猜的数太小");
		}while( guess != game );
			System.out.println("恭喜你，你猜了"+counter+"次，你猜对了！");
	}
}
