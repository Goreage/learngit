package com.internet.eight;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ��������ʵ�ּ򵥵��¼�����
	 */
public class EventHandingUsel extends JFrame{
	public EventHandingUsel() {
		super("ʹ����������¼�����");
		Container c=getContentPane();
		JButton b=new JButton("����0��");
		b.addActionListener(new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();
				b.setText("����"+(++count)+"��");
			}	//actionPerformed()��������
		}		//ʵ�ֽӿ�ActionListener�����������
		);	//addActionListener()��������
		/*
		 * JFrameĬ�ϵĲ��ֹ�������BorderLayout,δ����setLayout()�����ͱ�ʾ
		 * ʹ�õ���Ĭ�ϲ��ֹ�����
		 */
		c.add(b,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		EventHandingUsel app = new EventHandingUsel();
		app.setSize(260,100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			app.setVisible(true);
	}
}
