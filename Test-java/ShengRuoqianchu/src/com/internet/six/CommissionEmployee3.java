package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺��װ�����۶���ɵ�Ա��������Ϣ
	 * �ص㣺��CommissionEmployee2���еı�����������Ϊprivate����CommissionEmployee3��
	 * �ķ�װ�ԣ�Ȼ��ͨ����չCommissionEmployee3�࣬����һ��BasePlusCommmissionEmployee4
	 * �࣬����CommissionEmployee3���public����������CommissionEmployee3���private����
	 */
public class CommissionEmployee3 {
	private String name;
	private String ID;
	private double grossSales;			//���۶�
	private double commissionRate;		//�����
	public CommissionEmployee3(String name, String ID, double sales, double rate) {
		super();
		this.name = name;
		this.ID = ID;
		setGrossSales(sales);
		setCommissionRate(rate);
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
		commissionRate=(rate>0.0 && rate<1.0)?rate:0.0;
	}
	public double earnings() {
		return getCommissionRate()*getGrossSales();
	}
	public String toString() {
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f","Ա������",
				getName(),"Ա������",getID(),"���۶�",getGrossSales(),
				"�����",getCommissionRate());
	}
}
