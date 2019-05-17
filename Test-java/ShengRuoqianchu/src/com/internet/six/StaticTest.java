package com.internet.six;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用Java类库的静态方法以及自定义的静态方法，熟悉静态方法的使用
	 */
public class StaticTest {
	public static String toChar(double x)		//声明静态方法
	{
		/*
		 * 调用Double类的toString()静态方法，其功能是将Double类型的参数值转换为String类型
		 * 并返回
		 */
		return Double.toString(x);
	}
	//main()方法是静态方法，静态方法无需实例化对象就可直接使用
	public static void main(String[] args) {
		/*
		 * 调用Math类的round()静态方法，其功能是对参数值进行四舍五入处理，并
		 * 将处理结果返回
		 */
		System.out.println(Math.round(6.5));
		String s=toChar(12.6);	//调用了StaticTest类中定义的tochar()静态方法
		System.out.println("e="+s);
	}
}
