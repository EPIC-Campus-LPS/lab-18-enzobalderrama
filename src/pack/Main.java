package pack;
import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Player one = new Player("Alice");
		Player two = new Player("Bob");
		Deck d = new Deck();
        d.shuffle();
		one.drawStartingHand(d);
		two.drawStartingHand(d);
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Round " + i);
			Card uno = one.playCard();
			Card dos = two.playCard();
			System.out.println(one.getName() + " plays " + uno + ", " + two.getName() + " plays " + dos);
			if (uno.getValue() > dos.getValue()) {
				one.addPoint();
				System.out.println(one.getName() + " wins the round!\n");
			}
			else if (uno.getValue() < dos.getValue()) {
				two.addPoint();
				System.out.println(two.getName() + " wins the round!\n");
			}
			else {
				System.out.println("It's a tie!\n");
			}
		}
		
		System.out.println("\nFinal Score:\n" + one.getName() + ": " + one.getScore() + "\n" + two.getName() + ": " + two.getScore());
		
		if (one.getScore() > two.getScore()) {
			System.out.println(one.getName() + " is the winner! Congratulations!");
		}
		else if (one.getScore() < two.getScore()) {
			System.out.println(two.getName() + " is the winner! Congratulations!");
		}
		else {
			System.out.println("The game is a tie! Nice try though y'all.");
		}
	}

}
