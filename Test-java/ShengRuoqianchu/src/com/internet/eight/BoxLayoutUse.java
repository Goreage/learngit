package com.internet.eight;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：盒式布局管理器的使用
	 */
public class BoxLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("盒式布局管理器");
		Container c=app.getContentPane();
		//c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));	//水平方式排列组件
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));	//垂直方式排列组件
		for (int i=0; i<3; i++) {
			String s = "按钮"+(i+1);
			JButton b = new JButton(s);
			c.add(b);
		}
		app.setSize(360, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
