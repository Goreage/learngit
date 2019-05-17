package com.internet.eight;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：卡片布局管理器的使用
	 */
public class CardLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("卡片布局管理器的使用");
		Container c = app.getContentPane();
		CardLayout card = new CardLayout();
		c.setLayout(card);
		for(int i=0; i<6; i++) {
			String s = "按钮" + (i+1);
			JButton b = new JButton(s);
			c.add(b,s);
		}
		card.show(c, "按钮1");
		card.next(c);
		app.setSize(260, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
