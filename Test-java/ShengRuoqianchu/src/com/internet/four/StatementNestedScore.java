package com.internet.four;

import java.util.Scanner;
/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺if���Ƕ��ʹ�ã������жϿ��Եȼ���������100���ƣ��жϵȼ���׼Ϊ���㣨���ڵ���90�֣������ã����ڵ���80�֣�С��90�֣�
	 * �еȣ����ڵ���70�֣�С��80�֣������񣨴��ڵ���60�� С��70�֣���������С��60�֣������������ʵ����������һ��100���ڵķǸ������гɼ��ȼ��ж�
	 */
public class StatementNestedScore {
	public static void main(String[] args) {
		float score;
		Scanner input=new Scanner(System.in);
		System.out.println("������ɼ���");
		score = input.nextFloat();	
		if(score<90)
			if(score<80)
				if(score<70)
					if(score<60)
						System.out.println("��ĳɼ��ȼ�Ϊ��������");
					else
						System.out.println("��ĳɼ��ȼ�Ϊ������");
				else
					System.out.println("��ĳɼ��ȼ�Ϊ���еȣ�");
			else
				System.out.println("��ĳɼ��ȼ�Ϊ�����ã�");
			else
				System.err.println("��ĳɼ��ȼ�Ϊ�����㣡");
	}
}
