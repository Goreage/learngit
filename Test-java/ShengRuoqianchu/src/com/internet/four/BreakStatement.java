package com.internet.four;
	/*
	 * �����ߣ�****
	 * �����ص㣺***
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��break��䣬���break��ǰ�ı���count��ֵ��������ж�ѭ��ʱcount��ֵ
	 */
public class BreakStatement {
	public static void main(String[] args) {
		int count;
		for( count=1; count<=10; count++) {
			if( count == 5)
				break;
			System.out.println(count);
		}
		System.out.println("ѭ���жϵ����ǣ�"+count);
	}
}
