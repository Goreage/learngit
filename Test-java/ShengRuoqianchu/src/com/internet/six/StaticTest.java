package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��Java���ľ�̬�����Լ��Զ���ľ�̬��������Ϥ��̬������ʹ��
	 */
public class StaticTest {
	public static String toChar(double x)		//������̬����
	{
		/*
		 * ����Double���toString()��̬�������书���ǽ�Double���͵Ĳ���ֵת��ΪString����
		 * ������
		 */
		return Double.toString(x);
	}
	//main()�����Ǿ�̬��������̬��������ʵ��������Ϳ�ֱ��ʹ��
	public static void main(String[] args) {
		/*
		 * ����Math���round()��̬�������书���ǶԲ���ֵ�����������봦����
		 * ������������
		 */
		System.out.println(Math.round(6.5));
		String s=toChar(12.6);	//������StaticTest���ж����tochar()��̬����
		System.out.println("e="+s);
	}
}
