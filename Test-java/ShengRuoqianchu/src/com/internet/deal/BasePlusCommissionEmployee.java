package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�̳и���CommissionEmployee,�����н�����Ա���ಢ�������Ա���Ĺ���
	 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;		//��н

	public BasePlusCommissionEmployee(String name, String ID, double sales, double rate, double salary) {
		super(name, ID, sales, rate);
		setBaseSalary(salary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double salary) {
		baseSalary = (salary<0.0)?0.0:salary;
	}
	public double earnings() {
		return getBaseSalary()*1.15+super.earnings();
	}
	public String toString() {
		return String.format("%s %s; %s: $ %,.2f","��н�����Ա���Ĺ���",super.toString(),
				"��н",getBaseSalary());
	}
}
