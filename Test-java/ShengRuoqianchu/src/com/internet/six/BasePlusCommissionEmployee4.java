package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 *���һ���޸�ʱ�䣺****��**��**��
	 *���ܼ�飺���ü̳��� ��ͨ���̳�CommissEmployee3�ඨ������
	 */
public class BasePlusCommissionEmployee4 extends CommissionEmployee3{
	private double baseSalary;

	public BasePlusCommissionEmployee4(String name, String ID, double sales, double rate, double salary) {
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
		return getBaseSalary()+super.earnings();
	}
	public String toString() {
		return String.format("%s %s\n%s: %.2f","����н",super.toString(),"��н",getBaseSalary());
	}
}
