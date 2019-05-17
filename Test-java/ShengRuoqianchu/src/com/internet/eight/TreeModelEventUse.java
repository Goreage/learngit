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
	 * 开发者：***
	 * 开发地点：***
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：高级组件JTree的使用
	 */
public class TreeModelEventUse implements TreeModelListener{
	JLabel label=null;
	String nodeName=null;
	public TreeModelEventUse() {
		JFrame app=new JFrame("TreeModelEvent事件的使用");
		Container c=app.getContentPane();
		c.setLayout(new BorderLayout());
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("资源管理器");
		DefaultMutableTreeNode node1=new DefaultMutableTreeNode("文件夹");
		DefaultMutableTreeNode node2=new DefaultMutableTreeNode("我的电脑");
		DefaultMutableTreeNode node3=new DefaultMutableTreeNode("收藏夹");
		root.add(node1);
		root.add(node2);
		root.add(node3);
		DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("公司文件");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("个人信件");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("私人文件");
		node1.add(leafnode);
		leafnode=new DefaultMutableTreeNode("本地磁盘(C:)");
		node2.add(leafnode);
		leafnode=new DefaultMutableTreeNode("本地磁盘(D:)");
		node2.add(leafnode);
		leafnode=new DefaultMutableTreeNode("本地磁盘(E:)");
		node2.add(leafnode);
		DefaultMutableTreeNode node31=new DefaultMutableTreeNode("网站列表");
		node3.add(node31);
		leafnode=new DefaultMutableTreeNode("清华大学出版社");
		node31.add(leafnode);
		leafnode=new DefaultMutableTreeNode("郑州轻工业学院");
		node31.add(leafnode);
		leafnode=new DefaultMutableTreeNode("网络书院");
		node31.add(leafnode);
		JTree tree=new JTree(root);
		//设置Tree为可编辑的
		tree.setEditable(true);
		//为Tree添加检测Mouse事件的监听器，以便获取节点名称
		tree.addMouseListener(new MouseHandle());
		//取得DefaultTreeModel,并检测是否有TreeModelEvent事件
		DefaultTreeModel treeModel=(DefaultTreeModel)tree.getModel();
		treeModel.addTreeModelListener(this);
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(tree);
		label=new JLabel("更改数据为:");
		c.add(scrollPane,BorderLayout.CENTER);
		c.add(label,BorderLayout.SOUTH);
		app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	/*
	 * 本类实现了TreeModelListener接口，该接口共定义了4个方法，分别是TreeNodesChanged(),treeNodeInserted(),
	 * treeNodeRemoved(),treeNodesRemoved(),treeStructureChanged()。本例只针对更改节点值的功能实现了treeNodesChanged()
	 * 方法
	 */
	public void treeNodesChanged(TreeModelEvent e) {
		TreePath treePath=e.getTreePath();
		System.out.println(treePath);
		/*
		 * 由TreeModelEven取得的DefaultMutableTreeNode为节点的父节点，而不是用户
		 * 节点。
		 */
		DefaultMutableTreeNode
		node=(DefaultMutableTreeNode)treePath.getLastPathComponent();
		try {
			/*
			 * getChildIndices()方法会返回当前修改节点的索引值。由于只修改一个节点，
			 * 因此节点索引值就放在index[0]的位置，若修改的节点为rootnode,则getChildIndices()的返回值为null
			 */
			int[] index=e.getChildIndices();
			/*
			 * 由DefaultMutableTreeNode类的getChildAt()方法获取修改的节点对象
			 */
			node=(DefaultMutableTreeNode)node.getChildAt(index[0]);
		}catch(NullPointerException exc) {}
		/*
		 * 由DefaultMutableTreeNode类的getUserObject()方法取得节点的内容，或用
		 * node.toString()方法亦有相同的效果
		 */
		label.setText(nodeName+"更改数据为："+(String)node.getUserObject());
	}
	public void treeNodesInserted(TreeModelEvent e) {		
	}
	@Override
	public void treeNodesRemoved(TreeModelEvent e) {		
	}
	public void treeStructureChanged(TreeModelEvent e) {		
	}
	//处理Mouse事件
	class MouseHandle extends MouseAdapter{
		public void mousePreessed(MouseEvent e) {
			try {
				JTree tree=(JTree)e.getSource();
				/*
				 * JTree的getRowForLocation()方法会返回节点的列索引值。例如，本例中“本地磁盘(D:)”
				 * 的列索引值为4，此索引值会随着其他数据夹的打开或收起而改变，但“资源管理器”的列索引值恒为0
				 */
				int rowLocation=tree.getRowForLocation(e.getX(), e.getY());
				/*
				 * JTree的getPathForRow()方法会取得从rootnode到选择节点的一条Path，此Path为一条直线，
				 * 单击“本地磁盘(E:)”,则TreePath为“资源管理器”-->"我的电脑"-->“本机磁盘(E:)”,因此利用TreePath
				 * 的getLastPathComponent()方法就可以获取所选择的节点
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
