package com.internet.eight;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺��ʽ���ֹ�������ʹ��
	 */
public class BoxLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("��ʽ���ֹ�����");
		Container c=app.getContentPane();
		//c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));	//ˮƽ��ʽ�������
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));	//��ֱ��ʽ�������
		for (int i=0; i<3; i++) {
			String s = "��ť"+(i+1);
			JButton b = new JButton(s);
			c.add(b);
		}
		app.setSize(360, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
