package com.internet.eight;
/*
 * 组件介绍：文本编辑框常用于数据的输入，主要有文本编辑框（JTextField）和密码式文本编辑框(JPasswordField)，
 * 两者都可以编辑单行文本。采用JTextField类，可以在文本中直接看到输入的字符串；采用JPasswordField类，在输入
 * 文本框中输入的字符被*代替
 */
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：文本编辑框和密码矿的使用
	 */
public class TextEditBox extends JFrame{
	public TextEditBox() {
		super("文本编辑框的使用");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		/*
		 * JTextField类的构造方法ITextField(String text, int columns)中，text参数
		 * 是初始文本信息；colums指定文本编辑的宽度。JPassworfField类的构造方法和
		 * JTextField类的构造方法相似
		 */
		JTextField[] t= {new JTextField("用户名:",6),new JTextField("请输入用户名",16),
				new JTextField("密 码:",6),new JPasswordField("123456",16)};
		/*
		 * JTextField类的setEditable(boolean b)方法用于设置文本编辑框是否可以编辑。b为true
		 * 时可编辑，否则不能编辑。不能编辑时效果类似标签。另外，getText()方法用于获取文本信息，setText()
		 * 用于设置文本信息
		 */
		t[0].setEditable(false);
		t[2].setEditable(false);
		for( int i=0; i<4; i++)		//通过循环把文本框添加到容器中
			c.add(t[i]);
	}
	public static void main(String[] args) {
		TextEditBox app=new TextEditBox();
		app.setSize(300,160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
