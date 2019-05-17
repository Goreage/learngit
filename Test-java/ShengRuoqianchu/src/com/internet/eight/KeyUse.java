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
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 */
public class KeyUse extends JFrame{
	public KeyUse() {
		super("键盘事件处理的使用");
		Container c = getContentPane();
		JTextArea ta = new JTextArea("",6,12);
		ta.addFocusListener(new FocusListener() {			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("失去焦点");
			}
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("获得焦点");
			}
		});
		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				System.out.println("键盘事件："+e.getKeyChar());
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
