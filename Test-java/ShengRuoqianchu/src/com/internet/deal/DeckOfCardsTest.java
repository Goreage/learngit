package com.internet.deal;

public class DeckOfCardsTest {
	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		System.out.printf("%-20s%-20s%-20s%-20s\n","���1","���2","���3","���4");
		for (int i=0; i<13; i++) {
			System.out.printf("%-20s%-20s%-20s%-20s\n",
					myDeckOfCards.dealCard(),myDeckOfCards.dealCard(),
					myDeckOfCards.dealCard(),myDeckOfCards.dealCard());
		}
	}
}
