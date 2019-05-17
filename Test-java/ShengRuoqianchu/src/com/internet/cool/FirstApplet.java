package com.internet.cool;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//FirstApplet.java
/*
	 * 开发者:***\
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间:****年**月**日
	 * 功能简介：Applet小应用程序
 */
public class FirstApplet extends JApplet {

	//重载父类 JApplet 中的paint()方法
	public void paint(Graphics g) {
		//设置字符串颜色
		g.setColor(Color.red);
		//在页面上指定位置显示字符串
		g.drawString("Applet小应用程序", 60, 60);
	}//paint()方法结束
}//类FirstApplet结束
