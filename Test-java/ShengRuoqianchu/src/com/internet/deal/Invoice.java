package com.internet.deal;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：通过实现接口Payable声明一个发票支付的类
	 */
public class Invoice implements Payable{
	private String partNumber;		//物品名称
	private String partDescription;	//物品功能
	private int quantity;			//物品数量
	private double pricePerItem;	//物品单价
	public Invoice(String part, String description, int count, double price) {
		//super();	//构造方法
		partNumber = part;
		partDescription = description;
		setQuantity(count);
		setPricePerItem(price);
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String part) {
		partNumber = part;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String description) {
		partDescription = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int count) {
		quantity = (count<0)?0:count;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double price) {
		pricePerItem = (price<0.0)?0.0:price;
	}
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $ %,.2f",
				"发票","物品名称",getPartNumber(),getPartDescription(),"物品数量",
				getQuantity(),"物品单价",getPricePerItem());
	}
	public double getPaymentAmount()		//实现接口中的方法
	{
		return getQuantity()*getPricePerItem();
	}
}
