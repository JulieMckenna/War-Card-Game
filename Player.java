/**
 * 
 */
//package edu.wit.cs.comp2000;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Julie McKenna
 *
 */
public class Player extends Pile {
	private List<Hand> hands = new ArrayList<>();
	ArrayList<Card> player1 = new ArrayList<>();


	//A constructor for a new player
	public Player() {
		hands.add(new Hand());
	}


	public static void main(String[] args) {
	}

}
