package com.internet.Error;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�����Զ����쳣��
	 */
public class AgeException extends Exception{	//�Զ�����Ч�����쳣��
	public AgeException(String s)
	{
		super(s);			//���ø��๹�췽��
	}
	public AgeException()
	{
		this("");
	}
}
