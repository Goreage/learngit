package com.liangsen.test;
	/*
	 *��̬����ָ̬���������ʵ���������ֱ�Ӹ����������͵ı�����������ʱ��Ȼ���ֳ��������Ϊ�����������ζ��
	 *ͬһ�����͵Ķ�����ִ��ͬһ������ʱ�����ֳ�������Ϊ����������ʱ��̬����ȥ�����Ǹ�����
	 * �ڱ����ھ�ȷ���ˣ�����ʱ��̬�������Ǹ������ڱ����ڻ���ȷ����
	 */
public class TestCar {
	public static void main(String[] args) {
		Car OneCar = new YellowCar();
		OneCar.setColor("���");
		OneCar.setName("С��Ƴ�");
		OneCar.setSpeed("69��/ʱ");
		OneCar.setGas("98#");
		OneCar.setInputTime("some time");
		OneCar.setWeight("2.5��");
		OneCar.run();
		System.out.println("--------------");
		Car Twocar = new BlueCar();
		Twocar.setColor("����");
		Twocar.setName("��֮������");
		Twocar.setSpeed("16��/ʱ");
		Twocar.setGas("null");
		Twocar.setInputTime("2019��");
		Twocar.setWeight("0.12��");
		Twocar.run();
	}
}
