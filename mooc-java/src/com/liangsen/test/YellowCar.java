package com.liangsen.test;
	/*
	 * �̳У��̳����������ʵ��������õ���Ҫ�ֶΣ�������̳и����
	 * ���ཫֱ�ӵ��ø����˽�е����Ժͷ�����
	 */
public class YellowCar extends Car{
	public static void main(String[] args) {
		YellowCar car = new YellowCar();
		car.setColor("��ɫ");
		car.setName("С�Ƴ�");
		car.setSpeed("56��/ʱ");
		car.setGas("93#");
		car.setInputTime("Anytime");
		car.setWeight("0.5��");
		car.run();
	}
}
