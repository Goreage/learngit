package com.internet.eight;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用匿名类实现简单的事件处理
	 */
public class EventHandingUsel extends JFrame{
	public EventHandingUsel() {
		super("使用匿名类的事件处理");
		Container c=getContentPane();
		JButton b=new JButton("单击0次");
		b.addActionListener(new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();
				b.setText("单击"+(++count)+"次");
			}	//actionPerformed()方法结束
		}		//实现接口ActionListener的匿名类结束
		);	//addActionListener()方法结束
		/*
		 * JFrame默认的布局管理器是BorderLayout,未调用setLayout()方法就表示
		 * 使用的是默认布局管理器
		 */
		c.add(b,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		EventHandingUsel app = new EventHandingUsel();
		app.setSize(260,100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			app.setVisible(true);
	}
}
