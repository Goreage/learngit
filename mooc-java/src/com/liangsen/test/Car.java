package com.liangsen.test;
	/*
	 * ��װ���������ʵ��ϸ������������Ȼ��ͨ��һЩ���õķ�������¶�ö���Ĺ���
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
		System.out.println("�������֣�"+this.getName());
		System.out.println("������ɫ��"+this.getColor());
		System.out.println("����ʱ�٣�"+this.getSpeed());
		System.out.println("�����������ͣ�"+this.getGas());
		System.out.println("���ĳ���ʱ�䣺"+this.getInputTime());
		System.out.println("����������"+this.getWeight());
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("��ɫ");
		car.setName("����������");
		car.setSpeed("45��/Сʱ");
		car.setGas("97#");
		car.setInputTime("1989��12��28��");
		car.setWeight("2��");
		car.run();
	}
}
