package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺����һ�������࣬��װ��˾Ա���Ļ�����Ϣ��Ա�������͹��š�����toString()�������ڷ���Ա��������
	 * �͹�����Ϣ�ַ��������󷽷�earnings()����Լ����������Ĺ�ͬ�ķ������йس�����ͳ��󷽷�������
	 * Ӧ�ã�����ҵ��4��Ա������̶���н��Ա���������۶���ɵ�Ա��������н�������۶���ɵ�Ա������ʱȡ���Ա�������һ�ܹ�ʱ
	 * ����40Сʱ������Ҫ�Զ���Ĺ�ʱ֧���Ӱ�ѣ���Ŀǰ����˾�����Դ���н���������۶���ɵ�Ա������15%�ĵ�н��
	 * 	�������ó�����Employee����ʾ�����Ա��������Ϊ���࣬
	 * 				Employee
	 * SalariedEmployee		CommissionEmployee 		HourlyEmployee
	 * 						BasePlusCommissionEmployee
	 */
public abstract class Employee implements Payable {
	private String name;	//Ա������
	private String ID;		//Ա������
	public Employee(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String toString() {
		return String.format("%s:%s\n%s:%s\n","Ա������",getName(),"Ա������",getID());
	}
//	public abstract double earnings();	//�������󷽷�
}
