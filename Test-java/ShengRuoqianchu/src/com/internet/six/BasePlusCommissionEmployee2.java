package com.internet.six;
	/*
	 *�����ߣ�***
	 *�����ص㣺***
	 *����ʱ�䣺****��**��**��
	 *���һ���޸�ʱ�䣺****��**��**��
	 *���ܼ�飺���ü̳��ԣ�ͨ���̳�CommissionEmployee�ඨ������
	 *����BasePlusCommissionEmplouee2�࣬����CommissinEmployee�����չ���̳��˸��࣬������ͼ����
	 *CommissionEmployee���private��Ա�������ᵼ�±��������Ϊ���಻�ܷ��ʸ����private����
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
		//˽�б������ܹ����������ʣ��ô������쳣
		return baseSalary+(commissionRate*grossSales);
	}
	public String toString() {
		//������ͼ���ø����˽�б����������쳣
		return String.format("%s: %s\n%s: %\n%s: %.2f\n%s: %.2f\n%s: %.2f","Ա������",name,"Ա������",ID,
				"���۶�",grossSales,"�����",commissionRate,"������н",baseSalary);
	}
}