package com.internet.eight;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ߣ�***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺�߽粼�ֹ����ʹ��
	 */
public class BorderLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("�߽粼�ֹ�������ʹ��");
		Container c = app.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JButton("��"),BorderLayout.EAST);
		c.add(new JButton("��"),BorderLayout.WEST);
		c.add(new JButton("��"),BorderLayout.SOUTH);
		c.add(new JButton("��"),BorderLayout.NORTH);
		app.setSize(160, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
