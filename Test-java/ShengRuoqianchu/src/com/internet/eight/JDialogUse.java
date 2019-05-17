package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用架构和对话框设计一个图形用户界面，程序运行后将弹出一个对话框
	 */
public class JDialogUse {
	/*
	 * 对话框是一种可移动的窗口，比框架简单，没有那么多的控制元素，如最小化，状态栏。对话框通常用来设计
	 * 具有依赖关系的窗口，通常在已有的窗口上创建对话框。称已有的窗口称为父窗口，新创建的对话框是其子窗口。
	 * 	对话框分为模态或非模态、当一个模态的对话框打开时，不允许访问应用程序中的其他窗口，直到该对话框关闭；
	 * 而当一个非模态的对话框打开时，用户仍让可以访问其他窗口
	 */
	public static void main(String[] args) {
		JFrame app = new JFrame("对话框的使用");
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		app.setSize(300, 300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		/*
		 * 使用javax.swing.JDialog类的构造方法JDialog(Frame owner, String title, boolean model).
		 * owner指定对应的父窗口；title设置对话框的标题，modal表示对话框的模式，如果之为true表示模态，否则为非模态
		 */
		JDialog d = new JDialog(app, "对话框", false);
		d.setSize(200, 100);
		d.setVisible(true);
	}
}
