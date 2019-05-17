package com.internet.eight;
/*
 * ���(JPanel)��һ�����������������岻�ܶ�����ʾ�������������һ����������û�б��⣬û�б߿򣬲�����Ӳ˵���
 * JPanel��Ĭ�ϲ��ֹ�������FlowLayout.���������������Ȼ���ٽ������ӵ����������У�����һ������Խ�ͼ���û����������ƣ�
 * ��һ���滹�����γɺ����������֡�
 * ������(JSlider)�ṩ��ͼ�εķ�ʽ��������ѡ��Ĺ��ܡ�ͨ��ѡȡ�ķ�Χ��һ�����޵������������ṩ��ͨ�����ָ���϶����еĻ�������ֵ���ֶΡ�
 * ���⣬�������Ա�ʾ����ִ�еĽ��ȡ�
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * �����ߣ�***
 * �����ص㣺***
 * ����ʱ�䣺****��**��**��
 * ���һ���޸�ʱ�䣺****��**��**��
 * ���ܼ�飺���͹�������ʹ��
 */
public class JSliderPanel extends JFrame{
	public JSliderPanel() {
		super("���͹����������ʹ��");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		/*
		 * JSlider��Ĺ��췽��ΪJSlider(int orientation, int max, int value),����,orientation
		 * ����ָ���������ķ���; min��max�����ֱ�ָ������������ʾ����ֵ��Χ����Сֵ�����ֵ��value����ָ���������еĳ�ʼλ�á�
		 * orientation����ֵֻ��Ϊ����JSlider.HORIZONTAL��JSlider.VERTICAL��������orientationΪ
		 * JSlider.HORIZONTALʱ����������ˮƽ���򣬵�����orientationΪJSlider.VERTICALʱ���������ڴ�ֱ����
		 * ������췽����������crientation�����������Ĭ�Ϸ�����ˮƽ����
		 */
		JSlider s = new JSlider(JSlider.HORIZONTAL,0,26,6);
		JPanel p=new JPanel();
		/*
		 * JPanel��ķ���setPreferredSize(Dimension preferredSize)�����������Ĵ�С��
		 * Dimension��Ĺ��췽��Dimension(int width, int height)��������������Ĵ�С
		 */
		p.setPreferredSize(new Dimension(100,60));
		//JPanel���setBackground(Color bg)���������������ı�����ɫ
		p.setBackground(Color.red);
		c.add(s);
		c.add(p);
	}
	public static void main(String[] args) {
		JSliderPanel app = new JSliderPanel();
		app.setSize(360,160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
