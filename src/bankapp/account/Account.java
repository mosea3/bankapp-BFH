/**
 * 
 */
package bankapp.account;

/**
 * Account Klasse
 * h�lt grundlegende Kontoinformationen
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

	/**
	 * Gibt die Kontonummer des Kontenobjekt zur�ck
	 * @return int Kontonummer
	 */
	public int getNr() {
		return this.nr;
	}
	
	/**
	 * gibt den momentanen Kontostand zur�ck
	 * @return double Kontostant
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * Deponiert angegebenen Betrag aufs Konto
	 * @param amount - Double, Betrag
	 * @return boolean - gibt Erfolgsmeldung zur�ck
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
	 * @param amount double, abzuhebender Betrag
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
	 * �berpr�ft PIN
	 * @param pin
	 * @return boolean, ob verfiziert
	 */
	public boolean checkPIN(String pin) {
		return this.pin.equals(pin);
	}

}
