package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：继承父类Employee,定义按销售提成员工类并计算该类员工工资
	 */
public abstract class CommissionEmployee extends Employee{
	private double grossSales;		//销售额
	private double commissionRate;	//提成率
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
	public double earnings() {		//覆盖父类的方法
		return getCommissionRate()*getGrossSales();
	}
	//覆盖父类的方法，调用父类toString()方法，并扩展父类的方法'
	public String toString() {
		return String.format("%s: \n%s\n%s: %.2f; %s: %.2f","销售提成员工的工资",
				super.toString(),"销售额",getGrossSales(),"提成率",getCommissionRate());
	}
}
