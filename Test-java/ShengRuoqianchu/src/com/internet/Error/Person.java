package com.internet.Error;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ���׳��쳣���ܡ�����һ��Person�࣬��װ���������䣬���ԱȽ���������Ĵ�С
	 */
public class Person {
	private String name;	//����
	private int age;		//����
	public Person(String name, int age) {	//���췽��
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null || name=="")
			this.name="����δ֪";
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
				throw new Exception("������Ч");	//�׳��쳣����
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Override
	public String toString() {
		return getName()+","+getAge()+"��";
	}
	public int olderThen(Person p2)
	{
		return this.getAge()-p2.getAge();	//�Ƚ������˵�����
	}
	public static void main(String[] args) {
		Person p1 = new Person("С����",36);
		System.out.println(p1.toString());
		Person p2 = new Person("С��",26);
		System.out.println(p2.toString());
		System.out.println(p1.getName()+"��"+p2.getName()+"��"+p1.olderThen(p2)+"��");
	}
}
