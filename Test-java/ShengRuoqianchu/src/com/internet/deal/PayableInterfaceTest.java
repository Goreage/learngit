package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣻****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�����࣬������ʹ���˼򻯵�for��䣬����Ҳ���Գ��Խ����Ϊ��ͨfor���
	 */
public class PayableInterfaceTest {
	public static void main(String[] args) {
		Payable payableObjects[] = new Payable[4];
		payableObjects[0] = new Invoice("01234","�ƶ�Ӳ��",2,375.00);
		payableObjects[1] = new Invoice("56789","U��",4,79.00);
		payableObjects[2] = new SalariedEmployee("С����","010010",2000.00);
		payableObjects[3] = new SalariedEmployee("С��","010010",1200.00);
		System.out.println("��Ʊ��Ա�����������\n");
		//ʹ�ü򻯵�for��䣬�����������������Ԫ��
		for ( Payable currentPayable:payableObjects) {
			System.out.printf("%s \n%s: $ %.2f\n\n",currentPayable.toString(),
					"Ӧ֧��",currentPayable.getPaymentAmount());
		}
	}	
}
