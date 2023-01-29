package in.aachal.beans;

public class ZetaCardPayementImpl implements IPayement {

	public ZetaCardPayementImpl() {
		System.out.println("ZetaCreditCardPayement() :: 0-param constru");
	}

	public boolean pay(double amount, int pin) {
		System.out.println("Paying bill Amount using Zeta Card :: " +amount );
		System.out.println("connecting to paypall ......");
		return true;
	}

}
