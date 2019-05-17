package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺ʹ�ÿ�ܺͱ�ǩ���һ��ͼ���û����棬������ʾ�ı���ͼ��
	 */
public class JFrameLabel extends JFrame{
	public JFrameLabel() {
		/*
		 * ������javax.swing.JFrame�Ĺ��췽�������ɱ���Ϊ����ܺͱ�ǩ��ʹ�á��Ĵ���
		 * �������й��췽��JFrame(String title),����Ҫ�˽��йظ�������������ɲ���API
		 */
		super("��ܺͱ�ǩ��ʹ��");
		/*
		 * getContentPane()����javax.swing.JFrame�ĳ�Ա���������ڷ��ص�ǰ���ڵ�
		 * ������һ�㲻ֱ��ʹ��JFream���������ǻ�ȡ��ǰ���ڵ�����c����c��������
		 */
		Container c =getContentPane();
		/*
		 * setLayout()����JFrame�ĳ�Ա�������������õ�ǰ���ڵĲ��ָ�ʽ��new FlowLayout(FlowLayout.LEET)
		 * ��ʹ����java.awt.FlowLayout�Ĺ��췽��ʵ����һ�������ֹ�����󣬲�ʹ����Զ������
		 */
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		//�ַ���������
		String[] s = {"�ı���ǩ","������ͼ����","������ͼ���·�"};
		/*
		 * ʹ��ͼ�����ʹ���һ�������������ImageIcon(getClass().getgetResource("image.jpg"))����
		 * ����һ��ͼ�����getClass().getResource("image.jpg")���ڻ�ȡ��Ƭ
		 */
		ImageIcon[] ic ={null,new ImageIcon(getClass().getResource("6.jpg"))
				, new ImageIcon(getClass().getResource("CellImage.jpg"))};
		/*
		 * ����JLable.LEFT,JLable.CENTER��JLable.BOTTOM����ͬ�Ķ��뷽ʽ
		 */
		int [] ih = {0, JLabel.LEFT, JLabel.CENTER};
		int [] iv = {0, JLabel.CENTER, JLabel.BOTTOM};
		for (int i=0; i<3; i++)
		{
			/*
			 * JLabel��Ĺ��췽��JLabel(String text, Icon icon, int horizontal-Alignment)
			 * �ɴ�������ָ���ı���ͼ���ˮƽ�����JLabelʵ�����ñ�ǩ������ʾ����ֱ���ж��롣�ı�λ��ͼ���β����Text�Ǳ�ǩ
			 * ����ʾ���ı���iocn�Ǳ�ǩ����ʾ��ͼ��horizontalAlignment����ȡLEFT,CENTER,RIGHT,LEDING
			 * ��TRAILING�ȳ���ֵ
			 */
			JLabel label = new JLabel(s[i],ic[i],JLabel.LEFT);
			if(i>0)
			{
				/*
				 * ���������ǩ��������ͼ��֮����ˮƽ�����ϵ����λ�ù�ϵ�����ı��ֱ�λ��
				 * ͼ�����࣬�Ҳ���м�
				 */
				label.setHorizontalTextPosition(ih[i]);
				/*
				 * ���������������ͼ���ڴ�ֱ�����ϵ����λ�ù�ϵ������JLabel.TOP JLabel.Center��Jlabel.BOTTOM
				 * ���ַ�ʽ
				 */
				label.setVerticalTextPosition(iv[i]);
			}
			//���õ�����ڱ�ǩ���Լ�ͣ��ʱ���ֵ���ʾ��Ϣ
			label.setToolTipText("��"+(i+1)+"����ǩ");
			/*
			 * Container���add(Component comp)������������������������compָ��
			 * ��Ҫ��ӵ����
			 */
			c.add(label);	//�������ӵ���ǰ������
		}					//forѭ������
 	}
	public static void main(String[] args) {
		JFrameLabel app = new JFrameLabel();
		//���ô��ڴ�С��������Ⱥ͸߶�
		app.setSize(600, 300);
		//���õ�������"�ر�"��ťʱ�ر�Ӧ�ó���
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô����Ƿ�ɼ���Ϊtrueʱ���ڿɼ������򲻿ɼ�
		app.setVisible(true);
	}
}
