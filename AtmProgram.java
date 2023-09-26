package loops;

import java.util.Scanner;

public class AtmProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userName = "ozan";
		String password = "1990";
		double balance = 10000;

		System.out.print("Username: ");
		String enteredUsername = scan.nextLine();
		System.out.print("Password: ");
		String enteredPassword = scan.nextLine();

		if (enteredUsername.equals(userName) && enteredPassword.equals(password)) {
			System.out.println("Welcome " + userName + "!");
			while (true) {
				System.out.println("Please select an option:"
						+ "\n1. Check Balance"
						+ "\n2. Withdraw Money"
						+ "\n3. Deposit Money"
						+ "\n4. Exit");
				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Your balance: " + balance + " $");
					break;
				case 2:
					System.out.print("Enter the amount to withdraw: ");
					double withdrawnAmount = scan.nextDouble();
					if (withdrawnAmount <= balance) {
						balance -= withdrawnAmount;
						System.out.println("Withdrawn amount: " + withdrawnAmount + " $"
								+ "\nAvailable balance: " + balance + " $");
					} else {
						System.out.println("Insufficient balance."
								+ "\nAvailable balance: " + balance + " $");
					}
					break;
				case 3:
					System.out.print("Enter the amount to deposit: ");
					double depositedAmount = scan.nextDouble();
					if (depositedAmount > 0) {
						balance += depositedAmount;
						System.out.println("Deposited amount: " + depositedAmount + " $"
								+ "\nAvailable balance: " + balance + " $");
					} else {
						System.out.println("Invalid amount.");
					}
					break;
				case 4:
					System.out.println("Exiting. Have a nice day!");
					return;
				default:
					System.out.println("Invalid option. Please try again.");
				}
			}
		} else {
			System.out.println("Invalid username or password. Exiting.");
		}
		scan.close();

	}

}
