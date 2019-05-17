package com.internet.eight;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 */
public class KeyUse extends JFrame{
	public KeyUse() {
		super("�����¼������ʹ��");
		Container c = getContentPane();
		JTextArea ta = new JTextArea("",6,12);
		ta.addFocusListener(new FocusListener() {			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("ʧȥ����");
			}
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("��ý���");
			}
		});
		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				System.out.println("�����¼���"+e.getKeyChar());
			}
		});
		c.add(ta, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		KeyUse app = new KeyUse();
		app.setSize(260, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
