package loops;

import java.util.Scanner;

public class PalindromicWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Write the word to be checked: ");
		String str = scan.nextLine();
		int i = 0;
		int j = str.length() - 1;
		boolean isPalindrom = true;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrom = false;
			}
			i++;
			j--;
		}
		if (isPalindrom) {
			System.out.println("'" + str + "'" + " is a palindromic word.");
		} else {
			System.out.println("'" + str + "'" + " is not a palindromic word.");
		}
		scan.close();

	}

}
