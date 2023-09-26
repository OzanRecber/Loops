package loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		int right = 1;
		System.out.print("Welcome to the number guessing game!"
				+ "\nPlease enter a number between 1 and 100: ");
		while (right < 6) {
			int enteredNumber = scan.nextInt();
			if (enteredNumber < 1 || enteredNumber > 100) {
				System.out.print("You entered an incorrect number value!"
						+ "\nPlease enter a number between 1 and 100: ");
			} else {
				if (randomNumber == enteredNumber) {
					System.out.println("Congratulations! You guessed correctly on the " + right + "th try...");
				} else {
					if (enteredNumber < randomNumber && right < 5) {
						System.out.println("Wrong number! Your remaining right: " + (5 - right));
						System.out.print("Please enter a larger number: ");
					} else if (enteredNumber > randomNumber && right < 5) {
						System.out.println("Wrong number! Your remaining right: " + (5 - right));
						System.out.print("Please enter a smaller number: ");
					}
					right++;
				}
			}

		}
		System.out.println("Sorry, you've run out of right!");
		System.out.println("Random number: " + randomNumber);
		scan.close();
	}

}
