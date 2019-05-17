package com.internet.eight;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发者：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：边界布局管理的使用
	 */
public class BorderLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("边界布局管理器的使用");
		Container c = app.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JButton("东"),BorderLayout.EAST);
		c.add(new JButton("西"),BorderLayout.WEST);
		c.add(new JButton("南"),BorderLayout.SOUTH);
		c.add(new JButton("北"),BorderLayout.NORTH);
		app.setSize(160, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
