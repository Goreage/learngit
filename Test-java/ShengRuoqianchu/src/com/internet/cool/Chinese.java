package com.internet.cool;

import java.util.Random;

//package �ǹؼ��֣� ���ڴ����� com.interbet.coolΪ����
/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�������дChinese�࣬����ʾ��Java����Ļ����ṹ
 */
//����Chinese����ʹ�õ���Random�����У�java.utilΪ������importΪ�ؼ���
public class Chinese {
	/*
	 * �ڹ淶��Java�����У���Ա����һ������Ϊ˽��Ȩ�ޣ�name�Ǳ����������ڱ�������
	 */
	private String name;
	//sex �Ǳ����������ڱ����Ա�
	private String sex;
	//ʵ�����������ڳ�ʼ����Ա���� luckyN
	Random luckyN = new Random();
	//������Ĺ��췽����������ʵ��������ʱ��ʼ����Ա����
	public Chinese(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	//�淶��Java����У�setName(String name)�����������ó�Ա����name��ֵ
	public void setName(String name) {
		this.name = name;
	}
	//�淶��Java����У� getName()�������ڻ�ȡ��Ա������name��ֵ
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	//����Chinese���еĳ�Ա�����ķ������÷���ʵ�ֵĹ������������Ļ�����Ϣ
	public void myInformation() {
		//�����+�����ַ�������
		System.out.println("�ҵ����ֽ�:"+getName()+",����һ��:"+getSex()+"��!");
	}
	public void chineseDream() {
		System.out.println("���ǵ��й�����:ʵ���л�����ΰ����!");
	}
	//����Chinese���еĳ�Ա�������÷���ʵ�ֵĹ��������������ʾ��Ϣ
	public void myDream() {
		System.out.println("�ҵ��й�����:��Ϊһ������ĳ���Ա��ʵ���Լ����й���!");
	}
	//����Chinese���еĳ�Ա�������÷���ʵ�ֵĹ���������������
	public void luckyNumber() {
		System.out.println(1+luckyN.nextInt(1000));
	}
	//�������г���main�ķ���
	public static void main(String[] args) {
		//ʵ��������
		Chinese chinese = new Chinese("Goerage","��");
		//������÷�����ִ�й���
		chinese.myInformation();
		chinese.chineseDream();
		chinese.myDream();
		chinese.luckyNumber();
	}
}
