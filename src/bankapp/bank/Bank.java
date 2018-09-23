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
	 * gibt alle Konti zur�ck
	 * 
	 * @return
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * er�ffnet ein Konto
	 * 
	 * @param pin
	 *            - autorisierende neue PIN
	 * @param balance
	 *            - initialer Kontostand
	 * @return int - neue Kontonummer
	 */
	public int openAccount(String pin, Double balance) {
		int newAccountNumber = (this.accounts.size() + 1);

		Account acc = new Account(newAccountNumber, pin, balance);
		this.lastAccountNr = accounts.size();

		accounts.add(acc);

		return newAccountNumber;
	}

	/**
	 * gibt Kontostand eines angegebenen Kontos zur�ck
	 * 
	 * @param AccountNr
	 *            - int Kontonummer
	 * @param pin
	 *            - String autorisierende PIN
	 * @return Double, Kontostand
	 * @return null; maskierender Kontostand f�r nicht autorisiert
	 * @return null, nicht existierendes Konto
	 */
	public Double getBalance(int AccountNr, String pin) {
		Account ac = this.findAccount(AccountNr);

		if (ac == null) {
			return null; // TODO Aus Bankgeheimnisgr�nden alle
							// Unautorisiert und
							// nicht existent gleich ablehnen?
		}
		if (!ac.checkPIN(pin)) {
			return null; // TODO throw UnauthorizedException
		}
		return ac.getBalance();

	}

	/**
	 * deponiert Betrag auf angegebenes Konto
	 * 
	 * @param AccountNr
	 *            int Kontonummer
	 * @param amount,
	 *            double g�ltiger Betrag
	 * @return boolean - wenn erfolgreich
	 */
	public boolean deposit(int AccountNr, double amount) {
		if (amount <= 0) {
			return false; // TODO hier wird nochmals validiert
		}
		Account ac = this.findAccount(AccountNr);

		if (ac == null) {
			return false;
		}

		return ac.deposit(amount);
	}

	/**
	 * hebt Betrag von angegebem Konto ab
	 * 
	 * @param AccountNr
	 *            int, Kontonummer
	 * @param pin
	 * @param amount
	 * @return
	 */
	public boolean withdraw(int AccountNr, String pin, double amount) {
		Account ac = this.findAccount(AccountNr);

		if (ac == null) {
			return false;
		}
		if (!ac.checkPIN(pin)) {
			return false; // TODO throw UnauthorizedException
		} // TODO Autorisierungsprozess in eigene Methode auslagern?

		return ac.withdraw(amount);
	}

	/**
	 * saldiert ein angegebenes Konto
	 * 
	 * @param nr
	 *            - Kontonummber
	 * @param pin
	 *            - PIN
	 * @return boolean, ob saldiert und entfernt
	 */
	public boolean closeAccount(int nr, String pin) {
		Account ac = this.findAccount(nr);
		if (ac == null) {
			return false;
		}

		// PIN-Autorisierung
		if (!ac.checkPIN(pin)) {
			return false;
		}

		// Saldierung nur bei Kontostand 0, kein Guthaben oder Schuld vorhanden
		if (ac.getBalance() == 0.0) {
			return false;
		}

		this.accounts.remove(this.lastAccountNr);
		ac = null;

		return true;
	}

	public Account findAccount(int nr) {

		for (int i = 0; i < this.accounts.size(); i++) {
			if (this.accounts.get(i).getNr() == nr) {
				this.lastAccountNr = i;
				return this.accounts.get(i);
			}
		}
		return null; // TODO: throw noAccountFoundException
	}

}
