package com.internet.cool;
	/*
	 * ������:***
	 * ����ʱ��:***
	 * ����ʱ��:****��**��**��
	 * ���һ���޸�ʱ��:****��**��**��
	 * ���ܼ��:��֤��������ת��
	 */
public class TypeConversion {
	public static void main(String[] args) {
		int x=100;
		//��ʽ����ת��
		long y=x;
		System.out.println("����ת��:����"+x+"ת��Ϊ������"+y);
		double d=56789;
		//��ʾ����ת������ǿ������ת��
		int a=(int)d;
		System.out.println("����ת��:����"+d+"װ��Ϊint����"+a);
	}
}
