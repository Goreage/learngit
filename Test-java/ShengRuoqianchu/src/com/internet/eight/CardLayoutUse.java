package com.internet.eight;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺��Ƭ���ֹ�������ʹ��
	 */
public class CardLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("��Ƭ���ֹ�������ʹ��");
		Container c = app.getContentPane();
		CardLayout card = new CardLayout();
		c.setLayout(card);
		for(int i=0; i<6; i++) {
			String s = "��ť" + (i+1);
			JButton b = new JButton(s);
			c.add(b,s);
		}
		card.show(c, "��ť1");
		card.next(c);
		app.setSize(260, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
