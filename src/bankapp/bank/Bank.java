/**
 * 
 */
package bankapp.bank;

import java.util.ArrayList;
import java.util.List;

import bankapp.account.Account;

/**
 * Aufgabe 2 - Bank. Bildet die Bankklasse als Manager der Accounts
 * 
 * @author andy.moser
 *
 */
public class Bank {
	// Der Index des letzten Account in der Liste
	private int lastAccountNr;
	List<Account> accounts = new ArrayList<>();

	/**
	 * gibt alle Konti zurück
	 * 
	 * @return
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	public int openAccount(String pin, Double balance) {
		int newAccountNumber = (this.accounts.size() + 1);

		Account acc = new Account(newAccountNumber, pin, balance);
		this.lastAccountNr = accounts.size();

		accounts.add(acc);

		return newAccountNumber;
	}

	public double getBalance() {
		return this.accounts.get(lastAccountNr).getBalance();
	}

	public boolean deposit(double amount) {
		return this.accounts.get(lastAccountNr).deposit(amount);
	}

	public boolean withdraw(double amount) {
		return this.accounts.get(lastAccountNr).withdraw(amount);
	}

	public boolean closeAccount(int nr, String pin) {
		Account ac = this.findAccount(nr);
		if (ac.getBalance() > 0) {
			return false;
		}
		this.accounts.remove(this.lastAccountNr);

		return true;
	}

	public Account findAccount(int nr) {

		for (int i = 0; i < this.accounts.size(); i++) {
			if (this.accounts.get(i).getNr() == nr) {
				this.lastAccountNr = i;
				return this.accounts.get(i);
			}
		}
		return null; // @TODO: throw noAccountFoundException
	}

}
