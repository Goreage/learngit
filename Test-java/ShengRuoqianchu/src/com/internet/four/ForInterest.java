package com.internet.four;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用for语句进行利息计算。假如在银行上存入1 000 000元，年利率是
	 * 3.69%,计算并输出10年间每年结算时账户里的存款总额，计算公式同 例4-9
	 */
public class ForInterest {
	public static void main(String[] args) {
		double amount; 
		double principal = 1000000.0;
		double rate = 0.0369;
		/*格式字符串"4s%20s\n"表示要输出两个字符串类型的数据，其中%20s表示以20个字符的长度
		 * 输出对应的常量"存款额。两个%引导的格式字符串对应后面两个变量 */
		System.out.printf("%4s%20s\n","年","存款额");
		for ( int year=1; year <= 10; year++) {
			amount = principal * Math.pow(1.0+rate, year);
			/*%4d表示后面对应的year长度为4;"%,20.2f"表示对应的变量amount长度为20且有两位
			 * 小数点并右对齐，整数部分每三位用逗号隔开*/
			System.out.printf("%4d%,20.2f\n",year,amount);
		}
	}
}
