package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺����������
	 */
public class DateTest {
	public static void main(String[] args) {
		Date oday1=new Date();		//Ĭ�ϲ����Ĺ��췽��
		Date oday2=new Date(2014,1,2);	//ָ�������Ĺ��췽��
		Date oday3=new Date(oday2);		//����֪���󴴽��¶���Ĺ��췽��
		oday1.print();
		oday2.print();
		oday3.print();
	}
}
