package bankapp.account;

public class SavingsAccount extends Account {

	static final int WITHDRAW_LIMIT = 10000;

	public SavingsAccount(int nr, String pin) {
		super(nr, pin);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int nr, String pin, double balance) {
		super(nr, pin, balance);
		// TODO Auto-generated constructor stub
	}

	/**
	 * hebt angegebenen Betrag vom Konto ab
	 * 
	 * @param amount
	 *            double, abzuhebender Betrag
	 * @return boolean, ob erfolgreich
	 */
	public boolean withdraw(Double amount) {
		if (amount < 0) {
			return false;
		}

		if (amount > this.WITHDRAW_LIMIT) {
			return false;
		}

		if (amount > this.balance) {
			return false;
		}

		this.balance = this.balance - amount;
		return true;
	}
}
