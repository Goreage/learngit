package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�����ֹ�������ʹ��
	 */
/*
 * JavaΪ��ʵ�ֿ�ƽ̨�����Բ���ö�̬�Ĳ���Ч�����������ڵ�����������Ÿ�һ��"���ֹ�����"���������
 * ���������˳�����������С��λ�ã��������ƶ��������С�������α仯�ȹ��ܣ�����Ȩ����Ӧ���������ֹ�������������ͬ��
 * ���ֹ�����ʹ�ò�ͬ�㷨�Ͳ��ԣ���������ͨ��ѡ��ͬ�Ĳ��ֹ���������������
 */
public final class FlowLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("�����ֹ�������ʹ��");
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout());
		JButton button1 = new JButton("ȷ��");
		JButton button2 = new JButton("ȡ��");
		JButton button3 = new JButton("�ر�");
		c.add(button1);
		c.add(button2);
		c.add(button3);
		app.setSize(300, 100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
