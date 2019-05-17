package com.internet.eight;

import java.awt.Container;
import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：使用框架和标签设计一个图形用户界面，用来显示文本和图像
	 */
public class JFrameLabel extends JFrame{
	public JFrameLabel() {
		/*
		 * 调用类javax.swing.JFrame的构造方法，生成标题为“框架和标签的使用”的窗口
		 * 该类中有构造方法JFrame(String title),若需要了解有关该类的其他方法可查阅API
		 */
		super("框架和标签的使用");
		/*
		 * getContentPane()是类javax.swing.JFrame的成员方法，用于返回当前窗口的
		 * 容器，一般不直接使用JFream容器，而是获取当前窗口的容器c，在c中添加组件
		 */
		Container c =getContentPane();
		/*
		 * setLayout()是类JFrame的成员方法，用于设置当前窗口的布局格式，new FlowLayout(FlowLayout.LEET)
		 * 是使用类java.awt.FlowLayout的构造方法实例化一个流布局管理对象，并使组件自动左对齐
		 */
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		//字符类型数组
		String[] s = {"文本标签","文字在图形左方","文字在图形下方"};
		/*
		 * 使用图像类型创建一个数组对象。其中ImageIcon(getClass().getgetResource("image.jpg"))用于
		 * 生成一个图像对象，getClass().getResource("image.jpg")用于获取照片
		 */
		ImageIcon[] ic ={null,new ImageIcon(getClass().getResource("6.jpg"))
				, new ImageIcon(getClass().getResource("CellImage.jpg"))};
		/*
		 * 常量JLable.LEFT,JLable.CENTER和JLable.BOTTOM代表不同的对齐方式
		 */
		int [] ih = {0, JLabel.LEFT, JLabel.CENTER};
		int [] iv = {0, JLabel.CENTER, JLabel.BOTTOM};
		for (int i=0; i<3; i++)
		{
			/*
			 * JLabel类的构造方法JLabel(String text, Icon icon, int horizontal-Alignment)
			 * 可创建具有指定文本，图像和水平对齐的JLabel实例。该标签在其显示区垂直居中对齐。文本位于图像的尾部。Text是标签
			 * 中显示的文本，iocn是标签中显示的图像。horizontalAlignment可以取LEFT,CENTER,RIGHT,LEDING
			 * 或TRAILING等常量值
			 */
			JLabel label = new JLabel(s[i],ic[i],JLabel.LEFT);
			if(i>0)
			{
				/*
				 * 设置组件标签的文字与图标之间在水平方向上的相对位置关系，是文本分别位于
				 * 图标的左侧，右侧和中间
				 */
				label.setHorizontalTextPosition(ih[i]);
				/*
				 * 设置组件的文字与图标在垂直方向上的相对位置关系，包括JLabel.TOP JLabel.Center和Jlabel.BOTTOM
				 * 三种方式
				 */
				label.setVerticalTextPosition(iv[i]);
			}
			//设置当鼠标在标签上稍加停留时出现的提示信息
			label.setToolTipText("第"+(i+1)+"个标签");
			/*
			 * Container类的add(Component comp)方法用于在容器中添加组件，comp指定
			 * 需要添加的组件
			 */
			c.add(label);	//把组件添加到当前容器中
		}					//for循环结束
 	}
	public static void main(String[] args) {
		JFrameLabel app = new JFrameLabel();
		//设置窗口大小，包括宽度和高度
		app.setSize(600, 300);
		//设置单击窗口"关闭"按钮时关闭应用程序
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口是否可见，为true时窗口可见，否则不可见
		app.setVisible(true);
	}
}
