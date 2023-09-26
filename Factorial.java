package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to be calculated as a factorial: ");
		int number = scan.nextInt();
		scan.close();
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		System.out.println(number + "! = " + result);

	}

}
