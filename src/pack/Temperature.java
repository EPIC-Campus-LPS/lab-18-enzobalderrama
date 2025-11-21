package pack;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class Temperature {

	public static void main(String[] args) throws IOException{
		File file = new File("temperature.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Integer> temps = new ArrayList<>();
		while (sc.hasNextLine()) {
			double temp = Double.parseDouble(sc.nextLine());
			int tempone = (int)temp;
			temps.add(tempone);
		}
		int avgcalc = 0;
		int count = 0;
		int max = temps.get(0);
		int min = temps.get(0);
		for (int i = 0; i < temps.size(); i++) {
			avgcalc+=temps.get(i);
			count++;
			if (temps.get(i) > max) {
				max = temps.get(i);
			}
			if (temps.get(i) < min) {
				min = temps.get(i);
			}
		}
		System.out.println("Average temp: " + avgcalc/count);
		System.out.println("Max temp: " + max);
		System.out.println("Min temp: " + min);
		if (count <= 10) {
			System.out.println("Array Size: 10");
		}
		else {
			int i = 10;
			while(i < count) {
				i*=10;
				if (count <= i) {
					System.out.println("Array Size: " + i);
				}
			}
		}
		
	}

}
