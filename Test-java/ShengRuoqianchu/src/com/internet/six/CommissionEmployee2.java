package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：封装按销售额提成的员工基本信息
	 * 特点：如果将CommissionEmployee类的变量声明为protected,扩展了CommissionEmployee类的BasePlusCommissionEmployee3
	 * 类就可以直接使用这些父类成员变量的值。为此。将CommissionEmployee2类的成员变量声明为protected.两个BasePlusCommissionEmployee
	 * 类有完全相同的功能，但BasePlusCommissionEmployee3类更易于创建和管理。
	 */
public class CommissionEmployee2 {
	protected String name;
	protected String ID;
	protected double grossSales;		//销售额
	protected double commissionRate;	//提成率
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
		return String.format("%s: %s\n%s: %.2f\n%s: %.2f","员工姓名",
				name,"员工工号",ID,"销售额",grossSales,"提成率",commissionRate);
	}
}
