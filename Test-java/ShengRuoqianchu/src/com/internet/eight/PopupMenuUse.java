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
	 * �����ߣ�***
	 * �����ص㣺***
	 * ����ʱ�䣺****��**��**��
	 * ���һ���޸�ʱ�䣺****��**��**��
	 * ���ܼ�飺�߼�����еĿ�ݲ˵���ʹ��
	 */
public class PopupMenuUse extends JFrame {
	private JPopupMenu popupMenu;

	public PopupMenuUse() {
		super("��ݲ˵���ʹ��");
		popupMenu = new JPopupMenu();
		JMenu[] m = { new JMenu("�ļ�(F)"), new JMenu("�༭(E)") };
		char[][] mC = { { 'F', 'E' }, { 'O', 'S' }, { 'C', 'V' } };
		JMenuItem[][] mI = { { new JMenuItem("��(O)"), new JMenuItem("����(S)") },
				{ new JMenuItem("����(C)"), new JMenuItem("ճ��(V)") } };
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
						System.out.println("���в˵��" + mItem.getText());
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
