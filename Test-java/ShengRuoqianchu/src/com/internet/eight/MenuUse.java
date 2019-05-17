package com.internet.eight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/*
	 * 开发者：***
	 * 开发地点：****
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：高级组件中的常规菜单的使用
	 */
public class MenuUse extends JFrame{
	public MenuUse() {
		super("常规菜单的使用");
		//创建菜单栏(JMenuBar)对象
		JMenuBar mBar = new JMenuBar();
		//在JFrame容器中设置菜单栏对象，即将菜单栏添加到框架容器中
		this.setJMenuBar(mBar);
		//创建菜单对象
		JMenu[] m = {new JMenu("文件（F）"),new JMenu("编辑（E）")};
		//保存助记符的数组
		char[][] mC= {{'F','E'},{'O','S'},{'C','V'}};
		//创建菜单项
		JMenuItem[][] mI = 
			{
					{new JMenuItem("打开(O)"),new JMenuItem("保存(S)")},
					{new JMenuItem("复制(C)"),new JMenuItem("粘贴(V)")}
			};
		for( int i=0; i<m.length; i++)
		{
			//将菜单添加但菜单栏中
			mBar.add(m[i]);
			//设置菜单的助记符
			m[i].setMnemonic(mC[0][i]);
			for(int j=0; j<mI[i].length; j++)
			{
				//在菜单中添加菜单项
				m[i].add(mI[i][j]);
				//为菜单项设置助记符
				mI[i][j].setMnemonic(mC[i+1][j]);
				//为菜单项设置助记符
				mI[i][j].setAccelerator(KeyStroke.getKeyStroke(mC[i+1][j]));
				//为菜单项注册监听器
				mI[i][j].addActionListener(new ActionListener() {			
					@Override
					public void actionPerformed(ActionEvent e) {
						JMenuItem mItem=(JMenuItem)e.getSource();
						System.out.println("运算菜单项:"+mItem.getText());
					}//actionPerformed()结束
				}//实现接口addActionListener的匿名类
				);//addActionListener()结束
			}//内部for循环结束			
		}//外部for循环结束
		//在菜单项或下拉式菜单之间插入菜单分隔条
		m[0].insertSeparator(1);
	}//构造方法结束
	public static void main(String[] args) {
		MenuUse app = new MenuUse();
		app.setSize(260,160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
