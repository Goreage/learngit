package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ�üܹ��ͶԻ������һ��ͼ���û����棬�������к󽫵���һ���Ի���
	 */
public class JDialogUse {
	/*
	 * �Ի�����һ�ֿ��ƶ��Ĵ��ڣ��ȿ�ܼ򵥣�û����ô��Ŀ���Ԫ�أ�����С����״̬�����Ի���ͨ���������
	 * ����������ϵ�Ĵ��ڣ�ͨ�������еĴ����ϴ����Ի��򡣳����еĴ��ڳ�Ϊ�����ڣ��´����ĶԻ��������Ӵ��ڡ�
	 * 	�Ի����Ϊģ̬���ģ̬����һ��ģ̬�ĶԻ����ʱ�����������Ӧ�ó����е��������ڣ�ֱ���öԻ���رգ�
	 * ����һ����ģ̬�ĶԻ����ʱ���û����ÿ��Է�����������
	 */
	public static void main(String[] args) {
		JFrame app = new JFrame("�Ի����ʹ��");
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		app.setSize(300, 300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		/*
		 * ʹ��javax.swing.JDialog��Ĺ��췽��JDialog(Frame owner, String title, boolean model).
		 * ownerָ����Ӧ�ĸ����ڣ�title���öԻ���ı��⣬modal��ʾ�Ի����ģʽ�����֮Ϊtrue��ʾģ̬������Ϊ��ģ̬
		 */
		JDialog d = new JDialog(app, "�Ի���", false);
		d.setSize(200, 100);
		d.setVisible(true);
	}
}
