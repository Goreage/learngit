package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点:***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：继承父类Employee，定义小时工类并计算该员工的工资
	 * 
	 */
public abstract class HourlyEmployee extends Employee{
	private double wage;		//每小时工资
	private double hours;		//工作小时数
	public HourlyEmployee(String name, String ID, double hourlyWage, double hoursWorked) {
		super(name, ID);
		setWage(hourlyWage);
		setHours(hoursWorked);
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double hourlyWage) {
		wage = (hourlyWage<0.0)?0.0:hourlyWage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hoursWorked) {
		hours = ((hoursWorked>=0.0)&&(hoursWorked<=168.0))?hoursWorked:0.0;
	}
	public double earnings() {
		if(getHours() <= 40)
			return getWage()*getHours();
		else
			return 40*getWage() + (getHours() - 40)*getWage()*1.5;
	}
	public String toString() {
		return String.format("钟点工员工工资:\n %s%s: $ %,.2f; %s: %,.2f",super.toString(),
				"工资",getWage(),"多少小时",getHours());
	}
}
