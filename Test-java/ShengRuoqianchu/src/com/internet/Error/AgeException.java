package com.internet.Error;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：声明自定义异常类
	 */
public class AgeException extends Exception{	//自定义无效年龄异常类
	public AgeException(String s)
	{
		super(s);			//调用父类构造方法
	}
	public AgeException()
	{
		this("");
	}
}
