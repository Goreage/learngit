package com.internet.four;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��for���Ķ���ѭ����ѭ�����������ѭ����䣬��Ϊ����ѭ���ṹ������žų˷���
	 */
public class Mu199 {
	public static void main(String[] args) {
		int i;
		int j;
		int n=9;
		System.out.print("   *   |");
		for( i=1; i<=n; i++)
			System.out.print("   "+i);
			System.out.print("\n-------|");
		for( i=1; i<=n; i++)
			System.out.print("----");
			System.out.println();
		for( i=1; i<=n; i++)
		{
			System.out.print("   "+i+"   |");
			for( j=1; j<=i; j++)
				System.out.print("  "+i*j);
				System.out.println();
		}
	}
}
