package com.internet.five;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ�ùؼ���new��ʵ������6������Ԫ�ص���ֵ����ʼ����Ȼ���������Ԫ�ص�ֵ
	 */
public class InitArray1 {
	public static void main(String[] args) {
		int array[] = {66,86,87,88,89,99};
		System.out.printf("%s%9s\n","����Ԫ��","��Ӧ��ֵ");
		for( int i=0; i<array.length; i++ )
			System.out.printf("%6d%9d\n",i,array[i]);
	}
}
