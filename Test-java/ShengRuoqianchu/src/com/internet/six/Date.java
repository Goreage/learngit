package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ͨ��һ��������Ķ�����Ϥthis��ʹ�á� ���ڰ����꣬�£���
	 */
public class Date {
	private int year;		//��
	private int month;		//��
	private int day;		//��
	public Date(int year,int month,int day)//ָ�������Ĺ��췽������
	{
		/*
		 * ����Ա�����Ĳ����ͳ�Ա����ͬ��ʱ���ڷ���������Ҫthis���ó�Ա������
		 * this����ʡ�ԡ�����ͬ����Աʱ��this����ʡ��
		 */
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Date()		//�޲����Ĺ��췽����ʹ��Ĭ��ֵ��ʼ����Ա����������
	{
		this(2014,1,1);	//���ñ����Ѷ�����������췽��
	}
	public Date(Date oday)	//���Ѵ��ڶ��󴴽��¶���Ĺ��췽��������
	{
		this(oday.year,oday.month,oday.day);
	}
	public int getYear() {	//��ȡ��Ա������ֵ
		return year;
	}
	public void setYear(int year) {	//��Ա������ֵ
		this.year = year;
	}
	public int getMonth() {
		return this.month= ((month>=1)&(month<=12))?month:1;
	}
	public void setMonth(int month) {	//��Ա������ֵ
		this.month = month;
	}
	public int getDay() {
		return this.day=((day>=1)&(day<=31))?day:1;
	}
	public void setDay(int day) {	//��Ա������ֵ
		this.day = day;
	}
	public String toString()		//�����꣬�£��յĸ�ʽ
	{
		return this.year+"-"+this.month+"-"+this.day;	//thisָ����ǰ����
	}
	public void print()		//����꣬�£���
	{
		System.out.println("date is"+this.toString());
	}
}
