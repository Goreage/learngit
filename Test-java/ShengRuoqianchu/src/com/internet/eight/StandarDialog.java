package com.internet.eight;

import javax.swing.JOptionPane;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ�ñ�׼�Ի���
	 */
public class StandarDialog {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ͬ������!");
		JOptionPane.showConfirmDialog(null, "�������绹����");
		JOptionPane.showInputDialog(null, "�������绹����");
		String [] s= {"��","����"};
		JOptionPane.showInputDialog(null,"�������绹����","����",
				JOptionPane.QUESTION_MESSAGE, null,s,s[0]);
	}
}
