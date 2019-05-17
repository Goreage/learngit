package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���ܼ�飺��װ�����۶���ɵ�Ա��������Ϣ
	 * ��ע��������CommissionEmployee,�������������ţ�����ʺ������۶�����Ϊprivate����
	 */
public class CommissionEmployee {
	private String name;		//Ա������
	private String ID;			//Ա������
	private double grossSales;	//���۶�
	private double commissionRate;	//�����
	public CommissionEmployee(String name,String ID,double sales,double rate) {
		this.name=name;
		this.ID=ID;
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
	public void setID(String iD) {
		ID = iD;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double sales) {
		grossSales= (sales<0.0)?0.0:sales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double rate) {
		commissionRate = (rate>0.0&&rate<1.0)?rate:0.0;
	}
	public double earnings() {
		return commissionRate*grossSales;
	}
	public String toString() {
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f","Ա������",name,
				"Ա������",ID,"���۶�",grossSales,"�����",commissionRate);
		
	}	
}