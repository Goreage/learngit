package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺���ڲ���BasePlusCommissionEmployee��
	 */
public class BasePlusCommissionEmpployeeTest {
	 public static void main(String[] args) {
		 BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("��־��","000001", 1000000, .06, 3600);
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
