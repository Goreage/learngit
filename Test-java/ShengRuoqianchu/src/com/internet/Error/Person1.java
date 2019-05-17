package com.internet.Error;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�Զ����쳣���ʹ��
	 */
public class Person1 {
	private String name;		//����
	private int age;			//����
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
			this.name="����δ֪";
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
		return getName()+","+getAge()+"��";
	}
	public void print()
	{
		System.out.println(this.toString());
	}
	public static void main(String[] args) {
		Person1 p1 = null;
		try {
			//�����������׳��쳣�ķ���
			p1 = new Person1("С����",36);
			p1.setAge(161);
		}catch(AgeException e)		//�����Զ����쳣�࣬����Exception��
		{
			e.printStackTrace();	//����쳣ջ������Ϣ
		}
		finally
		{
			p1.print();
		}
	}
}
