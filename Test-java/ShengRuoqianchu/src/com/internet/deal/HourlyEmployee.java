package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص�:***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�̳и���Employee������Сʱ���ಢ�����Ա���Ĺ���
	 * 
	 */
public abstract class HourlyEmployee extends Employee{
	private double wage;		//ÿСʱ����
	private double hours;		//����Сʱ��
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
		return String.format("�ӵ㹤Ա������:\n %s%s: $ %,.2f; %s: %,.2f",super.toString(),
				"����",getWage(),"����Сʱ",getHours());
	}
}
