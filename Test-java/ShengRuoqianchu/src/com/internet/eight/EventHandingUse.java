package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ص㣺****
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�¼�����ļ�Ӧ��
	 */
public class EventHandingUse {
	public EventHandingUse() {
		JFrame app = new JFrame("�¼�����");
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("������");			//�¼�Դ
		b.addActionListener(new ButtonHandler());	//���¼�Դ��Ӽ��
		c.add(b);
		app.setSize(200, 100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	/*
	 * ����һ���ڲ���ButtonHandler,ʵ�ּ������ӿڣ��������ڼ����������Ӧ���¼�������
	 * �¼����д����¼���������Ҫִ�еľ��������actionPerformed(ActionEvent e)
	 * ����������
	 */
	class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//����Ľ����:�ڿ���̨���"���������¼�Դ��"
			System.out.println("�㴥�����¼�Դ��");
		}
	}
	public static void main(String[] args) {
		new EventHandingUse();
	}
}
