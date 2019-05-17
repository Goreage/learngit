package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日 
	 */
public class JButtonUse extends JFrame{
	/*
	 * 组件介绍:Swing的按钮包括命令按钮(JButton),选择按钮(JCheckBox)和单选按钮(JRadioButton),
	 * 它们都是抽象类AbstractButton的子类.JButton,JCheckBox和JRadioButton均为单击式组件，当单机这些组件时
	 * ，都会触发特定的时间。单击JCheckBox和JRadioButton时它们的选择状态会发生变化 
	 */
	public JButtonUse() {
		super("按钮例程");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon[] ii= {new ImageIcon(getClass().getResource("left.gif")),
				new ImageIcon(getClass().getResource("right.gif"))};
		/*
		 * JButton类的构造方法JButton(String text,Icon icon),爱中text参数指定按钮上的文本信息；
		 * icon参数指定按钮上的图标，另一个构造方法JButton(String text)只有一个参数
		 */
		JButton[] b= {new JButton("左",ii[0]), new JButton("中间"), new JButton("右",ii[1])};
		for (int i=0; i<b.length; i++)
			c.add(b[i]);
		//创建复选框并添加到框架中，复选框的构造方法和JButton类的构造方法相似。
		JCheckBox[] cb={new JCheckBox("左"), new JCheckBox("右")};
		for(int i=0; i<cb.length; i++) {
			c.add(cb[i]);
			cb[i].setSelected(true);	//用于设定复选框或者按钮的选定状态
		}
		//创建单选按钮并添加到框架中，单选框的构造方法和JButton类的构造方法相似
		JRadioButton [] rb= {new JRadioButton("左"), new JRadioButton("右")};
		//创建按钮组，把按钮加到同一个组中
		ButtonGroup bg = new ButtonGroup();
		for(int i=0; i<rb.length; i++) {
			c.add(rb[i]);
			bg.add(rb[i]);
		}
		rb[0].setSelected(true);
		rb[1].setSelected(false);
	}
	public static void main(String[] args) {
		JButtonUse app=new JButtonUse();
		app.setSize(300, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
