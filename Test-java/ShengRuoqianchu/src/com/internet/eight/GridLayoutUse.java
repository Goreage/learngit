package com.internet.eight;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺���񲼾ֹ�����
	 */
public class GridLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("���񲼾ֹ�������ʹ��");
		Container c = app.getContentPane();
		c.setLayout(new GridLayout(2, 3));
		for ( int i=0; i<6; i++) {
			String s = "��ť" + (i+1);
			JButton b = new JButton(s);
			c.add(b);
		}
		app.setSize(266, 266);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
