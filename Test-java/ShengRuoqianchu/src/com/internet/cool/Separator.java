package com.internet.cool;
	/*
	 * ������:***
	 * �����ص�:***
	 * ����ʱ��:****��**��**��
	 * ����޸�ʱ��:****��**��**��
	 * ���ܼ��:������ʾ���ָ�����ʹ�á���������һ�����飬Ȼ��ͨ��for���������ֵȡ������ӣ�������������
	 */
public class Separator {
	public static void main(String args[]) {
		//�������ͱ���i��sum����ʼ��
		int i, sum=0;
		//������������a����ʼ��
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		//ѭ���������ʵ���������
		for( i=0; i<a.length; i++)
		{
			//�������鲢������
			sum += a[i];	
		}//for������
		System.out.println(sum);
	}//main()��������
}//��Separator����
