package exceptionhandlingpackage;
//cutom exception 

class InsufficientFundException extends Exception {
	InsufficientFundException(String S) {
		super(S);
	}
}

public class EH2 {

	public static void withdraw(int amount) throws InsufficientFundException {
		int account_balance = 6000;
		account_balance = account_balance - amount;
		if (account_balance < amount) {

			throw new InsufficientFundException("Not enough money in the account :Sorry, Insufficient funds");

		} else {
			System.out.println("check the money credited and wish you a great day");
		}

	}

	public static void main(String args[]) {
		try {
			withdraw(6000);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
