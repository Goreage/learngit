package com.internet.four;
	/*
	 *�����ߣ�***
	 *�����ص㣺***
	 *����ʱ�䣺****��**��**��
	 *���һ���޸�ʱ�䣺****��**��**��
	 *���ܼ�飺ʹ��continue�������ض��������� 
	 */
public class ContinueStatement {
	public static void main(String[] args) {
		int count;
		for( count=1; count<=10; count++) {
			if(count == 5)
				continue;
			System.out.println(count);
		}
	}
}
