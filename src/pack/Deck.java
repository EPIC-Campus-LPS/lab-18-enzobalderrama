package pack;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	public Deck(ArrayList<Card> c) {
		for (int i = 0; i < 52; i++) {
			Card.add(c.get(i));
		}
		
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card drawCard() {
		if (cards.size() < 1) {
			return null;
		}
		Card h = cards.get(0);
		cards.remove(0);
		return h;
	}
}
