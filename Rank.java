/**
 * An enumeration of card ranks.
 * 
 * @author David M Rosenberg - Tu 3/16/2016
 */
package edu.wit.cs.comp2000;

public enum Rank {

	//Element   Display Name    Graphic     Points      Priority    
	ACE     (   "Ace",          "A",        14,         14),
	TWO     (   "Duece",        "2",        2,          2),
	THREE   (   "Three",        "3",        3,          3),
	FOUR    (   "Four",         "4",        4,          4),
	FIVE    (   "Five",         "5",        5,          5),
	SIX     (   "Six",          "6",        6,          6),
	SEVEN   (   "Seven",        "7",        7,          7),
	EIGHT   (   "Eight",        "8",        8,          8),
	NINE    (   "Nine",         "9",        9,          9),
	TEN     (   "Ten",          "10",       10,         10),
	JACK    (   "Jack",         "J",        11,         11),
	QUEEN   (   "Queen",        "Q",        12,         12),
	KING    (   "King",         "K",        13,         13),
	//JOKER   (   "Joker",        "R",        0,          0)
	;


	private final String displayName;
	private final String graphic;
	private final int points;
	private final int priority;
	

	private Rank(String rankDisplayName, String rankGraphic, int rankPoints,
		 int rankPriority) {
		displayName =   rankDisplayName;
		graphic =       rankGraphic;
		points =        rankPoints;
		priority =      rankPriority;

	} // end constructor

	public String getDisplayName() {
		return displayName;
	} // end getDisplayName


	public String getGraphic() {
		return graphic;
	} // end getGraphic


	public int getPoints() {
		return points;
	} // end getPoints


	public int getPriority() {
		return priority;
	} // end getPriority


	@Override
	public String toString() {
		return graphic ;
	}


    public static void main(String[] args) {
        // display column headers
        System.out.printf( "%-5s %-8s %-8s %-15s %-15s %-6s  %-10s%n ", 
                            "#",
                            "Rank",
                            "Graphic",
                            "Name",
                            "Display Name",
                            "Points",
                            "Priority");
        
        // display each element of the enumeration
        for (Rank aRank : Rank.values()) {
            System.out.printf( "%-5d %-8s %-8s %-15s %-15s %-6d   %-10d%n ", 
                                aRank.ordinal(),
                                aRank,
                                aRank.graphic,
                                aRank.name(),
                                aRank.displayName,
                                aRank.points,
                                aRank.priority);
        }
    }

} // end Rank
