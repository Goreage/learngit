package com.internet.eight;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼����JTree��ʹ�ã����޲������췽��������
	 * ��Ŀ�������޲����Ĺ��췽���и����ڵ�����ݾ���Java���Ե�Ĭ��ֵ�������Լ����õġ��ù��췽��
	 * ���ش���ʵ��ģ�͵�JTree����ʹ�õ�Ĭ��ģ�Ϳ��Խ�Ҷ�ڵ㶨��Ϊ�����ӽڵ���κνڵ�
	 */
public class NoParametersTree {
	public NoParametersTree() {
		JFrame app=new JFrame("�޲������췽����ʹ��");
		Container c=app.getContentPane();
		JTree tree=new JTree();
		/*
		 * ����һ���ӿڣ�����б�Ҫ������������ͼ����ֱ��ΪJSxrollPane���췽���ṩ��ͼ
		 * ��Ӧ�ó���Ӧʹ�ô˷���ָ������ʾ�ڹ��������еĹ������
		 */
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(tree);
		c.add(scrollPane);
		app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	public static void main(String[] args) {
		new NoParametersTree();
	}
}
