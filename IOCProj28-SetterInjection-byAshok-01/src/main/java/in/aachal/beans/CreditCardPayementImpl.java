package in.aachal.beans;

public class CreditCardPayementImpl implements IPayement {

	public CreditCardPayementImpl() {
		System.out.println("CreditCardPayement() :: 0-param constru");
	}

	public boolean pay(double amount, int pin) {
		System.out.println("Paying bill Amount using CreditCard  :: " +amount );
		System.out.println("connecting to paypall ......");
		return true;
	}

}
