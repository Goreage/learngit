package com.internet.four;
	/*
	 * ����������return�������ֹ��ǰ�ĳ�Ա������ִ�У����ص����ø÷�����λ�ã����ӽ����õ���������һ�����
	 * ���������ִ�С�����÷����ķ������Ͳ���void������Ҫ�ṩ���͵ķ���ֵ��return�������������ʹ�ø�ʽ
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��return��䷵���ַ���
	 */
public class ReturnStatement {
	public String patriotic() {
		return "�Ұ��ҵ�������Ұ��ҵļ��磡";
	}
	public static void main(String[] args) {
		ReturnStatement rs = new ReturnStatement();
		System.out.println(rs.patriotic());
	}
}
