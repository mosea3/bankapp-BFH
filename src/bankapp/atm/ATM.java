package bankapp.atm;

import java.util.Scanner;

import bankapp.account.Account;
import bankapp.bank.Bank;

public class ATM {

	private Scanner scanner = new Scanner(System.in);
	private Bank bank;

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
		System.out.println("PIN: ");
		String pin = scanner.nextLine();
		int nr = this.bank.openAccount(pin, 0.0);
		System.out.println("Account with number " + nr + " opened");

	}

	private void getBalance() {
		System.out.println("NR: "); // oder Bankkarte
		int nr = Integer.parseInt(scanner.nextLine());

		System.out.println("PIN: ");
		String pin = scanner.nextLine();

		Double balance = bank.getBalance(nr, pin);
		if (balance == null) {
			System.out.println("No Account found or wrong PIN");
		}

		System.out.println("current Balance: " + balance);

	}

	private void deposit() {
		System.out.println("NR: "); // oder Bankkarte
		int nr = Integer.parseInt(scanner.nextLine());

		System.out.println("Amount: ");
		Double amount = Double.parseDouble(scanner.nextLine());

		if (bank.deposit(nr, amount)) {
			System.out.println("Deposition successful!");
		} else {
			System.out.println("Deposition not successful!");
		}

	}

	private void withdraw() {
		System.out.println("NR: "); // oder Bankkarte
		int nr = Integer.parseInt(scanner.nextLine());

		System.out.println("PIN: ");
		String pin = scanner.nextLine();

	}

	private void closeAccount() {
		System.out.println("NR: "); // oder Bankkarte
		int nr = Integer.parseInt(scanner.nextLine());

		System.out.println("PIN: ");
		String pin = scanner.nextLine();

		if (bank.closeAccount(nr, pin)) {
			System.out.println("Account #" + nr + " was closed.");
		}

		System.out.println("Account closing not successful!");
	}

	private void listAccounts() {
		System.out.println("------CONFIDENTIAL------");

		System.out.println("Account		Identifier		Balance");
		for (Account ac : bank.getAccounts()) {
			System.out.println("Account #" + ac.getNr() + "	ID:" + ac.hashCode() + "	Balance:" + ac.getBalance());
		}
	}

	public boolean setBank(Bank b) {
		this.bank = b;
		return true;
	}
}