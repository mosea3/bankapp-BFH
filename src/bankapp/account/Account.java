package bankapp.account;

/**
 * Account Klasse hält grundlegende Kontoinformationen
 * 
 * @author andy.moser
 *
 */

public abstract class Account {

	private int nr;
	private String pin;
	protected Double balance;

	/**
	 * Konstruktor - eröffnet ein Konto
	 * 
	 * @param nr
	 *            - Kontonummer
	 * @param pin
	 *            - PIN
	 * @param balance
	 *            - initialer Kontostand
	 */
	public Account(int nr, String pin, double balance) {
		super();
		this.nr = nr;
		this.pin = pin;
		this.balance = balance;
	}

	/**
	 * Konstruktor für Kontoeröffnung, Kontostand 0.00
	 * 
	 * @param nr
	 * @param pin
	 */
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
	 *            - die verifizierende PIN
	 * @return boolean, ob verfiziert
	 */
	public boolean checkPIN(String pin) {
		return this.pin.equals(pin);
	}

}
