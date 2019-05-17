package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：利用继承性，通过继承CommissionEmployee2类定义新类
	 */
public class BasePlusCommissionEmployee3 extends CommissionEmployee2{
	private double baseSalary;

	public BasePlusCommissionEmployee3(String name, String ID, double sales, double rate, double salary) {
		super(name, ID, sales, rate);
		setBaseSalary(salary);
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
	public String toString() {
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"员工姓名",name,"员工工号",ID,"销售额",grossSales,"提成率",commissionRate,
				"基本底薪",baseSalary);
	}
}
