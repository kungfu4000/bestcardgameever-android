package com.sheepzkeen.yaniv;

import java.io.Serializable;

/**
 * a Serializable Singleton that holds the game data
 * @author Elad
 *
 */
public class GameData implements Serializable {
	
	// Eagerly created instance
	private static GameData instance = new GameData();
	
	
	public static GameData getInstance() {
		return instance;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4564493907808892053L;
	// Player 1 - Logic elements
	private PlayerHand p1Hand;
	// Opponent 1 - Logic elements
	private OpponentHand o1Hand;
	// Opponent 2 - Logic elements
	private OpponentHand o2Hand;
	// Opponent 3 - Logic elements
	private OpponentHand o3Hand;
	//Thrown Cards - Logic elements	
	private ThrownCards thrownCards;
	//Turn - Logic elements
	private Turn<Hand> turn;
	//Deck - Logic elements
	SingleDeck deck;
	
	protected void init(PlayerHand hand, OpponentHand hand2, OpponentHand hand3,
			OpponentHand hand4, ThrownCards thrownCards, 
			SingleDeck deck, Turn<Hand> turn) {
		p1Hand = hand;
		o1Hand = hand2;
		o2Hand = hand3;
		o3Hand = hand4;
		this.thrownCards = thrownCards;
		this.deck = deck;
		this.turn = turn;
	}

	private GameData(){
		//Do nothing
	}

	public PlayerHand getP1Hand() {
		return p1Hand;
	}

	public OpponentHand getO1Hand() {
		return o1Hand;
	}

	public OpponentHand getO2Hand() {
		return o2Hand;
	}

	public OpponentHand getO3Hand() {
		return o3Hand;
	}

	public ThrownCards getThrownCards() {
		return thrownCards;
	}

	public Turn<Hand> getTurn() {
		return turn;
	}

	public SingleDeck getDeck() {
		return deck;
	}


}
