package com.internet.six;
	/*
	 *开发者：***
	 *开发地点：***
	 *开发时间：****年**月**日
	 *最后一次修改时间：****年**月**日
	 *功能简介：利用继承性，通过继承CommissionEmployee类定义新类
	 *声明BasePlusCommissionEmplouee2类，它对CommissinEmployee类的扩展，继承了该类，但他试图访问
	 *CommissionEmployee类的private成员，这样会导致编译错误，因为子类不能访问父类的private变量
	 */
public class BasePlusCommissionEmployee2 extends CommissionEmployee{
	private double baseSalary;
	public BasePlusCommissionEmployees(String name, String ID, double sales, double rate, double salary) {
		super(name, ID, sales, rate);
		setBaseSalary(salary);
	}
	public void setBaseSalary(double salary) {
		baseSalary= (salary<0.0)?0.0:salary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public double earnings() {
		//私有变量不能够被别的类访问，该处将报异常
		return baseSalary+(commissionRate*grossSales);
	}
	public String toString() {
		//以下试图引用父类的私有变量，将报异常
		return String.format("%s: %s\n%s: %\n%s: %.2f\n%s: %.2f\n%s: %.2f","员工姓名",name,"员工工号",ID,
				"销售额",grossSales,"提成率",commissionRate,"基本底薪",baseSalary);
	}
}