package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�̳и���Employee,������нԱ���ಢ�������Ա���Ĺ���
	 */
public  class SalariedEmployee extends Employee {
	private double weeklySalary;		//Ա����н
	public SalariedEmployee(String name, String ID, double salary) {
		super(name,ID);
		setWeeklySalary(salary);
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double salary) {
		weeklySalary = salary<0.0?0.0:salary;
	}
	public double earnings() {		//���Ǹ���ķ���
		return getWeeklySalary();
	}
	//���Ǹ���ķ��������ø����toString()����������չ����ķ���
	public String toString() {
		return String.format("��нԱ���Ĺ��ʣ�\n %s %s: %,.2f",super.toString(),"����",
				getWeeklySalary());
	}
}
