package com.internet.eight;
/*
 * ������ܣ��ı��༭���������ݵ����룬��Ҫ���ı��༭��JTextField��������ʽ�ı��༭��(JPasswordField)��
 * ���߶����Ա༭�����ı�������JTextField�࣬�������ı���ֱ�ӿ���������ַ���������JPasswordField�࣬������
 * �ı�����������ַ���*����
 */
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�ı��༭���������ʹ��
	 */
public class TextEditBox extends JFrame{
	public TextEditBox() {
		super("�ı��༭���ʹ��");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		/*
		 * JTextField��Ĺ��췽��ITextField(String text, int columns)�У�text����
		 * �ǳ�ʼ�ı���Ϣ��columsָ���ı��༭�Ŀ�ȡ�JPassworfField��Ĺ��췽����
		 * JTextField��Ĺ��췽������
		 */
		JTextField[] t= {new JTextField("�û���:",6),new JTextField("�������û���",16),
				new JTextField("�� ��:",6),new JPasswordField("123456",16)};
		/*
		 * JTextField���setEditable(boolean b)�������������ı��༭���Ƿ���Ա༭��bΪtrue
		 * ʱ�ɱ༭�������ܱ༭�����ܱ༭ʱЧ�����Ʊ�ǩ�����⣬getText()�������ڻ�ȡ�ı���Ϣ��setText()
		 * ���������ı���Ϣ
		 */
		t[0].setEditable(false);
		t[2].setEditable(false);
		for( int i=0; i<4; i++)		//ͨ��ѭ�����ı�����ӵ�������
			c.add(t[i]);
	}
	public static void main(String[] args) {
		TextEditBox app=new TextEditBox();
		app.setSize(300,160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
