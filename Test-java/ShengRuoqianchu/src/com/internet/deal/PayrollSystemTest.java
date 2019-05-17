package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：测试上述的类
	 */
public class PayrollSystemTest {
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee("军霞","010010",1000.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("育熙","010011",99,40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("文冰",
				"010012",30000,.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
				"江伟","010013",1000,.04,300);
		System.out.println("员工工资如下：\n");
		System.out.printf("%s\n%s: %,.2f\n\n",salariedEmployee,"工资",salariedEmployee.earnings());
		System.out.printf("%s\n%s: %,.2f\n\n",hourlyEmployee,"工资",hourlyEmployee.earnings());
		System.out.printf("%s\n%s: %,.2f\n\n",commissionEmployee,"工资",commissionEmployee.earnings());
		System.out.printf("%s\n%s: %,.2f\n\n",basePlusCommissionEmployee,"工资",basePlusCommissionEmployee.earnings());
	}
}
