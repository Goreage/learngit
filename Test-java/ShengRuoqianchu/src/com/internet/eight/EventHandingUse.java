package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发地点：****
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：事件处理的简单应用
	 */
public class EventHandingUse {
	public EventHandingUse() {
		JFrame app = new JFrame("事件处理");
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("单击！");			//事件源
		b.addActionListener(new ButtonHandler());	//对事件源添加监控
		c.add(b);
		app.setSize(200, 100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	/*
	 * 声明一个内部类ButtonHandler,实现监听器接口；该类用于监听即获得相应的事件，并对
	 * 事件进行处理。事件触发后需要执行的具体操作在actionPerformed(ActionEvent e)
	 * 方法中体现
	 */
	class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//处理的结果是:在控制台输出"您触发了事件源！"
			System.out.println("你触发了事件源！");
		}
	}
	public static void main(String[] args) {
		new EventHandingUse();
	}
}
