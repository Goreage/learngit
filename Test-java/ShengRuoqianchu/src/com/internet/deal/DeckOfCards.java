package com.internet.deal;

import java.util.Random;

public class DeckOfCards {
	private Card deck[];	//Card����������
	private int currentCard;	//Ҫ�������һ������Ԫ��ֵ
	private final int NUMBER_OF_CARDS=52;	//�Ƶ�����
	private Random randomNumbers;		//�����������ʵ��ϴ��
	public DeckOfCards() {
		String faces[] = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
		String suits[] = {"����","����","÷��","����"};
		deck = new Card [ NUMBER_OF_CARDS ];		//��������ռ�
		currentCard=0;		//����currentCardΪ��һ��Card���󣬼�deck[0]
		randomNumbers = new Random();	//ʵ��������
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
