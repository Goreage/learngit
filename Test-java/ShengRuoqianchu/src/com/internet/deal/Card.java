package com.internet.deal;
	/*
	 * ��ĿĿ�ģ�������ѧ֪ʶ��дϴ���뷢��ģ�����ͨ����Ŀѵ���ﵽ������ѧ֪ʶ�Լ�Ԥϰ��֪ʶ��Ŀ��
	 * ��Ŀ���������
	 */
public class Card {
	private String face;	//����
	private String suit;	//��ɫ������ң����ң�÷��������
	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}
	//��ʾһ����
	public String toString() {
		return suit + face;
	}
}
