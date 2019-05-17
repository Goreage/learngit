package com.internet.eight;
/*
 * 面板(JPanel)是一个轻量容器组件。面板不能独立显示，必须包含在另一个容器里。面板没有标题，没有边框，不可添加菜单栏
 * JPanel的默认布局管理器是FlowLayout.在面板中添加组件，然后再将面板添加到其他容器中，这样一方面可以将图形用户界面分组设计，
 * 另一方面还可以形成合理的组件布局。
 * 滚动条(JSlider)提供以图形的方式进行数据选择的功能。通常选取的范围是一个有限的整数区域。它提供了通过鼠标指针拖动条中的滑动块数值的手段。
 * 另外，它还可以表示程序执行的进度。
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * 开发者：***
 * 开发地点：***
 * 开发时间：****年**月**日
 * 最后一次修改时间：****年**月**日
 * 功能简介：面板和滚动条的使用
 */
public class JSliderPanel extends JFrame{
	public JSliderPanel() {
		super("面板和滚动条组件的使用");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		/*
		 * JSlider类的构造方法为JSlider(int orientation, int max, int value),其中,orientation
		 * 参数指定滑动条的方向; min和max参数分别指定滚动条所表示的数值范围的最小值和最大值；value参数指定滑动条中的初始位置。
		 * orientation参数值只能为常量JSlider.HORIZONTAL或JSlider.VERTICAL。当参数orientation为
		 * JSlider.HORIZONTAL时，滚动条在水平方向，当参数orientation为JSlider.VERTICAL时，滚动条在垂直方向。
		 * 如果构造方法不含参数crientation，则滚动条的默认方向是水平方向
		 */
		JSlider s = new JSlider(JSlider.HORIZONTAL,0,26,6);
		JPanel p=new JPanel();
		/*
		 * JPanel类的方法setPreferredSize(Dimension preferredSize)用于设置面板的大小。
		 * Dimension类的构造方法Dimension(int width, int height)用于设置面板具体的大小
		 */
		p.setPreferredSize(new Dimension(100,60));
		//JPanel类的setBackground(Color bg)方法用于设置面板的背景颜色
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
