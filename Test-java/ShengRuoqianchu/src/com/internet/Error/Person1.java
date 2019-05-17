package com.internet.Error;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：自定义异常类的使用
	 */
public class Person1 {
	private String name;		//姓名
	private int age;			//年龄
	public Person1(String name, int age) throws AgeException
	{
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null || name=="")
			this.name="姓名未知";
		else
			this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeException
	{
		if(age>=0 && age<=160)
			this.age=age;
		else
			throw new AgeException(""+age);
	}
	@Override
	public String toString() {
		return getName()+","+getAge()+"岁";
	}
	public void print()
	{
		System.out.println(this.toString());
	}
	public static void main(String[] args) {
		Person1 p1 = null;
		try {
			//调用以声明抛出异常的方法
			p1 = new Person1("小李子",36);
			p1.setAge(161);
		}catch(AgeException e)		//捕获自定义异常类，而非Exception类
		{
			e.printStackTrace();	//输出异常栈跟踪信息
		}
		finally
		{
			p1.print();
		}
	}
}
