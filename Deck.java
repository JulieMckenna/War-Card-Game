/**
 * 
 */
//package edu.wit.cs.comp2000;
import java.util.*;

/**
 *
 */
public class Deck extends Pile {


		//A constructor to create a new deck with all the cards and shuffle all of them
		public Deck()
		{
			for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				Card c = new Card(r,s);
				cards.add(c);
			}
		}
		shuffle();
	}



	public static void main(String[] args) {
		//Tests to show Deck constructor and shuffle class works
		/*
		Deck c = new Deck();
		System.out.println(c + "\n");
		c.shuffle();
		System.out.println(c + "\n");
		*/
	}


	//Call the method shuffle() in Pile class
	public void shuffle()
	{
		super.shuffle();
		
	}

	//A one time use of splitting a shuffled deck to one player
	public Hand splitDeck(Hand player){
		Deck d = new Deck();
		d.shuffle();
		
		for(int i = 0; i< 26;i++){
			player.add(d.getTop());
	    }
		return player;
	    //System.out.println(d);

	}
}
