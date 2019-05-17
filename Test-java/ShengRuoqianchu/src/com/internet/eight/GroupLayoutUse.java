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
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 */
public class GroupLayoutUse extends JFrame{
	public GroupLayoutUse() {
		super("组布局管理器-查找");
		JLabel labell = new JLabel();
		JTextField textFieldl = new JTextField();
		JCheckBox cb1 = new JCheckBox("区分大小写");
		JCheckBox cb2 = new JCheckBox("不区分大小写");
		JRadioButton rb1 = new JRadioButton("向上");
		JRadioButton rb2 = new JRadioButton("向下");
		JButton findButton = new JButton("查找下一个");
		JButton cancelButton = new JButton("取消");
		Container c = getContentPane();
		GroupLayout layout = new GroupLayout(c);
		c.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		GroupLayout.ParallelGroup hpg2a = 
				layout.createParallelGroup(GroupLayout.Alignment.LEADING);
		/*
		 * addComponent(Component component)方法将Component添加到此Group
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
		 * 调整窗口的大小和布局。如果该窗口或其所有者还不可显示，则在计算首选大小之前变得
		 * 可显示。在计算首选大小之后，将会验证该窗口
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
