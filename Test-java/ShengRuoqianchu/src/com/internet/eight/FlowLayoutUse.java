package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：流布局管理器的使用
	 */
/*
 * Java为了实现跨平台的特性并获得动态的布局效果，将容器内的所有组件安排给一个"布局管理器"来负责管理，
 * 如排列组件顺序，设置组件大小，位置，当窗口移动或调整大小后组件如何变化等功能，均授权给对应的容器布局管理器来清理。不同的
 * 布局管理器使用不同算法和策略，容器可以通过选择不同的布局管理器来决定布局
 */
public final class FlowLayoutUse {
	public static void main(String[] args) {
		JFrame app = new JFrame("流布局管理器的使用");
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout());
		JButton button1 = new JButton("确定");
		JButton button2 = new JButton("取消");
		JButton button3 = new JButton("关闭");
		c.add(button1);
		c.add(button2);
		c.add(button3);
		app.setSize(300, 100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
