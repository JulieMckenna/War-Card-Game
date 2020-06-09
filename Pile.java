/**
 * 
 */
//package edu.wit.cs.comp2000;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


/**
 * @author Julie McKenna
 * @param <T>
 *
 */

public class Pile {
	protected ArrayList<Card> cards;
	private int numberOfCards = 0;


	//A constructor to create a new Pile
	public Pile() {
		cards = new ArrayList<Card>();
	}


	//Add a card to a pile and keeps track of how many cards we have in a pile
	public void add(Card aCard) {
		numberOfCards++;
		cards.add(aCard);
	}


	//Get the top of the Pile if the Pile is not empty
	public Card getTop() {
		if (!cards.isEmpty()) {
			numberOfCards--;
			return cards.remove(0);
		}
		return null;
	}

	//Returns the boolean value if the Pile is empty
	public boolean isEmpty() {
		return (cards.isEmpty());
	}


	//Return the size of the Pile
	public int size() {
		return cards.size();
	}


	//Converts the Pile to a String
	public String toString() {
		return cards.toString();
	}


	//Shuffles a pile
	public void shuffle() {
		Collections.shuffle(cards);
	}


	public static void main(String[] args) {
		//Tests to make sure Pile class works
		/*
		Pile p = new Pile();
		System.out.println("There is a pile created" + p);
		Card c = new Card(Rank.ACE, Suit.CLUBS);
		Card d = new Card(Rank.TWO, Suit.HEARTS);
		Card e = new Card(Rank.THREE, Suit.DIAMONDS);
		p.add(c);
		p.add(d);
		p.add(e);
		System.out.println("This pile should have " + p);
		
		p.shuffle();
		System.out.println("this is shuffled " + p);
		
		System.out.println("The top card is " + p.getTop());
		System.out.println(p);
		p.getTop();
		p.getTop();
		System.out.println("This pile is now empty: " + p.getTop());
		*/
	}
}

