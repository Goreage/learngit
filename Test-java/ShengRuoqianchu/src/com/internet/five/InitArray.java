package com.internet.five;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ�ùؼ���new��ʵ������10������Ԫ�ص����飬��ʼֵΪ0��ʹ��for����������Ԫ�ص�ֵ
	 */
public class InitArray {
	public static void main(String[] args) {
		int array[];
		array = new int[ 10 ];
		System.out.printf("%s%8s\n","����Ԫ��","��Ӧ��ֵ");
		for( int i=0; i<array.length; i++)		
			System.out.printf("%6d%9d\n",i,array[i]);
	}
}
