package com.internet.six;
	/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ͨ��һ��ģ�����ʱ�ӵĳ�����ϵ���췽��������
	 */
public class Time {
	private int hour;		//ȡֵ0~23Сʱ
	private int minute;		//ȡֵ0~59��
	private int second;		//ȡֵ0~59��
	//���췽�����ù��췽����3������
	public Time(int h,int m,int s) {
		setHour(h);		//���÷���
		setMinute(m);
		setSecond(s);
	}
	public Time(Time time)		//���ع��췽���������Ƕ���
	{
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int h) {
		hour = ((h>=0 && h<24) ? h:0);		//Сʱ��Ӧ�ڴ��ڵ���0С��24֮��
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int m) {
		minute = ((m>=0 && m<60) ? m:0);
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int s) {
		second = ((s>=0 && s<60) ? s:0);
	}
	public String toUniversalString()		//ͨ��ʱ���ʽ��ʾ(HH:MM:SS)
	{
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
	@Override
	public String toString() {
		return String.format("%d:%02d:%02d %s",
				((getHour()==0 || getHour()==12) ? 12:getHour()%12),
				getMinute(),getSecond(),(getHour()<12?"AM":"PM"));
	}	
}