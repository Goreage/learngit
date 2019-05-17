package com.internet.Error;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用抛出异常功能。构造一个Person类，封装姓名和年龄，可以比较两个年龄的大小
	 */
public class Person {
	private String name;	//姓名
	private int age;		//年龄
	public Person(String name, int age) {	//构造方法
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
	public void setAge(int age) {
		try {
			if(age>0 && age<100)
				this.age=age;
			else
				throw new Exception("年龄无效");	//抛出异常对象
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Override
	public String toString() {
		return getName()+","+getAge()+"岁";
	}
	public int olderThen(Person p2)
	{
		return this.getAge()-p2.getAge();	//比较两个人的年龄
	}
	public static void main(String[] args) {
		Person p1 = new Person("小李子",36);
		System.out.println(p1.toString());
		Person p2 = new Person("小贾",26);
		System.out.println(p2.toString());
		System.out.println(p1.getName()+"比"+p2.getName()+"大"+p1.olderThen(p2)+"岁");
	}
}
