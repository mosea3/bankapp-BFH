/**
 * 
 */
package bankapp;

import bankapp.atm.ATM;
import bankapp.bank.Bank;

/**
 * @author andy.moser
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank b = new Bank();
		ATM atm = new ATM();
		atm.setBank(b);

		atm.run();

	}

}
