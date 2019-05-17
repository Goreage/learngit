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
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**�� 
	 */
public class JButtonUse extends JFrame{
	/*
	 * �������:Swing�İ�ť�������ť(JButton),ѡ��ť(JCheckBox)�͵�ѡ��ť(JRadioButton),
	 * ���Ƕ��ǳ�����AbstractButton������.JButton,JCheckBox��JRadioButton��Ϊ����ʽ�������������Щ���ʱ
	 * �����ᴥ���ض���ʱ�䡣����JCheckBox��JRadioButtonʱ���ǵ�ѡ��״̬�ᷢ���仯 
	 */
	public JButtonUse() {
		super("��ť����");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon[] ii= {new ImageIcon(getClass().getResource("left.gif")),
				new ImageIcon(getClass().getResource("right.gif"))};
		/*
		 * JButton��Ĺ��췽��JButton(String text,Icon icon),����text����ָ����ť�ϵ��ı���Ϣ��
		 * icon����ָ����ť�ϵ�ͼ�꣬��һ�����췽��JButton(String text)ֻ��һ������
		 */
		JButton[] b= {new JButton("��",ii[0]), new JButton("�м�"), new JButton("��",ii[1])};
		for (int i=0; i<b.length; i++)
			c.add(b[i]);
		//������ѡ����ӵ�����У���ѡ��Ĺ��췽����JButton��Ĺ��췽�����ơ�
		JCheckBox[] cb={new JCheckBox("��"), new JCheckBox("��")};
		for(int i=0; i<cb.length; i++) {
			c.add(cb[i]);
			cb[i].setSelected(true);	//�����趨��ѡ����߰�ť��ѡ��״̬
		}
		//������ѡ��ť����ӵ�����У���ѡ��Ĺ��췽����JButton��Ĺ��췽������
		JRadioButton [] rb= {new JRadioButton("��"), new JRadioButton("��")};
		//������ť�飬�Ѱ�ť�ӵ�ͬһ������
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
