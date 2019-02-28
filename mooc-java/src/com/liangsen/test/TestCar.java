package com.liangsen.test;
	/*
	 *多态：多态指的是子类的实例对象可以直接赋给父类类型的变量，但运行时依然体现出子类的行为特征，这就意味着
	 *同一个类型的对象在执行同一个方法时，表现出多种行为特征。编译时多态：该去调用那个方法
	 * 在编译期就确定了，运行时多态：调用那个方法在编译期还不确定。
	 */
public class TestCar {
	public static void main(String[] args) {
		Car OneCar = new YellowCar();
		OneCar.setColor("深黄");
		OneCar.setName("小深黄车");
		OneCar.setSpeed("69码/时");
		OneCar.setGas("98#");
		OneCar.setInputTime("some time");
		OneCar.setWeight("2.5吨");
		OneCar.run();
		System.out.println("--------------");
		Car Twocar = new BlueCar();
		Twocar.setColor("深蓝");
		Twocar.setName("海之蓝单车");
		Twocar.setSpeed("16码/时");
		Twocar.setGas("null");
		Twocar.setInputTime("2019年");
		Twocar.setWeight("0.12吨");
		Twocar.run();
	}
}
