package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：封装按销售额提成的员工基本信息
	 * 特点：将CommissionEmployee2类中的变量重新设置为private定义CommissionEmployee3类
	 * 的封装性，然后通过扩展CommissionEmployee3类，创建一个BasePlusCommmissionEmployee4
	 * 类，它用CommissionEmployee3类的public方法来操作CommissionEmployee3类的private变量
	 */
public class CommissionEmployee3 {
	private String name;
	private String ID;
	private double grossSales;			//销售额
	private double commissionRate;		//提成率
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
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f","员工姓名",
				getName(),"员工工号",getID(),"销售额",getGrossSales(),
				"提成率",getCommissionRate());
	}
}
