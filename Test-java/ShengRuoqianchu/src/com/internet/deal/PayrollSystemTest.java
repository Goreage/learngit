package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺������������
	 */
public class PayrollSystemTest {
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee("��ϼ","010010",1000.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("����","010011",99,40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("�ı�",
				"010012",30000,.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
				"��ΰ","010013",1000,.04,300);
		System.out.println("Ա���������£�\n");
		System.out.printf("%s\n%s: %,.2f\n\n",salariedEmployee,"����",salariedEmployee.earnings());
		System.out.printf("%s\n%s: %,.2f\n\n",hourlyEmployee,"����",hourlyEmployee.earnings());
		System.out.printf("%s\n%s: %,.2f\n\n",commissionEmployee,"����",commissionEmployee.earnings());
		System.out.printf("%s\n%s: %,.2f\n\n",basePlusCommissionEmployee,"����",basePlusCommissionEmployee.earnings());
	}
}
