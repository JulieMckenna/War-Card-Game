//package edu.wit.cs.comp2000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Deck d = new Deck();
	//Used to shuffle cards after 12 plays so the decks stay random
	private static int countingPlays = 0;
	
	
	public static void main(String [] args){
		//creates hands for each of the players
		Hand player1 = new Hand();
		Hand player2 = new Hand();
		//splits the deck into 2, 26 cards for each player
		player1 = d.splitDeck(player1);
		player2 = d.splitDeck(player2);
		//will through an exception when there is nothing
		try {
			do {
				//get the top cards of each players Pile
				Card player1TopCard = player1.getTop();
				Card player2TopCard = player2.getTop();
				
				//Compare the 2 cards to test which card is higher
				if(player1TopCard.compareTo(player2TopCard) < player2TopCard.compareTo(player1TopCard)) {
					//if player 1 wins
					System.out.println("Player 1: " + player1TopCard + "\tPlayer 2: " + player2TopCard);
					System.out.println("Player 2 is the winner.");
					//add both cards to player 1's hand
					player2.add(player1TopCard);
					player2.add(player2TopCard);
					
					System.out.println("Player 1 has " + player1.size() + " cards left.");
					System.out.println("Player 2 has " + player2.size() + " cards left.");
					System.out.println("\n");
					
				} else if(player1TopCard.compareTo(player2TopCard) > player2TopCard.compareTo(player1TopCard)) {
					//if player 2 wins
					System.out.println("Player 1: " + player1TopCard + "\t\tPlayer 2: " + player2TopCard);
					System.out.println("Player 1 is the winner.");
					
					player1.add(player1TopCard);
					player1.add(player2TopCard);
					
					System.out.println("Player 1 has " + player1.size() + " cards left.");
					System.out.println("Player 2 has " + player2.size() + " cards left.");
					System.out.println("\n");
					
					
				} //This is War 
				 else {
					System.out.println("Player 1: " + player1TopCard + "\tPlayer 2: " + player2TopCard);
					System.out.println("This is war!");
					
					//War if a player has less than 4 cards
					if(player1.size() == 1 || player2.size() == 1) {
						//if one of the players only has 1 card 
						Hand winner = war1(player1, player2, player1TopCard, player2TopCard);
						if(winner == player1)
							System.out.println("Player 1 is the winner.");
						else
							System.out.println("Player 2 is the winner.");
						
						System.out.println("Player 1 has " + player1.size() + " cards left.");
						System.out.println("Player 2 has " + player2.size() + " cards left.");
						System.out.println("\n");
						
					} else if(player1.size() == 2 || player2.size() == 2) {
						
						Hand winner = war2(player1, player2, player1TopCard, player2TopCard);
						if(winner == player1)
							System.out.println("Player 1 is the winner.");
						else
							System.out.println("Player 2 is the winner.");
						
						System.out.println("Player 1 has " + player1.size() + " cards left.");
						System.out.println("Player 2 has " + player2.size() + " cards left.");
						System.out.println("\n");
						
					} else if(player1.size() == 3 || player2.size() == 3) {
						
						Hand winner = war3(player1, player2, player1TopCard, player2TopCard);
						if(winner == player1)
							System.out.println("Player 1 is the winner.");
						else
							System.out.println("Player 2 is the winner.");
						
						System.out.println("Player 1 has " + player1.size() + " cards left.");
						System.out.println("Player 2 has " + player2.size() + " cards left.");
						System.out.println();
						
					} else if(player1.size() >= 4 || player2.size() >= 4) {
						
						Card player1TopCard2 = player1.getTop();
						Card player1TopCard3 = player1.getTop();
						Card player1TopCard4 = player1.getTop();
						Card player1TopCard5 = player1.getTop();
						
						Card player2TopCard2 = player2.getTop();
						Card player2TopCard3 = player2.getTop();
						Card player2TopCard4 = player2.getTop();
						Card player2TopCard5 = player2.getTop();
						
						System.out.println("Player1's 5th card is " + player1TopCard5 + "\tPlayer2's 5th card is " + player2TopCard5);
						if(player1TopCard5.compareTo(player2TopCard5) > 0) {
							System.out.println("Player 1 has won the War!");
							player1.add(player1TopCard);
							player1.add(player1TopCard2);
							player1.add(player1TopCard3);
							player1.add(player1TopCard4);
							player1.add(player1TopCard5);
							player1.add(player2TopCard);
							player1.add(player2TopCard2);
							player1.add(player2TopCard3);
							player1.add(player2TopCard4);
							player1.add(player2TopCard5);
							
						} else if(0 < player2TopCard5.compareTo(player1TopCard5)) {
							System.out.println("Player 2 has won the War!");
							player2.add(player1TopCard);
							player2.add(player1TopCard2);
							player2.add(player1TopCard3);
							player2.add(player1TopCard4);
							player2.add(player1TopCard5);
							player2.add(player2TopCard);
							player2.add(player2TopCard2);
							player2.add(player2TopCard3);
							player2.add(player2TopCard4);
							player2.add(player2TopCard5);
						}
							
						else {
							
						if(player1.size() >= 4 && player2.size() >= 4) {
							Hand winner = war4(player1, player2, player1.getTop(), player2.getTop());
							if(winner == player1) {
								player1.add(player1TopCard);
								player1.add(player1TopCard2);
								player1.add(player1TopCard3);
								player1.add(player1TopCard4);
								player1.add(player1TopCard5);
								player1.add(player2TopCard);
								player1.add(player2TopCard2);
								player1.add(player2TopCard3);
								player1.add(player2TopCard4);
								player1.add(player2TopCard5);
							}
							else {
								System.out.println("Player 2 has won the War!");
								player2.add(player1TopCard);
								player2.add(player1TopCard2);
								player2.add(player1TopCard3);
								player2.add(player1TopCard4);
								player2.add(player1TopCard5);
								player2.add(player2TopCard);
								player2.add(player2TopCard2);
								player2.add(player2TopCard3);
								player2.add(player2TopCard4);
								player2.add(player2TopCard5);
							}
						}
						else if(player1.size() == 3 || player2.size() == 3)
							war3(player1, player2, player1.getTop(), player2.getTop());
						else if(player1.size() == 2 || player2.size() == 2)
							war2(player1, player2, player1.getTop(), player2.getTop());
						else
							war1(player1, player2, player1.getTop(), player2.getTop());
						}
						System.out.println("Player 1 has " + player1.size() + " cards left.");
						System.out.println("Player 2 has " + player2.size() + " cards left.");
						System.out.println("\n");
					}
				//Add to the plays to keep track of the plays made
				countingPlays++;
				
				//If there are 12 plays it will shuffle each pile and print a message saying it shuffled
				if(countingPlays >= 12) {
					player1.shuffle();
					player2.shuffle();
					System.out.println("Cards have been shuffled for each hand \n\n");
					//resets the counter to 0
					countingPlays = 0;
				}
				}
			} while(player1.size() > 0 || player2.size() > 0);
			
			} catch (NullPointerException e) {
			if(player1.size() == 0) {
				System.out.println("Winner is Player 2");
			} else {
				System.out.println("Winner is Player 1");
			}
		}
	}

	//if both players have 4 or more cards
	public static Hand war4(Hand player1, Hand player2, Card player1TopCard, Card player2TopCard)
	{
		Hand winner;
		Card player1TopCard2 = player1.getTop();
		Card player1TopCard3 = player1.getTop();
		Card player1TopCard4 = player1.getTop();
		Card player1TopCard5 = player1.getTop();
		
		Card player2TopCard2 = player2.getTop();
		Card player2TopCard3 = player2.getTop();
		Card player2TopCard4 = player2.getTop();
		Card player2TopCard5 = player2.getTop();
		
		System.out.println("Player1's 5th card is " + player1TopCard5 + "\tPlayer2's 5th card is " + player2TopCard5);
		if(player1TopCard5.compareTo(player2TopCard5) > 0) {
			System.out.println("Player 1 has won the War!");
			player1.add(player1TopCard);
			player1.add(player1TopCard2);
			player1.add(player1TopCard3);
			player1.add(player1TopCard4);
			player1.add(player1TopCard5);
			player1.add(player2TopCard);
			player1.add(player2TopCard2);
			player1.add(player2TopCard3);
			player1.add(player2TopCard4);
			player1.add(player2TopCard5);
			System.out.println("Player 1 has " + player1.size() + " cards left.");
			System.out.println("Player 2 has " + player2.size() + " cards left.");
			System.out.println("\n");
			winner = player1;
		} else if(0 < player2TopCard5.compareTo(player1TopCard5)) {
			System.out.println("Player 2 has won the War!");
			player2.add(player1TopCard);
			player2.add(player1TopCard2);
			player2.add(player1TopCard3);
			player2.add(player1TopCard4);
			player2.add(player1TopCard5);
			player2.add(player2TopCard);
			player2.add(player2TopCard2);
			player2.add(player2TopCard3);
			player2.add(player2TopCard4);
			player2.add(player2TopCard5);
			
			winner = player2;
		}
		else {
			if(player1.size() >= 4 && player2.size() >= 4) {
				winner = war4(player1, player2, player1.getTop(), player2.getTop());}
			else if(player1.size() == 3 || player2.size() == 3)
				winner = war3(player1, player2, player1.getTop(), player2.getTop());
			else if(player1.size() == 2 || player2.size() == 2)
				winner = war2(player1, player2, player1.getTop(), player2.getTop());
			else
				winner = war1(player1, player2, player1.getTop(), player2.getTop());
		}
		return winner;
				
	}
	
	//if either of the players have 3 cards
	public static Hand war3(Hand player1, Hand player2, Card player1TopCard, Card player2TopCard) {
		Hand winner;
		Card player1TopCard2 = player1.getTop();
		Card player1TopCard3 = player1.getTop();
		Card player1TopCard4 = player1.getTop();
		
		Card player2TopCard2 = player2.getTop();
		Card player2TopCard3 = player2.getTop();
		Card player2TopCard4 = player2.getTop();
	
		System.out.println("Player1's 4th card is " + player1TopCard4 + "\tPlayer2's 4th card is " + player2TopCard4);
		if(player1TopCard4.compareTo(player2TopCard4) > player2TopCard4.compareTo(player1TopCard4)) {
			System.out.println("Player 1 has won the War!");
			player1.add(player1TopCard);
			player1.add(player1TopCard2);
			player1.add(player1TopCard3);
			player1.add(player1TopCard4);
			player1.add(player2TopCard);
			player1.add(player2TopCard2);
			player1.add(player2TopCard3);
			player1.add(player2TopCard4);
			System.out.println("Player 1 has " + player1.size() + " cards left.");
			System.out.println("Player 2 has " + player2.size() + " cards left.");
			System.out.println("\n");
			winner = player1;
		} else if(player1TopCard4.compareTo(player2TopCard4) < player2TopCard4.compareTo(player1TopCard4)) {
			System.out.println("Player 2 has won the War!");
			player2.add(player1TopCard);
			player2.add(player1TopCard2);
			player2.add(player1TopCard3);
			player2.add(player1TopCard4);
			player2.add(player2TopCard);
			player2.add(player2TopCard2);
			player2.add(player2TopCard3);
			player2.add(player2TopCard4);
			System.out.println("Player 1 has " + player1.size() + " cards left.");
			System.out.println("Player 2 has " + player2.size() + " cards left.");
			System.out.println("\n");
			winner = player2;
		}
		else {
			if(player2.size() == 0) {
				System.out.println("Player 2 ran out of cards");
				player1.add(player1TopCard);
				player1.add(player1TopCard2);
				player1.add(player2TopCard);
				player1.add(player2TopCard2);
				player1.add(player1TopCard3);
				player1.add(player2TopCard3);
				player1.add(player1TopCard4);
				player1.add(player2TopCard4);
				winner = player1;
			} else {
				System.out.println("Player 1 ran out of cards");
				player2.add(player1TopCard);
				player2.add(player1TopCard2);
				player2.add(player2TopCard);
				player2.add(player2TopCard2);
				player2.add(player1TopCard3);
				player2.add(player2TopCard3);
				player2.add(player1TopCard4);
				player2.add(player2TopCard4);
				winner = player2;
			}
		}	
		return winner;
	}
	
	//if either of the players have 2 cards
	public static Hand war2(Hand player1, Hand player2, Card player1TopCard, Card player2TopCard) {
		Hand winner;
		Card player1TopCard2 = player1.getTop();
		Card player1TopCard3 = player1.getTop();
		
		Card player2TopCard2 = player2.getTop();
		Card player2TopCard3 = player2.getTop();
	
		System.out.println("Player1's 3rd card is " + player1TopCard3 + "\tPlayer2's 3rd card is " + player2TopCard3);
		if(player1TopCard3.compareTo(player2TopCard3) > player2TopCard3.compareTo(player1TopCard3)) {
			System.out.println("Player 1 has won the War!");
			player1.add(player1TopCard);
			player1.add(player1TopCard2);
			player1.add(player1TopCard3);
			player1.add(player2TopCard);
			player1.add(player2TopCard2);
			player1.add(player2TopCard3);
			System.out.println("Player 1 has " + player1.size() + " cards left.");
			System.out.println("Player 2 has " + player2.size() + " cards left.");
			System.out.println("\n");
			winner = player1;
				
			
		} else if(player1TopCard3.compareTo(player2TopCard3) < player2TopCard3.compareTo(player1TopCard3)) {
			System.out.println("Player 2 has won the War!");
			player2.add(player1TopCard);
			player2.add(player1TopCard2);
			player2.add(player1TopCard3);
			player2.add(player2TopCard);
			player2.add(player2TopCard2);
			player2.add(player2TopCard3);
			System.out.println("Player 1 has " + player1.size() + " cards left.");
			System.out.println("Player 2 has " + player2.size() + " cards left.");
			System.out.println("\n");
			winner = player2;
			
		}
		else {
			if(player2.size() == 0) {
				System.out.println("Player 2 ran out of cards");
				player1.add(player1TopCard);
				player1.add(player1TopCard2);
				player1.add(player2TopCard);
				player1.add(player2TopCard2);
				player1.add(player1TopCard3);
				player1.add(player2TopCard3);
				winner = player1;
			} else {
			System.out.println("Player 1 ran out of cards");
				player2.add(player1TopCard);
				player2.add(player1TopCard2);
				player2.add(player2TopCard);
				player2.add(player2TopCard2);
				player2.add(player1TopCard3);
				player2.add(player2TopCard3);
				winner = player2;
			}
		}
		return winner;
	}
	
	//if either of the players only have 1 card
	public static Hand war1(Hand player1, Hand player2, Card player1TopCard, Card player2TopCard) {
		Hand winner;
		Card player1TopCard2 = player1.getTop();
		Card player2TopCard2 = player2.getTop();
		
		System.out.println("Player1's second card is " + player1TopCard2 + "\tPlayer2's second card is " + player2TopCard2);
		if(player1TopCard2.compareTo(player2TopCard2) > 0) {
			System.out.println("Player 1 has won the War!");
			player1.add(player1TopCard);
			player1.add(player1TopCard2);
			player1.add(player2TopCard);
			player1.add(player2TopCard2);
			System.out.println("Player 1 has " + player1.size() + " cards left.");
			System.out.println("Player 2 has " + player2.size() + " cards left.");
			System.out.println("\n");
			winner = player1;
		} else if(0 < player2TopCard2.compareTo(player1TopCard2)) {
			System.out.println("Player 2 has won the War!");
			player2.add(player1TopCard);
			player2.add(player1TopCard2);
			player2.add(player2TopCard);
			player2.add(player2TopCard2);
			System.out.println("Player 1 has " + player1.size() + " cards left.");
			System.out.println("Player 2 has " + player2.size() + " cards left.");
			System.out.println("\n");
			winner = player2;
		} else {
			if(player2.size() == 0) {
				player1.add(player1TopCard);
				player1.add(player1TopCard2);
				player1.add(player2TopCard);
				player1.add(player2TopCard2);
				winner = player1;
			} else {
				player2.add(player1TopCard);
				player2.add(player1TopCard2);
				player2.add(player2TopCard);
				player2.add(player2TopCard2);
				winner = player2;
			}
		}	
		return winner;
	}
}

