package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：通过一个模拟电子时钟的程序，熟系构造方法的重载
	 */
public class Time {
	private int hour;		//取值0~23小时
	private int minute;		//取值0~59分
	private int second;		//取值0~59秒
	//构造方法，该构造方法有3个参数
	public Time(int h,int m,int s) {
		setHour(h);		//调用方法
		setMinute(m);
		setSecond(s);
	}
	public Time(Time time)		//重载构造方法，参数是对象
	{
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int h) {
		hour = ((h>=0 && h<24) ? h:0);		//小时数应在大于等于0小于24之间
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
	public String toUniversalString()		//通用时间格式显示(HH:MM:SS)
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