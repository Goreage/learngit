package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：通过一个日期类的定义熟悉this的使用。 日期包括年，月，日
	 */
public class Date {
	private int year;		//年
	private int month;		//月
	private int day;		//日
	public Date(int year,int month,int day)//指定参数的构造方法声明
	{
		/*
		 * 当成员方法的参数和成员变量同名时，在方法体中需要this引用成员变量，
		 * this不能省略。当无同名成员时，this可以省略
		 */
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Date()		//无参数的构造方法，使用默认值初始化成员变量，重载
	{
		this(2014,1,1);	//调用本类已定义的其他构造方法
	}
	public Date(Date oday)	//由已存在对象创建新对象的构造方法，重载
	{
		this(oday.year,oday.month,oday.day);
	}
	public int getYear() {	//获取成员变量的值
		return year;
	}
	public void setYear(int year) {	//成员变量赋值
		this.year = year;
	}
	public int getMonth() {
		return this.month= ((month>=1)&(month<=12))?month:1;
	}
	public void setMonth(int month) {	//成员变量赋值
		this.month = month;
	}
	public int getDay() {
		return this.day=((day>=1)&(day<=31))?day:1;
	}
	public void setDay(int day) {	//成员变量赋值
		this.day = day;
	}
	public String toString()		//返回年，月，日的格式
	{
		return this.year+"-"+this.month+"-"+this.day;	//this指代当前对象
	}
	public void print()		//输出年，月，日
	{
		System.out.println("date is"+this.toString());
	}
}
