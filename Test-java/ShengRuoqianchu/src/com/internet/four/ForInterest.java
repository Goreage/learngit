package com.internet.four;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��for��������Ϣ���㡣�����������ϴ���1 000 000Ԫ����������
	 * 3.69%,���㲢���10���ÿ�����ʱ�˻���Ĵ���ܶ���㹫ʽͬ ��4-9
	 */
public class ForInterest {
	public static void main(String[] args) {
		double amount; 
		double principal = 1000000.0;
		double rate = 0.0369;
		/*��ʽ�ַ���"4s%20s\n"��ʾҪ��������ַ������͵����ݣ�����%20s��ʾ��20���ַ��ĳ���
		 * �����Ӧ�ĳ���"�������%�����ĸ�ʽ�ַ�����Ӧ������������ */
		System.out.printf("%4s%20s\n","��","����");
		for ( int year=1; year <= 10; year++) {
			amount = principal * Math.pow(1.0+rate, year);
			/*%4d��ʾ�����Ӧ��year����Ϊ4;"%,20.2f"��ʾ��Ӧ�ı���amount����Ϊ20������λ
			 * С���㲢�Ҷ��룬��������ÿ��λ�ö��Ÿ���*/
			System.out.printf("%4d%,20.2f\n",year,amount);
		}
	}
}
