package com.internet.four;

import java.util.Scanner;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��switch��䣬�ж���������������ڼ�
	 */
public class SwitchWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������1~7��������");
		int day = input.nextInt();	//Scanner������÷�����ȡһ������
		switch(day) {
		case 7:System.out.println("������");break;
		case 1:System.out.println("����һ");break;
		case 2:System.out.println("���ڶ�");break;
		case 3:System.out.println("������");break;
		case 4:System.out.println("������");break;
		case 5:System.out.println("������");break;
		case 6:System.out.println("������");break;
		default:System.out.println("����������ڲ�����Ч��Χ�ڣ�");
		}
	}
}