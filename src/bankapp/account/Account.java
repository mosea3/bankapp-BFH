/**
 * 
 */
package bankapp.account;

/**
 * @author andy.moser
 *
 */

public class Account {
	public Account(int nr, String pin, double balance) {
		super();
		this.nr = nr;
		this.pin = pin;
		this.balance = balance;
	}

	private int nr;
	private String pin;
	private double balance;

	public int getNr() {
		return this.nr;
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		this.balance = this.balance + amount;
		return true;
	}

	public boolean withdraw(double amount) {

		if (amount < 0) {
			return false;
		}

		this.balance = this.balance - amount;
		return true;
	}

	public boolean checkPIN(String pin) {
		return this.pin.equals(pin);
	}

}
