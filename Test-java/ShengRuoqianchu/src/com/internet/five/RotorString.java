package com.internet.five;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺������һ�֡���ǰ�������͡��Ӻ�ǰ��������ͬ���ַ�������"rotor"��һ�������ַ�����������ʹ����
	 * �����㷨���жϻ����ַ�����
	 * �㷨һ��
	 * 	�ֱ��ǰ���ʹӺ���ǰ���λ��ԭ��str�������ַ�ch1, ch2,�Ƚ�ch1 ��ch2���������ȣ���str�϶����ǻ�
	 * ���ַ�������yes=false,�����˳�ѭ������������Ƚϣ�ֱ���ַ�ȫ���Ƚ��꣬yes��ֵ��Ϊtrue,���ܿ϶�str�ǻ��Ĵ���
	 *�㷨����
	 *	��ԭ��str��ת��temp�����ڱȽ���������������ԭ���ǻ����ַ��� 
	 */
public class RotorString {
	public static void main(String[] args) {
		String str = "rotor";
		if (args.length>0)
			str = args[0];
		System.out.println("str="+str);
		//�㷨һ
		boolean yes=true;
		int n=str.length();				//��ȡ�ַ�������
		int i=0;
		char ch1,ch2;
		while (yes && (i<n/2)) {
			ch1=str.charAt(i);
			ch2=str.charAt(n-i-1);
			System.out.println("ch1="+ch1+" ch2="+ch2);
			if (ch1==ch2)
				i++;
			else
				yes=false;
		}
		System.out.println("�㷨һ��"+yes);
		//�㷨��
		String temp="",sub1="";
		for (i=0;i<n;i++) {
			sub1=str.substring(i, i+1);	//��ȡ�ִ�
			temp=sub1+temp;				//�����ַ���
		}
		System.out.println("temp="+temp);
		System.out.println("�㷨����"+str.equals(temp));
	}
}
