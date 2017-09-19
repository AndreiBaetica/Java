package reverseGuesser;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Implement memory system for troubleshooting/lie detecting
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose a number between 0 and 100 and I will attempt to guess it in seven tries.");
		int tries = 1;
		int min = 1;
		int max = 99;

		superLoop: while (tries < 8) {
			int mid = ((min + max) / 2);
			System.out.println("Guess " + tries + ": " + mid + " (y)es? (h)igher? (l)ower?");
			String ans = scanner.nextLine();
			if (ans.equalsIgnoreCase("y")) {
				System.out.println("Won in " + tries + " attempts");
				break superLoop;
			}
			else if(ans.equalsIgnoreCase("h")){
				min = mid;
			}
			else if(ans.equalsIgnoreCase("l")){
				max = mid;
			}
			tries++;
			System.out.println(tries);
		}
		if(tries==8){
			System.out.println("Well shit");
		}
	}

}
