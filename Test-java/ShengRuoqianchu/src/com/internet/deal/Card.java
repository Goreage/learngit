package com.internet.deal;
	/*
	 * 项目目的：运用已学知识编写洗牌与发牌模拟程序，通过项目训练达到巩固已学知识以及预习新知识的目的
	 * 项目需求分析：
	 */
public class Card {
	private String face;	//点数
	private String suit;	//花色，如红桃，黑桃，梅花，方块
	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}
	//显示一张牌
	public String toString() {
		return suit + face;
	}
}
