package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ͨ��TimeTest����Time��Ĺ��ܡ�����ʵ����Time��Ķ���ͨ���������Time��ķ���
	 */
public class timeTest {
	public static void main(String[] args) {
		Time t1=new Time(8,16,36);		//08:16:36
		Time t2=new Time(26,66,66);		//00:00:00
		Time t3=new Time(t1);			//08:16:36
		System.out.printf("%s\n",t1.toUniversalString());
		System.out.printf("%s\n",t1.toString());
		System.out.printf("%s\n",t2.toUniversalString());
		System.out.printf("%s\n",t2.toString());
		System.out.printf("%s\n",t3.toUniversalString());
		System.out.printf("%s\n",t3.toString());
	}
}
