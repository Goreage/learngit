package com.internet.four;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��for�����i�ӵ�100�ĺ�
	 */
public class ForSum {
	public static void main(String[] args) {
		//����ѭ������i����ʼ�������ڹ���ѭ������
		int i = 1;
		//��������n����ʼ�������ڿ���ѭ������
		int n = 100;
		//��������total����ʼ��,���ڱ��������
		int total = 0;
		for ( i=1; i<=n; i++)
			total += i;
		//��ʽ�����,%d��ʾ��������ͣ��������totalֵ�ĸ�ʽ
		System.out.printf("����ǣ�%d\n",total);
	}
}
