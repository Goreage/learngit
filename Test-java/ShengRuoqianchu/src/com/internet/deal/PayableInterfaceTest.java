package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间；****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：测试类，本例中使用了简化的for语句，读者也可以尝试将其改为普通for语句
	 */
public class PayableInterfaceTest {
	public static void main(String[] args) {
		Payable payableObjects[] = new Payable[4];
		payableObjects[0] = new Invoice("01234","移动硬盘",2,375.00);
		payableObjects[1] = new Invoice("56789","U盘",4,79.00);
		payableObjects[2] = new SalariedEmployee("小李子","010010",2000.00);
		payableObjects[3] = new SalariedEmployee("小贾","010010",1200.00);
		System.out.println("发票和员工工资情况：\n");
		//使用简化的for语句，遍历整个数组的所有元素
		for ( Payable currentPayable:payableObjects) {
			System.out.printf("%s \n%s: $ %.2f\n\n",currentPayable.toString(),
					"应支付",currentPayable.getPaymentAmount());
		}
	}	
}
