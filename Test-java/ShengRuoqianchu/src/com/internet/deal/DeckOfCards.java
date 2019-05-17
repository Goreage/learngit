package com.internet.deal;

import java.util.Random;

public class DeckOfCards {
	private Card deck[];	//Card类的数组对象
	private int currentCard;	//要处理的下一个数组元素值
	private final int NUMBER_OF_CARDS=52;	//牌的数量
	private Random randomNumbers;		//随机数，用于实现洗牌
	public DeckOfCards() {
		String faces[] = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
		String suits[] = {"黑桃","红桃","梅花","方块"};
		deck = new Card [ NUMBER_OF_CARDS ];		//分配数组空间
		currentCard=0;		//设置currentCard为第一个Card对象，即deck[0]
		randomNumbers = new Random();	//实例化对象
		for (int count=0; count<deck.length; count++)
			deck[ count ] = new Card(faces[count%13],suits[count/13]);
	}
	public void shuffle() {
		currentCard=0;
		for (int first=0; first<deck.length; first++) {
			int second=randomNumbers.nextInt(NUMBER_OF_CARDS);
			Card temp=deck[ first ];
			deck[ first ] = deck[second ];
			deck[ second ] = temp;
		}
	}
	public Card dealCard() {
		if (currentCard<deck.length)
			return deck[ currentCard++ ];
		else
			return null;
	}
}
