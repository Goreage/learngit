package com.internet.four;

import java.util.Scanner;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��switch��䣬�ж�ĳ�������ĸ�����
	 */
public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������1~12��������");
		int month = input.nextInt();
		switch ( month ) {
		case 3:
		case 4:		//����䣬�޲���������һ��case���
		case 5:System.out.println("����");break;
		case 6:
		case 7:
		case 8:System.out.println("�ļ�");break;
		case 9:
		case 10:
		case 11:System.out.println("�＾");break;
		case 12:
		case 1:
		case 2:System.out.println("����");break;
		default:System.out.println("��������·ݲ�����Ч��Χ�ڣ�");
		}
	}
}
