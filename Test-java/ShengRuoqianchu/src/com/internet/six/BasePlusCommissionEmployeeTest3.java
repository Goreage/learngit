package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺���ڲ���CommissionEmployee2��BasePlusCommissionEmployee3�е���
	 */
public class BasePlusCommissionEmployeeTest3 {
	public static void main(String[] args) {
		BasePlusCommissionEmployee3 employee = new BasePlusCommissionEmployee3
				("��־��","000001",1000000,.06,3600);
		System.out.println("Ա������������£�\n");
		System.out.printf("%s %s\n","Ա������",employee.getName());
		System.out.printf("%s %s\n","Ա������",employee.getID());
		System.out.printf("%s %s\n","���۶�",employee.getGrossSales());
		System.out.printf("%s %s\n","�����",employee.getCommissionRate());
		System.out.printf("%s %s\n","��н",employee.getBaseSalary());
		System.out.printf("%s %s\n","Ա������",employee.earnings());
		employee.setGrossSales(2000000);
		System.out.printf("\n%s:\n\n%s\n","�����Ժ��Ա����Ϣ",employee.toString());
		System.out.printf("%s %.2f\n","Ա������",employee.earnings());
	}
}
