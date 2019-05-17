package com.internet.five;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：回文是一种“从前向后读”和“从后到前读”都相同的字符串。如"rotor"是一个回文字符串。程序中使用了
	 * 两种算法来判断回文字符串。
	 * 算法一：
	 * 	分别从前向后和从后向前依次获得原串str的两个字符ch1, ch2,比较ch1 和ch2，如果不相等，则str肯定不是回
	 * 文字符串，令yes=false,立即退出循环，否则继续比较，直到字符全部比较完，yes的值仍为true,才能肯定str是回文串。
	 *算法二：
	 *	将原串str反转成temp串，在比较两串，如果相等则原串是回文字符串 
	 */
public class RotorString {
	public static void main(String[] args) {
		String str = "rotor";
		if (args.length>0)
			str = args[0];
		System.out.println("str="+str);
		//算法一
		boolean yes=true;
		int n=str.length();				//获取字符串长度
		int i=0;
		char ch1,ch2;
		while (yes && (i<n/2)) {
			ch1=str.charAt(i);
			ch2=str.charAt(n-i-1);
			System.out.println("ch1="+ch1+" ch2="+ch2);
			if (ch1==ch2)
				i++;
			else
				yes=false;
		}
		System.out.println("算法一："+yes);
		//算法二
		String temp="",sub1="";
		for (i=0;i<n;i++) {
			sub1=str.substring(i, i+1);	//获取字串
			temp=sub1+temp;				//连接字符串
		}
		System.out.println("temp="+temp);
		System.out.println("算法二："+str.equals(temp));
	}
}
