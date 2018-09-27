package bankapp.atm;

import java.util.Scanner;

public class ATM {

	private Scanner scanner = new Scanner(System.in);

	public void run() {
		while (true) {
			System.out.println("   A   TTTTTTT M     M");
			System.out.println("  A A     T    MM   MM");
			System.out.println(" AAAAA    T    M M M M");
			System.out.println("A     A   T    M  M  M");
			System.out.println();
			System.out.println("A  Open Account");
			System.out.println("B  Get Balance");
			System.out.println("C  Deposit");
			System.out.println("D  Withdraw");
			System.out.println("E  Close Account");
			System.out.println("X  Exit");
			System.out.println();
			System.out.print("> ");
			String choice = scanner.nextLine().toUpperCase();
			switch (choice) {
			case "A":
				openAccount();
				break;
			case "B":
				getBalance();
				break;
			case "C":
				deposit();
				break;
			case "D":
				withdraw();
				break;
			case "E":
				closeAccount();
				break;
			case "X":
				listAccounts();
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
			System.out.println("Hit Enter to continue...");
			scanner.nextLine();
		}
	}

	private void openAccount() {
	}

	private void getBalance() {
	}

	private void deposit() {
	}

	private void withdraw() {
	}

	private void closeAccount() {
	}

	private void listAccounts() {
	}
}