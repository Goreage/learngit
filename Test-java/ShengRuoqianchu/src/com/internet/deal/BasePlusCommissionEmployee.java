package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：继承父类CommissionEmployee,定义底薪加提成员工类并计算该类员工的工资
	 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;		//底薪

	public BasePlusCommissionEmployee(String name, String ID, double sales, double rate, double salary) {
		super(name, ID, sales, rate);
		setBaseSalary(salary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double salary) {
		baseSalary = (salary<0.0)?0.0:salary;
	}
	public double earnings() {
		return getBaseSalary()*1.15+super.earnings();
	}
	public String toString() {
		return String.format("%s %s; %s: $ %,.2f","底薪加提成员工的工资",super.toString(),
				"底薪",getBaseSalary());
	}
}
