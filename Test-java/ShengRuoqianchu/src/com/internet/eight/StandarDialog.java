package com.internet.eight;

import javax.swing.JOptionPane;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用标准对话框
	 */
public class StandarDialog {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "同桌的你!");
		JOptionPane.showConfirmDialog(null, "你在他乡还好吗？");
		JOptionPane.showInputDialog(null, "你在他乡还好吗？");
		String [] s= {"好","不好"};
		JOptionPane.showInputDialog(null,"你在他乡还好吗？","输入",
				JOptionPane.QUESTION_MESSAGE, null,s,s[0]);
	}
}
