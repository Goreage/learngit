package com.internet.four;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��do-while�����1�ӵ�100�ĺ�
	 */
public class DowhileSum {
	public static void main(String[] args) {
		int i=1;
		int n=100;
		int sum=0;
		do {
			sum += i;
			i++;
		}while( i <= n);
		System.out.println("1�ӵ�100�ĺ��ǣ�"+sum);
		System.out.println("ѭ�������i��ֵ�ǣ�"+i);
	}
}
