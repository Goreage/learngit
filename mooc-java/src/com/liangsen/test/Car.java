package com.liangsen.test;
	/*
	 * 封装：将对象的实现细节隐藏起来，然后通过一些公用的方法来暴露该对象的功能
	 */
public class Car {
	private String name;
	private String color;
	private String speed;
	private String gas;
	private String inputTime;
	private String weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String getGas() {
		return gas;
	}
	
	public void setGas(String gas) {
		this.gas = gas;
	}
	
	public String getInputTime() {
		return inputTime;
	}
	
	public void setInputTime(String inpotTime) {
		this.inputTime = inputTime;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void run() {
		System.out.println("车的名字："+this.getName());
		System.out.println("车的颜色："+this.getColor());
		System.out.println("车的时速："+this.getSpeed());
		System.out.println("车用汽油类型："+this.getGas());
		System.out.println("车的出场时间："+this.getInputTime());
		System.out.println("车的重量："+this.getWeight());
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("蓝色");
		car.setName("民用拖拉机");
		car.setSpeed("45码/小时");
		car.setGas("97#");
		car.setInputTime("1989年12月28日");
		car.setWeight("2吨");
		car.run();
	}
}
