package com.internet.four;

import java.util.Scanner;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺if���Ƕ�׵ģ������ж�ĳ���������ĸ�����
	 */
public class StatementNestedSeason {
	public static void main(String[] args) {
		String season;		//season���ڱ�ʾ����
		int month = 0;		//month��ʾ�����һ���·�
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		if(month==3 || month==4 || month==5)
			season="����";
		else if(month==6 || month==7 || month==8)
			season="�ļ�";
		else if(month==9 || month==10 || month==11)
			season="�＾";
		else if(month==12 ||month==1 || month==2)
			season="����";
		else
			season="�Բ�����ѡ����·ݲ���1~12�£�����һ���ļ���";
		System.out.println(season);
	}
}
