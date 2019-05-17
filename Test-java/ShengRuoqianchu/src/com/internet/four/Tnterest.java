package com.internet.four;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用do-while语句进行利率计算。假如在银行账户内存入1000000元，年利率是3.69%,计算
	 * 多少年后存款能够连本带息翻一番
	 * 使用公式如下:
	 * a=p(1+r)^n
	 * 其中：
	 * p是存款的资金；
	 * r是每年的利率（0.0369，代表3.69%）;
	 * n是存款年数
	 * a是第n年结算的存款总额
	 */
public class Tnterest {
	public static void main(String[] args) {
		//声明变量保存第n年底结算的存款总额
		double amount;
		//声明变量并初始化其值为利率
		double rate = 0.0369;
		//声明变量并初始化其值为初始化存款额
		double principal = 1000000.0;
		//声明变量用于保存存款的年限并初始化
		int n = 0;
		do {
			/*使用java.lang.Math类中的pow方法，实现对公式(1+r)^n的计算。Math类中提供许多
			 数学方法，如需使用请查阅API*/
			amount = principal * Math.pow(1.0+rate, n);
			n++;
		}while( amount < 2*principal );
		System.out.println(n+"年后连本带利翻一番！"+"账户资金为："+2*principal);
	}
}
