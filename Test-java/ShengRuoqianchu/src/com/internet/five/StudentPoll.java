package com.internet.five;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺Ҫ��40��ѧ����ĳ��ʳ�õķ�����������1~10�ķ�ֵ�������ۣ�1 ��ʾ�ǳ��� 10��ʾ�ǳ��� ������
	 * 40�����۽��������һ�����������У��������۽�����з���
	 */
public class StudentPoll {
	public static void main(String[] args) {
		int responses[] = {1,2,6,4,8,5,9,7,5,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,8,
				6,7,5,6,6,5,6,7,5,6,4,8,6,8,10};
		//��������Ϊ11�����飬����ͳ��1~10��ͬ��ֵ������
		int frequency [] = new int[11];
		for( int i=0; i<responses.length; i++)
			/*
			 * ʹ���±�Ϊfrequencry[1],frequencry[2],frequencry[2],frequencry[3]
			 * frequencry[4],frequencry[5],frequencry[6],frequencry[7],frequencry[8],frequencry[9]
			 * ,frequencry[10]������Ԫ��ͳ��responses[i]�е�ֵ������Ӧ�Ľ��ͨ��++����󱣴浽����Ԫ��responses�С�����Ԫ��responses[i]�����ͱ���iһ��
			 * ����ִ���������Լ����㲢��ֵ
			 */
			++frequency[responses[i]];
		System.out.printf("%s%10s\n","���ֵ","�����˴�");
		for( int j=1; j<frequency.length; j++)
			//��������еķ������
			System.out.printf("%6d%10d\n",j,frequency[j]);
	}
}
