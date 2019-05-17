package com.internet.deal;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ͨ��ʵ�ֽӿ�Payable����һ����Ʊ֧������
	 */
public class Invoice implements Payable{
	private String partNumber;		//��Ʒ����
	private String partDescription;	//��Ʒ����
	private int quantity;			//��Ʒ����
	private double pricePerItem;	//��Ʒ����
	public Invoice(String part, String description, int count, double price) {
		//super();	//���췽��
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
				"��Ʊ","��Ʒ����",getPartNumber(),getPartDescription(),"��Ʒ����",
				getQuantity(),"��Ʒ����",getPricePerItem());
	}
	public double getPaymentAmount()		//ʵ�ֽӿ��еķ���
	{
		return getQuantity()*getPricePerItem();
	}
}
