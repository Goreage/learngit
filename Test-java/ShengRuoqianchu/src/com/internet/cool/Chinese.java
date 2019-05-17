package com.internet.cool;

import java.util.Random;

//package 是关键字， 用于创建包 com.interbet.cool为包名
/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：本程序编写Chinese类，用来示范Java程序的基本结构
 */
//导入Chinese类中使用的类Random，其中，java.util为包名，import为关键字
public class Chinese {
	/*
	 * 在规范的Java声明中，成员变量一般声明为私有权限，name是变量名，用于保存姓名
	 */
	private String name;
	//sex 是变量名，用于保存性别
	private String sex;
	//实例化对象，用于初始化成员变量 luckyN
	Random luckyN = new Random();
	//声明类的构造方法，用于在实例化对象时初始化成员变量
	public Chinese(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	//规范的Java编程中，setName(String name)方法用于设置成员变量name的值
	public void setName(String name) {
		this.name = name;
	}
	//规范的Java编程中， getName()方法用于获取成员变量的name的值
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	//声明Chinese类中的成员变量的方法，该方法实现的功能是输出对象的基本信息
	public void myInformation() {
		//运算符+用于字符串连接
		System.out.println("我的名字叫:"+getName()+",我是一名:"+getSex()+"生!");
	}
	public void chineseDream() {
		System.out.println("我们的中国梦是:实现中华名族伟大复兴!");
	}
	//声明Chinese类中的成员方法，该方法实现的功能是输出文字提示信息
	public void myDream() {
		System.out.println("我的中国梦是:成为一名优秀的程序员，实现自己的中国梦!");
	}
	//声明Chinese类中的成员方法，该方法实现的功能是输入运算结果
	public void luckyNumber() {
		System.out.println(1+luckyN.nextInt(1000));
	}
	//用于运行程序main的方法
	public static void main(String[] args) {
		//实例化对象
		Chinese chinese = new Chinese("Goerage","男");
		//对象调用方法，执行功能
		chinese.myInformation();
		chinese.chineseDream();
		chinese.myDream();
		chinese.luckyNumber();
	}
}
