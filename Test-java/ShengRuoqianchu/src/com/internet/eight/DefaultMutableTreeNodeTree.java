package com.internet.eight;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼����JTree��ʹ�ã�����DefaultMutableTreeNode������
	 */
public class DefaultMutableTreeNodeTree {
	public DefaultMutableTreeNodeTree() {
		JFrame app=new JFrame("����DefaultMutableTreeNode������");
		Container c=app.getContentPane();
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("��Դ������");
		DefaultMutableTreeNode node1=new DefaultMutableTreeNode("�ҵĹ��İ�");
		DefaultMutableTreeNode node2=new DefaultMutableTreeNode("�ҵĵ���");
		DefaultMutableTreeNode node3=new DefaultMutableTreeNode("�ղؼ�");
		root.add(node1);
		root.add(node2);
		root.add(node3);
		DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("��˾�ļ�");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("˽���ļ�");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("�����ż�");
		leafnode=new DefaultMutableTreeNode("��������(C:)");
		node2.add(leafnode);
		leafnode=new DefaultMutableTreeNode("��������(D:)");
		node2.add(leafnode);
		leafnode=new DefaultMutableTreeNode("��������(E:)");
		node2.add(leafnode);
		DefaultMutableTreeNode node31=new DefaultMutableTreeNode("��վ�б�");
		node3.add(node31);
		leafnode=new DefaultMutableTreeNode("��������");
		node3.add(leafnode);
		leafnode=new DefaultMutableTreeNode("��������");
		node3.add(leafnode);
		leafnode=new DefaultMutableTreeNode("�������");
		node3.add(leafnode);
		JTree tree=new JTree(root);
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(tree);
		c.add(scrollPane);
		app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	public static void main(String[] args) {
		new DefaultMutableTreeNodeTree();
	}
}
