package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：封装按销售额提成加底薪的员工的基本信息
	 * 类的特点：声明类BasePlusCommissionEmployee，并将姓名，工号，提成率，总销售额和底薪声明为
	 * private变量。这个类的每行语句都是重新编写的，虽然有很多语句与CommissionEmployee类中重复。如果
	 * 从类CommissionEmployee继承，则创建这个类的效率将大大提高。
	 */
public class BasePlusCommissionEmployee {
	private String name;
	private String ID;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;	//底薪
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
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f","员工姓名",name,
				"员工工号",ID,"销售额",grossSales,"提成率",commissionRate,"基本底薪",baseSalary);
	}
	
}
