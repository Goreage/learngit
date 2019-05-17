package com.internet.eight;

import java.awt.Component;
import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 */
public class GroupLayoutUse extends JFrame{
	public GroupLayoutUse() {
		super("�鲼�ֹ�����-����");
		JLabel labell = new JLabel();
		JTextField textFieldl = new JTextField();
		JCheckBox cb1 = new JCheckBox("���ִ�Сд");
		JCheckBox cb2 = new JCheckBox("�����ִ�Сд");
		JRadioButton rb1 = new JRadioButton("����");
		JRadioButton rb2 = new JRadioButton("����");
		JButton findButton = new JButton("������һ��");
		JButton cancelButton = new JButton("ȡ��");
		Container c = getContentPane();
		GroupLayout layout = new GroupLayout(c);
		c.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		GroupLayout.ParallelGroup hpg2a = 
				layout.createParallelGroup(GroupLayout.Alignment.LEADING);
		/*
		 * addComponent(Component component)������Component��ӵ���Group
		 */
		hpg2a.addComponent(cb1);
		hpg2a.addComponent(cb2);
		GroupLayout.ParallelGroup hpg2b = 
				layout.createParallelGroup(GroupLayout.Alignment.LEADING);
		hpg2b.addComponent(rb1);
		hpg2b.addComponent(rb2);
		GroupLayout.SequentialGroup hpg2H = layout.createSequentialGroup();
		hpg2H.addGroup(hpg2a);
		hpg2H.addGroup(hpg2b);
		GroupLayout.ParallelGroup hpg2 = layout.createParallelGroup(
				GroupLayout.Alignment.LEADING);
		hpg2.addComponent(textFieldl);
		hpg2.addGroup(hpg2H);
		GroupLayout.ParallelGroup hpg3 =
				layout.createParallelGroup(GroupLayout.Alignment.LEADING);
		hpg3.addComponent(findButton);
		hpg3.addComponent(cancelButton);
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(labell).addGroup(hpg2).addGroup(hpg3));
		layout.linkSize(SwingConstants.HORIZONTAL, new Component[] 
				{findButton,cancelButton});
		GroupLayout.ParallelGroup vpg1 = 
				layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
		vpg1.addComponent(labell);
		vpg1.addComponent(textFieldl);
		vpg1.addComponent(findButton);
		GroupLayout.ParallelGroup vpg2 =
				layout.createParallelGroup(GroupLayout.Alignment.CENTER);
		vpg2.addComponent(cb1);
		vpg2.addComponent(rb1);
		vpg2.addComponent(cancelButton);
		GroupLayout.ParallelGroup vpg3 =
				layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
		vpg3.addComponent(cb2);
		vpg3.addComponent(rb2);
		layout.setVerticalGroup(layout.createSequentialGroup().addGroup(vpg1)
				.addGroup(vpg2).addGroup(vpg3));
		/*
		 * �������ڵĴ�С�Ͳ��֡�����ô��ڻ��������߻�������ʾ�����ڼ�����ѡ��С֮ǰ���
		 * ����ʾ���ڼ�����ѡ��С֮�󣬽�����֤�ô���
		 */
		pack();
	}
	public static void main(String[] args) {
		GroupLayoutUse app = new GroupLayoutUse();
		app.setLocation(200, 200);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
