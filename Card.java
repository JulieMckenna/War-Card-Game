/**
 * 
 */
//package edu.wit.cs.comp2000;


/**
 * 
 */
public class Card implements Comparable<Card> {

	private Rank rank;
	private Suit suit;


	//A constructor to create a new Card
	public Card( Rank r, Suit s) {
		this.suit = s;
		this.rank = r;
	}


	/*
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	//Compares the points of each card to see which card is higher
	@Override
	public int compareTo(Card anotherCard) {
		if(this.rank.getPoints() > anotherCard.rank.getPoints()) {
			return 1;
		} else if(this.rank.getPoints() < anotherCard.rank.getPoints()) {
			return -1;
		} else {
		return 0;
		}
	}


	//Returns the rank of a cark
	Rank getRank() {
		return this.rank;
	}


	//Converts the card to a String that displays the rank and suit
	public String toString() {		
		return rank.getDisplayName() + " of " + suit.getDisplayName();	
	}


	public static void main(String[] args) {
		//Tests to show the card class works
		/*	
		Card a = new Card(Rank.THREE, Suit.DIAMONDS);
		Card b = new Card(Rank.ACE, Suit.CLUBS);
		System.out.println(a.rank.getPoints() +  " " + b.rank.getPoints() + " " + b.rank.getDisplayName());
		System.out.println(a.suit.getGraphic() + " " + b.suit.getGraphic());
		 */
	}
}
