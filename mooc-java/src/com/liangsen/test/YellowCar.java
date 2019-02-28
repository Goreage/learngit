package com.liangsen.test;
	/*
	 * 继承：继承是面向对象实现软件重用的重要手段，当子类继承父类后，
	 * 子类将直接调用父类非私有的属性和方法。
	 */
public class YellowCar extends Car{
	public static void main(String[] args) {
		YellowCar car = new YellowCar();
		car.setColor("黄色");
		car.setName("小黄车");
		car.setSpeed("56码/时");
		car.setGas("93#");
		car.setInputTime("Anytime");
		car.setWeight("0.5吨");
		car.run();
	}
}
