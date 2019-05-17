package com.internet.eight;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼����JTree��ʹ�ã�����TreeModel������
	 */
public class TreeModelTree {
	public TreeModelTree() {
		JFrame app=new JFrame("����TreeModel������");
		Container c=app.getContentPane();
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("��Դ������");
		DefaultMutableTreeNode node1=new DefaultMutableTreeNode("�ҵĹ��İ�");
		DefaultMutableTreeNode node2=new DefaultMutableTreeNode("�ҵĵ���");
		DefaultMutableTreeNode node3=new DefaultMutableTreeNode("�ղؼ�");
		DefaultTreeModel treeModel=new DefaultTreeModel(root);
		//����ڵ㵽���ڵ�
		treeModel.insertNodeInto(node1, root, root.getChildCount());
		treeModel.insertNodeInto(node2, root, root.getChildCount());
		treeModel.insertNodeInto(node3, root, root.getChildCount());
		DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("��˾�ļ�");
		treeModel.insertNodeInto(leafnode, node1, node1.getChildCount());
		leafnode=new DefaultMutableTreeNode("�����ż�");
		treeModel.insertNodeInto(leafnode, node1, node1.getChildCount());
		leafnode=new DefaultMutableTreeNode("˽���ļ�");
		treeModel.insertNodeInto(leafnode, node1, node1.getChildCount());
		leafnode=new DefaultMutableTreeNode("���ش���(C:)");
		treeModel.insertNodeInto(leafnode, node2, node2.getChildCount());
		leafnode=new DefaultMutableTreeNode("���ش���(D:)");
		treeModel.insertNodeInto(leafnode, node2, node2.getChildCount());
		leafnode=new DefaultMutableTreeNode("���ش���(E:)");
		treeModel.insertNodeInto(leafnode, node2, node2.getChildCount());
		DefaultMutableTreeNode node31=new DefaultMutableTreeNode("��վ�б�");
		treeModel.insertNodeInto(node31, node3, node3.getChildCount());
		leafnode=new DefaultMutableTreeNode("��������");
		treeModel.insertNodeInto(leafnode, node3, node3.getChildCount());
		leafnode=new DefaultMutableTreeNode("��������");
		treeModel.insertNodeInto(leafnode, node3, node3.getChildCount());
		leafnode=new DefaultMutableTreeNode("�������");
		treeModel.insertNodeInto(leafnode, node3, node3.getChildCount());
		JTree tree=new JTree(treeModel);
		//�ı�JTree�����
		tree.putClientProperty("JTree.lineStyle", "Horizontal");
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(tree);
		c.add(scrollPane);
		app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	public static void main(String[] args) {
		new TreeModelTree();
	}
}
