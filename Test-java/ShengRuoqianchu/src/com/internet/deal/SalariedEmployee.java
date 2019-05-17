package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：继承父类Employee,定义周薪员工类并计算该类员工的工资
	 */
public  class SalariedEmployee extends Employee {
	private double weeklySalary;		//员工周薪
	public SalariedEmployee(String name, String ID, double salary) {
		super(name,ID);
		setWeeklySalary(salary);
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double salary) {
		weeklySalary = salary<0.0?0.0:salary;
	}
	public double earnings() {		//覆盖父类的方法
		return getWeeklySalary();
	}
	//覆盖父类的方法，调用父类的toString()方法，并扩展父类的方法
	public String toString() {
		return String.format("周薪员工的工资：\n %s %s: %,.2f",super.toString(),"工资",
				getWeeklySalary());
	}
}
