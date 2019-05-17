package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 功能简介：封装按销售额提成的员工基本信息
	 * 备注：声明类CommissionEmployee,并将姓名，工号，提成率和总销售额声明为private变量
	 */
public class CommissionEmployee {
	private String name;		//员工姓名
	private String ID;			//员工工号
	private double grossSales;	//销售额
	private double commissionRate;	//提成率
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
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f","员工姓名",name,
				"员工工号",ID,"销售额",grossSales,"提成率",commissionRate);
		
	}	
}