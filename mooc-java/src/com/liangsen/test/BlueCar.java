package com.liangsen.test;

public class BlueCar extends Car{
	public static void main(String[] args) {
		BlueCar car = new BlueCar();
		car.setColor("蓝色");
		car.setName("小蓝单车");
		car.setSpeed("15码/时");
		car.setGas("null");
		car.setInputTime("2019年");
		car.setWeight("0.015吨");
		car.run();
		
	}
}
