package pack;
import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> hand;
	private int score;
	
	public Player(String n) {
		name = n;
		score = 0;
		hand = new ArrayList<Card>();
	}
	public void draw(Deck deck) {
		hand.add(deck.drawCard());
	}
	public void drawStartingHand(Deck deck) {
		for (int i = 0; i < 5; i++) {
			hand.add(deck.drawCard());
		}
	}
	public void addPoint() {
		score++;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public Card playCard() {
		if (hand.size() < 1) {
			return null;
		}
		Card h = hand.get(0);
		for (int i = 1; i < hand.size(); i++) {
			Card c = hand.get(i);
			if (c.getValue() > h.getValue()) {
				h = c;
			}
		}
		hand.remove(h);
		return h;
	}
}
