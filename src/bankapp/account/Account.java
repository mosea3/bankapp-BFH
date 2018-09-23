/**
 * 
 */
package bankapp.account;

/**
 * Account Klasse hält grundlegende Kontoinformationen
 * 
 * @author andy.moser
 *
 */

public class Account {

	private int nr;
	private String pin;
	private double balance;

	public Account(int nr, String pin, double balance) {
		super();
		this.nr = nr;
		this.pin = pin;
		this.balance = balance;
	}

	public Account(int nr, String pin) {
		this(nr, pin, 0.0);
	}

	/**
	 * Gibt die Kontonummer des Kontenobjekt zurück
	 * 
	 * @return int Kontonummer
	 */
	public int getNr() {
		return this.nr;
	}

	/**
	 * gibt den momentanen Kontostand zurück
	 * 
	 * @return double Kontostant
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * Deponiert angegebenen Betrag aufs Konto
	 * 
	 * @param amount
	 *            - Double, Betrag
	 * @return boolean - gibt Erfolgsmeldung zurück
	 * 
	 */
	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		this.balance = this.balance + amount;
		return true;
	}

	/**
	 * hebt angegebenen Betrag vom Konto ab
	 * 
	 * @param amount
	 *            double, abzuhebender Betrag
	 * @return boolean, ob erfolgreich
	 */
	public boolean withdraw(double amount) {

		if (amount < 0) {
			return false;
		}

		this.balance = this.balance - amount;
		return true;
	}

	/**
	 * überprüft PIN
	 * 
	 * @param pin
	 * @return boolean, ob verfiziert
	 */
	public boolean checkPIN(String pin) {
		return this.pin.equals(pin);
	}

}
