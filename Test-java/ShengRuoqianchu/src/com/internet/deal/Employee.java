package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：声明一个抽象类，封装公司员工的基本信息，员工姓名和工号。声明toString()方法用于返回员工的姓名
	 * 和工号信息字符串。抽象方法earnings()用于约定所有子类的共同的方法。有关抽象类和抽象方法的内容
	 * 应用：该企业用4类员工：领固定周薪的员工，按销售额提成的员工，带底薪并按销售额提成的员工，计时取酬的员工（如果一周工时
	 * 超过40小时，则还需要对额外的工时支付加班费）。目前，公司决定对带底薪并按照销售额提成的员工增加15%的底薪。
	 * 	本程序用抽象类Employee来表示广义的员工，并作为父类，
	 * 				Employee
	 * SalariedEmployee		CommissionEmployee 		HourlyEmployee
	 * 						BasePlusCommissionEmployee
	 */
public abstract class Employee implements Payable {
	private String name;	//员工姓名
	private String ID;		//员工工号
	public Employee(String name, String ID) {
		this.name = name;
		this.ID = ID;
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
	public String toString() {
		return String.format("%s:%s\n%s:%s\n","员工姓名",getName(),"员工工号",getID());
	}
//	public abstract double earnings();	//声明抽象方法
}
