package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * ������:***
 * �����ص�:***
 * ����ʱ��:****��**��**��
 * ���һ���޸�ʱ��:****��**��**��
 * ���ܼ�飺��Ͽ��б����ı������ʹ��
 */
	/*
	 * ��Ͽ�(JComBox)�ֳ�Ϊ�����б���û��ɴ�����ʽ�б����ѡ�����е��б��
	 * �б��(JList)�Ľ�����ʾ��һϵ�е��б���û��ɴ���ѡ��һ������б��
	 * �ı�����(JTextArea)�ǿ��Ա༭�����ı���Ϣ���ı��򣬵��ı����򲻻��Զ����ֹ�������
	 * ���Խ��ı�������ӵ���������(JScrollPane)�У��Ӷ�ʵ�ָ��ı�������ӹ������Ĺ��ܡ�
	 * ��ʱ���ı���Ϣ��ˮƽ�����ϳ����ı�����Χʱ���Զ�����ˮƽ������;���ı���Ϣ�ڴ�ֱ�����ϳ���
	 * �ı�����Χʱ���Զ����ִ�ֱ������������������ص㶼����ʾ�����ı���Ϣ��
	 */
public class JLineUse extends JFrame{
	public JLineUse() {
		super("���������ʹ��");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		String[] s= {"ѡ��1","ѡ��2","ѡ��3"};
		JComboBox cb=new JComboBox(s);
		JList lt=new JList(s);
		JTextArea ta=new JTextArea("1\n1\n2\n3\n4\n5\n6",3,9);
		JScrollPane sp=new JScrollPane(ta);
		c.add(cb);
		c.add(lt);
		c.add(sp);
	}
	public static void main(String[] args) {
		JLineUse app=new JLineUse();
		app.setSize(300,160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
