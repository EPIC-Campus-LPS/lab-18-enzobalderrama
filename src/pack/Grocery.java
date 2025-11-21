package pack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Grocery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Item: ");
		String input = scan.nextLine();
		ArrayList<String> arr = new ArrayList<>();
		arr.add(input);
		while (!(input.equals("STOP"))){
			System.out.print("Item: ");
			input = scan.nextLine();
			arr.add(input);
		}
		arr.remove(arr.size()-1);
		Collections.sort(arr);
		int count = 1;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i+1; j < arr.size();j++) {
				if (arr.get(j).equals(arr.get(i))) {
					count++;
				}
			}
			System.out.println(arr.get(i).toUpperCase() + " " + count);
			i = i+count-1;
			count = 1;
		}
	}

}
