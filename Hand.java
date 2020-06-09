/**
 * 
 */
//package edu.wit.cs.comp2000;

/**
 * @author Julie McKenna
 *
 */
public class Hand extends Pile {

	Pile playerHand = new Pile();


	//Constructor to create a new Hand
	public Hand() {
		Pile playerHand = new Pile();
	}

	//Taking the method shuffle from Pile to shuffle
	public void shuffle() {
		super.shuffle();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}
}
