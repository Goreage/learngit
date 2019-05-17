package com.internet.eight;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：高级组件JTree的使用，用无参数构造方法创建树
	 * 项目背景：无参数的构造方法中各个节点的数据均是Java语言的默认值，而非自己设置的。该构造方法
	 * 返回带有实例模型的JTree。树使用的默认模型可以将叶节点定义为不带子节点的任何节点
	 */
public class NoParametersTree {
	public NoParametersTree() {
		JFrame app=new JFrame("无参数构造方法的使用");
		Container c=app.getContentPane();
		JTree tree=new JTree();
		/*
		 * 创建一个视口（如果有必要）并设置其视图。不直接为JSxrollPane构造方法提供视图
		 * 的应用程序应使用此方法指定将显示在滚动窗格中的滚动组件
		 */
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(tree);
		c.add(scrollPane);
		app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	public static void main(String[] args) {
		new NoParametersTree();
	}
}
