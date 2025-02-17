package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techelevator.cards.Card;

public class Deck {

	private List<Card> listOfCards = new ArrayList<Card>();
	
	private static final String[] suits = { "c", "s", "d", "h" };
	private static final String[] ranks = { "A", "2", "3", "4", "5","6","7","8","9","T","J","Q","K" };
	
	public Deck() {
		for (String suit : suits) {
			for (String rank : ranks) {
				Card currentCard = new Card(suit, rank);
				listOfCards.add(currentCard);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(listOfCards);
	}
	
	public Card deal() {
		if (size() != 0) {
			return listOfCards.remove(0);
		} else {
			return null;
		}
	}
	
	//Delegate method
	public int size() {
		return listOfCards.size();
	}
	
	@Override
	public String toString() {
		
		flip();
		String deckAsString = "Deck [listOfCards=" + listOfCards + "]";
		flip();
		return deckAsString;
		
	}
	
	private void flip() {
		for (Card card : listOfCards) {
			card.flip();
		}
	}

	
}

