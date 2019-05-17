package com.internet.eight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/*
	 * �����ߣ�***
	 * �����ص㣺****
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼�����еĳ���˵���ʹ��
	 */
public class MenuUse extends JFrame{
	public MenuUse() {
		super("����˵���ʹ��");
		//�����˵���(JMenuBar)����
		JMenuBar mBar = new JMenuBar();
		//��JFrame���������ò˵������󣬼����˵�����ӵ����������
		this.setJMenuBar(mBar);
		//�����˵�����
		JMenu[] m = {new JMenu("�ļ���F��"),new JMenu("�༭��E��")};
		//�������Ƿ�������
		char[][] mC= {{'F','E'},{'O','S'},{'C','V'}};
		//�����˵���
		JMenuItem[][] mI = 
			{
					{new JMenuItem("��(O)"),new JMenuItem("����(S)")},
					{new JMenuItem("����(C)"),new JMenuItem("ճ��(V)")}
			};
		for( int i=0; i<m.length; i++)
		{
			//���˵���ӵ��˵�����
			mBar.add(m[i]);
			//���ò˵������Ƿ�
			m[i].setMnemonic(mC[0][i]);
			for(int j=0; j<mI[i].length; j++)
			{
				//�ڲ˵�����Ӳ˵���
				m[i].add(mI[i][j]);
				//Ϊ�˵����������Ƿ�
				mI[i][j].setMnemonic(mC[i+1][j]);
				//Ϊ�˵����������Ƿ�
				mI[i][j].setAccelerator(KeyStroke.getKeyStroke(mC[i+1][j]));
				//Ϊ�˵���ע�������
				mI[i][j].addActionListener(new ActionListener() {			
					@Override
					public void actionPerformed(ActionEvent e) {
						JMenuItem mItem=(JMenuItem)e.getSource();
						System.out.println("����˵���:"+mItem.getText());
					}//actionPerformed()����
				}//ʵ�ֽӿ�addActionListener��������
				);//addActionListener()����
			}//�ڲ�forѭ������			
		}//�ⲿforѭ������
		//�ڲ˵��������ʽ�˵�֮�����˵��ָ���
		m[0].insertSeparator(1);
	}//���췽������
	public static void main(String[] args) {
		MenuUse app = new MenuUse();
		app.setSize(260,160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
