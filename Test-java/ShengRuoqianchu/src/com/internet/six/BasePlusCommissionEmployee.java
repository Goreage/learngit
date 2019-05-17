package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺��װ�����۶���ɼӵ�н��Ա���Ļ�����Ϣ
	 * ����ص㣺������BasePlusCommissionEmployee���������������ţ�����ʣ������۶�͵�н����Ϊ
	 * private������������ÿ����䶼�����±�д�ģ���Ȼ�кܶ������CommissionEmployee�����ظ������
	 * ����CommissionEmployee�̳У��򴴽�������Ч�ʽ������ߡ�
	 */
public class BasePlusCommissionEmployee {
	private String name;
	private String ID;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;	//��н
	public BasePlusCommissionEmployee(String name, String ID, double sales, double rate, double salary) {
		this.name=name;
		this.ID=ID;
		setGrossSales(sales);
		setCommissionRate(rate);
		setBaseSalary(salary);
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
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double sales) {
		grossSales=(sales<0.0)?0.0:sales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double rate) {
		commissionRate=(rate>0.0&&rate<1.0)?rate:0.0;
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
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f","Ա������",name,
				"Ա������",ID,"���۶�",grossSales,"�����",commissionRate,"������н",baseSalary);
	}
	
}
