package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * 开发者:***
 * 开发地点:***
 * 开发时间:****年**月**日
 * 最后一次修改时间:****年**月**日
 * 功能简介：组合框，列表框和文本区域的使用
 */
	/*
	 * 组合框(JComBox)又称为下拉列表框，用户可从下拉式列表框中选择已有的列表项。
	 * 列表框(JList)的界面显示出一系列的列表项，用户可从中选择一到多个列表项。
	 * 文本区域(JTextArea)是可以编辑多行文本信息的文本框，但文本区域不会自动出现滚动条。
	 * 可以将文本区域添加到滚动窗格(JScrollPane)中，从而实现给文本区域添加滚动条的功能。
	 * 此时当文本信息在水平方向上超过文本区域范围时会自动出现水平滚动条;当文本信息在垂直方向上超过
	 * 文本区域范围时会自动出现垂直滚动条。这样组件的特点都能显示多行文本信息。
	 */
public class JLineUse extends JFrame{
	public JLineUse() {
		super("多行组件的使用");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		String[] s= {"选项1","选项2","选项3"};
		JComboBox cb=new JComboBox(s);
		JList lt=new JList(s);
		JTextArea ta=new JTextArea("1\n1\n2\n3\n4\n5\n6",3,9);
		JScrollPane sp=new JScrollPane(ta);
		c.add(cb);
		c.add(lt);
		c.add(sp);
	}
	public static void main(String[] args) {
		JLineUse app=new JLineUse();
		app.setSize(300,160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
