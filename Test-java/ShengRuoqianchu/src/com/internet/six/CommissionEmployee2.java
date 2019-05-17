package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺��װ�����۶���ɵ�Ա��������Ϣ
	 * �ص㣺�����CommissionEmployee��ı�������Ϊprotected,��չ��CommissionEmployee���BasePlusCommissionEmployee3
	 * ��Ϳ���ֱ��ʹ����Щ�����Ա������ֵ��Ϊ�ˡ���CommissionEmployee2��ĳ�Ա��������Ϊprotected.����BasePlusCommissionEmployee
	 * ������ȫ��ͬ�Ĺ��ܣ���BasePlusCommissionEmployee3������ڴ����͹���
	 */
public class CommissionEmployee2 {
	protected String name;
	protected String ID;
	protected double grossSales;		//���۶�
	protected double commissionRate;	//�����
	public CommissionEmployee2(String name, String ID, double sales, double rate) {
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
		return commissionRate*grossSales;
	}
	public String toString() {
		return String.format("%s: %s\n%s: %.2f\n%s: %.2f","Ա������",
				name,"Ա������",ID,"���۶�",grossSales,"�����",commissionRate);
	}
}
