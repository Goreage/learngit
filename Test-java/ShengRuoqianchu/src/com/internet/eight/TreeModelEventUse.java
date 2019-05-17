package com.internet.eight;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/*
	 * �����ߣ�***
	 * �����ص㣺***
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼����JTree��ʹ��
	 */
public class TreeModelEventUse implements TreeModelListener{
	JLabel label=null;
	String nodeName=null;
	public TreeModelEventUse() {
		JFrame app=new JFrame("TreeModelEvent�¼���ʹ��");
		Container c=app.getContentPane();
		c.setLayout(new BorderLayout());
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("��Դ������");
		DefaultMutableTreeNode node1=new DefaultMutableTreeNode("�ļ���");
		DefaultMutableTreeNode node2=new DefaultMutableTreeNode("�ҵĵ���");
		DefaultMutableTreeNode node3=new DefaultMutableTreeNode("�ղؼ�");
		root.add(node1);
		root.add(node2);
		root.add(node3);
		DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("��˾�ļ�");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("�����ż�");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("˽���ļ�");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("���ش���(C:)");
		node2.add(leafnode);
		leafnode=new DefaultMutableTreeNode("���ش���(D:)");
		node2.add(leafnode);
		leafnode=new DefaultMutableTreeNode("���ش���(E:)");
		node2.add(leafnode);
		DefaultMutableTreeNode node31=new DefaultMutableTreeNode("��վ�б�");
		node3.add(node31);
		leafnode=new DefaultMutableTreeNode("�廪��ѧ������");
		node31.add(leafnode);
		leafnode=new DefaultMutableTreeNode("֣���ṤҵѧԺ");
		node31.add(leafnode);
		leafnode=new DefaultMutableTreeNode("������Ժ");
		node31.add(leafnode);
		JTree tree=new JTree(root);
		//����TreeΪ�ɱ༭��
		tree.setEditable(true);
		//ΪTree��Ӽ��Mouse�¼��ļ��������Ա��ȡ�ڵ�����
		tree.addMouseListener(new MouseHandle());
		//ȡ��DefaultTreeModel,������Ƿ���TreeModelEvent�¼�
		DefaultTreeModel treeModel=(DefaultTreeModel)tree.getModel();
		treeModel.addTreeModelListener(this);
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(tree);
		label=new JLabel("��������Ϊ:");
		c.add(scrollPane,BorderLayout.CENTER);
		c.add(label,BorderLayout.SOUTH);
		app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	/*
	 * ����ʵ����TreeModelListener�ӿڣ��ýӿڹ�������4���������ֱ���TreeNodesChanged(),treeNodeInserted(),
	 * treeNodeRemoved(),treeNodesRemoved(),treeStructureChanged()������ֻ��Ը��Ľڵ�ֵ�Ĺ���ʵ����treeNodesChanged()
	 * ����
	 */
	public void treeNodesChanged(TreeModelEvent e) {
		TreePath treePath=e.getTreePath();
		System.out.println(treePath);
		/*
		 * ��TreeModelEvenȡ�õ�DefaultMutableTreeNodeΪ�ڵ�ĸ��ڵ㣬�������û�
		 * �ڵ㡣
		 */
		DefaultMutableTreeNode
		node=(DefaultMutableTreeNode)treePath.getLastPathComponent();
		try {
			/*
			 * getChildIndices()�����᷵�ص�ǰ�޸Ľڵ������ֵ������ֻ�޸�һ���ڵ㣬
			 * ��˽ڵ�����ֵ�ͷ���index[0]��λ�ã����޸ĵĽڵ�Ϊrootnode,��getChildIndices()�ķ���ֵΪnull
			 */
			int[] index=e.getChildIndices();
			/*
			 * ��DefaultMutableTreeNode���getChildAt()������ȡ�޸ĵĽڵ����
			 */
			node=(DefaultMutableTreeNode)node.getChildAt(index[0]);
		}catch(NullPointerException exc) {}
		/*
		 * ��DefaultMutableTreeNode���getUserObject()����ȡ�ýڵ�����ݣ�����
		 * node.toString()����������ͬ��Ч��
		 */
		label.setText(nodeName+"��������Ϊ��"+(String)node.getUserObject());
	}
	public void treeNodesInserted(TreeModelEvent e) {		
	}
	@Override
	public void treeNodesRemoved(TreeModelEvent e) {		
	}
	public void treeStructureChanged(TreeModelEvent e) {		
	}
	//����Mouse�¼�
	class MouseHandle extends MouseAdapter{
		public void mousePreessed(MouseEvent e) {
			try {
				JTree tree=(JTree)e.getSource();
				/*
				 * JTree��getRowForLocation()�����᷵�ؽڵ��������ֵ�����磬�����С����ش���(D:)��
				 * ��������ֵΪ4��������ֵ�������������ݼеĴ򿪻�������ı䣬������Դ����������������ֵ��Ϊ0
				 */
				int rowLocation=tree.getRowForLocation(e.getX(), e.getY());
				/*
				 * JTree��getPathForRow()������ȡ�ô�rootnode��ѡ��ڵ��һ��Path����PathΪһ��ֱ�ߣ�
				 * ���������ش���(E:)��,��TreePathΪ����Դ��������-->"�ҵĵ���"-->����������(E:)��,�������TreePath
				 * ��getLastPathComponent()�����Ϳ��Ի�ȡ��ѡ��Ľڵ�
				 */
				TreePath treepath=tree.getPathForRow(rowLocation);
				TreeNode treenode=(TreeNode)treepath.getLastPathComponent();
				nodeName=treenode.toString();
			}catch(NullPointerException ne) {}
		}
	}
	public static void main(String[] args) {
		new TreeModelEventUse();
	}
}
