package com.internet.cool;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//FirstApplet.java
/*
	 * ������:***\
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ��:****��**��**��
	 * ���ܼ�飺AppletСӦ�ó���
 */
public class FirstApplet extends JApplet {

	//���ظ��� JApplet �е�paint()����
	public void paint(Graphics g) {
		//�����ַ�����ɫ
		g.setColor(Color.red);
		//��ҳ����ָ��λ����ʾ�ַ���
		g.drawString("AppletСӦ�ó���", 60, 60);
	}//paint()��������
}//��FirstApplet����
