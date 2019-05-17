package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�̳и���Employee,���尴�������Ա���ಢ�������Ա������
	 */
public abstract class CommissionEmployee extends Employee{
	private double grossSales;		//���۶�
	private double commissionRate;	//�����
	public CommissionEmployee(String name, String ID, double sales, double rate) {
		super(name, ID);
		setGrossSales(sales);
		setCommissionRate(rate);
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double sales) {
		grossSales = (sales<0.0)?0.0:sales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double rate) {
		commissionRate = (rate>0&&rate<1.0)?rate:0.0;
	}
	public double earnings() {		//���Ǹ���ķ���
		return getCommissionRate()*getGrossSales();
	}
	//���Ǹ���ķ��������ø���toString()����������չ����ķ���'
	public String toString() {
		return String.format("%s: \n%s\n%s: %.2f; %s: %.2f","�������Ա���Ĺ���",
				super.toString(),"���۶�",getGrossSales(),"�����",getCommissionRate());
	}
}
