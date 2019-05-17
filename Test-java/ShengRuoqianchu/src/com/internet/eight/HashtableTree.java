package com.internet.eight;

import java.awt.Container;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

/*
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：高级组件JTree的使用，利用Hashtable建立树
	 * 项目背景：如果需要输入特定的节点数据，可以把Hashtable当作JTree的数据输入。该构造方法返回用
	 * Hashtable创建的JTree,它不显示根节点。Hashtable中每个键-值对的半值都为新根节点的子节点。
	 * 默认情况下，树可以将叶节点定义为不带子节点的任何节点
	 */
public class HashtableTree {
	public HashtableTree() {
		JFrame app=new JFrame("利用Hashtable建立树");
		Container c=app.getContentPane();
		String[] s1= {"本地磁盘(C:)","本地磁盘(D:)","本地磁盘(E:)"};
		String[] s2= {"网上聊天","网络新闻","网络书店"};
		String[] s3= {"公司文件","个人信件","私人文件"};
		Hashtable h1=new Hashtable();
		Hashtable h2=new Hashtable();
		h1.put("我的电脑", s1);
		h1.put("收藏夹", h2);
		h2.put("网站列表", s2);
		h1.put("我的公文包", s3);
		JTree tree=new JTree(h1);
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(tree);
		c.add(scrollPane);
		app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	public static void main(String[] args) {
		new HashtableTree();
	}
}
