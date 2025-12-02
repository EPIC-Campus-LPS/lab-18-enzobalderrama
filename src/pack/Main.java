package pack;
import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Player one = new Player("Alice");
		Player two = new Player("Bob");
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] type = {"Clovers", "Spades", "Diamonds", "Hearts"};
		ArrayList<String> types = new ArrayList<String>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < type.length; j++) {
				types.add(nums[i], type[j]);
			}
		}
		Deck d = new Deck(types);
		Deck.drawStartingHand(d);
	}

}
