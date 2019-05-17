package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 *最后一次修改时间：****年**月**日
	 *功能简介：利用继承性 ，通过继承CommissEmployee3类定义新类
	 */
public class BasePlusCommissionEmployee4 extends CommissionEmployee3{
	private double baseSalary;

	public BasePlusCommissionEmployee4(String name, String ID, double sales, double rate, double salary) {
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
		return getBaseSalary()+super.earnings();
	}
	public String toString() {
		return String.format("%s %s\n%s: %.2f","带底薪",super.toString(),"底薪",getBaseSalary());
	}
}
