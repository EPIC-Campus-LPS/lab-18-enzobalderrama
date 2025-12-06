package pack;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	public Deck() {
		cards = new ArrayList<Card>();
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] type = {"Clovers", "Spades", "Diamonds", "Hearts"};
		String[] strnums = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				Card c = new Card(type[i], strnums[j], nums[j]);
				cards.add(c);
			}
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
