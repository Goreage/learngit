package com.internet.four;
	/*
	 * 开发背景：return语句能终止当前的成员方法的执行，返回到调用该方法的位置，并从紧跟该调用语句的下一句语句
	 * 继续程序的执行。如果该方法的返回类型不是void，则需要提供类型的返回值。return语句有以下两种使用格式
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用return语句返回字符串
	 */
public class ReturnStatement {
	public String patriotic() {
		return "我爱我的祖国，我爱我的家乡！";
	}
	public static void main(String[] args) {
		ReturnStatement rs = new ReturnStatement();
		System.out.println(rs.patriotic());
	}
}
