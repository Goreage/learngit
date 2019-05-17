package com.internet.eight;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼��������ʹ�ã�ʵ���ڱ��������У�����У�ɾ���У�ɾ���еȹ���
	 */
public class TableUse extends JFrame{
	DefaultTableModel dt;
	JTable table;
	public TableUse() {
		super("����ʹ��");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		//����4����ť
		JButton[] b= {
			new JButton("�����"),new JButton("�����"),
			new JButton("ɾ����"),new JButton("ɾ����")
		};
		//ͨ��for��佫��ť��ӵ�����c��
		for(int i=0; i<4; i++)
			c.add(b[i]);
		//����һ���յ����ݱ��
		dt=new DefaultTableModel();
		//ͨ������ģ�ʹ������
		table=new JTable(dt);
		//���ñ����ʾ����Ĵ�С
		table.setPreferredScrollableViewportSize(new Dimension(360, 160));
		//���ñ���п��ڱ������ʱ���Զ�����ģʽ
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//��ӹ�������
		JScrollPane sPane=new JScrollPane(table);
		c.add(sPane);
		//Ϊ��ťע�����
		b[0].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���÷���
				addRow();
				System.out.println("���һ��");
			}
		}//ʵ�ֽӿ�ActionListener���ڲ������
		);//addActionListener()��������
		b[1].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���÷���
				addColumn();
				System.out.println("���һ��");
			}
		}
		);
		b[2].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���÷���
				deleteRow();
				System.out.println("ɾ����ǰ��");
			}
		}
		);
		b[3].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���÷���
				deleteColumn();
				System.out.println("ɾ����ǰ��");
			}
		}
		);
	}
	public void addColumn() {
		//��ö�ά��������
		int cNum=dt.getColumnCount();
		//��ȡ��ά��������
		int rNum=dt.getRowCount();
		String s="��"+(cNum+1);
		//���ص�һ��ѡ���е�����ֵ
		int c=table.getSelectedColumn();
		System.out.println("��ǰ�к�Ϊ:"+c);
		if(cNum==0 || rNum==0 || c<0) {
			dt.addColumn(s);
			return;
		}
		c++;
		//���÷������б�ͷ�Ĵ���
		Vector<String>vs=getColumnNames();
		vs.add(c,s);
		Vector data=dt.getDataVector();
		for(int i=0; i<data.size(); i++) {
			Vector e=(Vector)data.get(i);
			e.add(c,new String(""));
		}
		dt.setDataVector(data, vs);
	}//addColumn()��������
	//���һ��
	public void addRow() {
		int cNum=dt.getColumnCount();
		if (cNum==0)
			addColumn();
		int rNum=dt.getRowCount();
		int r=getRowCurrent();
		System.out.println("��ǰ�к�Ϊ��"+r);
		dt.insertRow(r, (Vector)null);
	}//addRow()��������
	//ɾ��һ��
	public void deleteColumn() {
		int cNum=dt.getColumnCount();
		if(cNum==0)
			return;
		int c=table.getSelectedColumn();
		if(c<0)
			c=0;
		System.out.println("��ǰ�к�Ϊ��"+c);
		//���÷����Ա�ͷ���д���
		Vector<String>vs=getColumnNames();
		vs.remove(c);
		Vector data=dt.getDataVector();
		for(int i=0; i<data.size(); i++) {
			Vector e=(Vector)data.get(i);
			e.remove(c);
		}
		dt.setDataVector(data, vs);		
	}//deleteColumn()��������
	//ɾ��һ��
	public void deleteRow() {
		int rNum=dt.getRowCount();
		if(rNum>0) {
			int rEdit=getRowCurrent();
			dt.removeRow(rEdit);
		}
	}//deleteRow()��������
	//ȡ��������
	public Vector<String>getColumnNames(){
		Vector<String>vs=new Vector<String>();
		int cNum=dt.getColumnCount();
		for(int i=0; i<cNum; i++)
			vs.add(dt.getColumnName(i));
		return(vs);
	}//getColumnNames()��������
	//ȡ�õ�ǰ���к�
	public int getRowCurrent() {
		int r=table.getSelectedRow();
		if(r<0)
			r=0;
		return(r);
	}//getRowCurrent()��������
	public static void main(String[] args) {
		TableUse app=new TableUse();
		app.setSize(360,260);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
