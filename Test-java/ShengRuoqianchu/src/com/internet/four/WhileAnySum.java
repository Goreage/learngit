package com.internet.four;

import java.util.Scanner;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺��while�����Ӽ���������������double������ֵ�ĺ�
	 */
public class WhileAnySum {
	public static void main(String[] args) {
		double x=0;
		double sum=0;
		int i=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������������ÿ����һ������Enter��Tab�����߿ո��ȷ�ϣ�");
		//hasNextDouble()�����ж���������Ƿ���double���͵�����
		while( input.hasNextDouble()) {
			x = input.nextDouble();
			sum += x;
			i++;
		}
		System.out.println("������"+i+"���������Ϊ��"+sum);
	}
}
