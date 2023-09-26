package loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// In the Fibonacci series, numbers start from 0 and 1,
		// and each subsequent number progresses as the sum of the two numbers before it.
		// Example: 0 1 1 2 3 5 8 13 21 34...
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit number to calculate Fibonacci: ");
        int n = scan.nextInt();
        int first = 0, second = 1, next;
        scan.close();
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
	}

}
