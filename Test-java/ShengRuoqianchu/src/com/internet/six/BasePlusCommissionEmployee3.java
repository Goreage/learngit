package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺���ü̳��ԣ�ͨ���̳�CommissionEmployee2�ඨ������
	 */
public class BasePlusCommissionEmployee3 extends CommissionEmployee2{
	private double baseSalary;

	public BasePlusCommissionEmployee3(String name, String ID, double sales, double rate, double salary) {
		super(name, ID, sales, rate);
		setBaseSalary(salary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double salary) {
		baseSalary=(salary<0.0)?0.0:salary;
	}
	public double earnings() {
		return baseSalary+(commissionRate*grossSales);
	}
	public String toString() {
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"Ա������",name,"Ա������",ID,"���۶�",grossSales,"�����",commissionRate,
				"������н",baseSalary);
	}
}
