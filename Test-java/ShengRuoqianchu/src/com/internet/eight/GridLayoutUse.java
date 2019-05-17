package com.internet.eight;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：网格布局管理器
	 */
public class GridLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("网格布局管理器的使用");
		Container c = app.getContentPane();
		c.setLayout(new GridLayout(2, 3));
		for ( int i=0; i<6; i++) {
			String s = "按钮" + (i+1);
			JButton b = new JButton(s);
			c.add(b);
		}
		app.setSize(266, 266);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
