package com.internet.eight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：高级组件中的快捷菜单的使用
	 */
public class PopupMenuUse extends JFrame {
	private JPopupMenu popupMenu;

	public PopupMenuUse() {
		super("快捷菜单的使用");
		popupMenu = new JPopupMenu();
		JMenu[] m = { new JMenu("文件(F)"), new JMenu("编辑(E)") };
		char[][] mC = { { 'F', 'E' }, { 'O', 'S' }, { 'C', 'V' } };
		JMenuItem[][] mI = { { new JMenuItem("打开(O)"), new JMenuItem("保存(S)") },
				{ new JMenuItem("复制(C)"), new JMenuItem("粘贴(V)") } };
		for (int i = 0; i < m.length; i++) {
			popupMenu.add(m[i]);
			m[i].setMnemonic(mC[0][i]);
			for (int j = 0; j < mI[i].length; j++) {
				m[i].add(mI[i][j]);
				mI[i][j].setMnemonic(mC[i + 1][j]);
				mI[i][j].setAccelerator(KeyStroke.getKeyStroke(mC[i + 1][j]));
				mI[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JMenuItem mItem = (JMenuItem) e.getSource();
						System.out.println("运行菜单项：" + mItem.getText());
					}
				});
			}
		}
		m[0].insertSeparator(1);
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger())
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
			}

			public void mouseReleased(MouseEvent e) {
				mousePressed(e);
			}
		}

		);
	}

	public static void main(String args[]) {
		PopupMenuUse app = new PopupMenuUse();
		app.setSize(260, 160);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
