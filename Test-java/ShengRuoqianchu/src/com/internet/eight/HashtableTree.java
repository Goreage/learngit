package com.internet.eight;

import java.awt.Container;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

/*
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼����JTree��ʹ�ã�����Hashtable������
	 * ��Ŀ�����������Ҫ�����ض��Ľڵ����ݣ����԰�Hashtable����JTree���������롣�ù��췽��������
	 * Hashtable������JTree,������ʾ���ڵ㡣Hashtable��ÿ����-ֵ�Եİ�ֵ��Ϊ�¸��ڵ���ӽڵ㡣
	 * Ĭ������£������Խ�Ҷ�ڵ㶨��Ϊ�����ӽڵ���κνڵ�
	 */
public class HashtableTree {
	public HashtableTree() {
		JFrame app=new JFrame("����Hashtable������");
		Container c=app.getContentPane();
		String[] s1= {"���ش���(C:)","���ش���(D:)","���ش���(E:)"};
		String[] s2= {"��������","��������","�������"};
		String[] s3= {"��˾�ļ�","�����ż�","˽���ļ�"};
		Hashtable h1=new Hashtable();
		Hashtable h2=new Hashtable();
		h1.put("�ҵĵ���", s1);
		h1.put("�ղؼ�", h2);
		h2.put("��վ�б�", s2);
		h1.put("�ҵĹ��İ�", s3);
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
