package com.internet.four;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��if-else����Լ���Ŀ���������3�����е����ֵ����Сֵ����������
	 */
public class MaxMin {
	public static void main(String[] args) {
		int max,min;	//max�������ֵ��min������Сֵ
		int x=16,y=19,z=6;
		if( x>y )
			max = x;
		else
			max = y;
		if( z>max )
			max = z;
		System.out.println("���ֵ�ǣ�"+max);
		min=x<y?x:y;
		min=z<min?z:min;
		System.out.println("��Сֵ�ǣ�"+min);
	}
}
