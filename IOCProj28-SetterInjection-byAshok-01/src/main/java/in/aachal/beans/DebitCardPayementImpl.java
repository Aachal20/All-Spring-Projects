package in.aachal.beans;

public class DebitCardPayementImpl implements IPayement {

	public DebitCardPayementImpl() {
		System.out.println("debitCardPayementImpl.pay():: 0-param constructor");
	}
	public boolean pay(double amount, int pin) {
		System.out.println("Paying bill Amount using Debit Card  :: " +amount );
		System.out.println("connecting to paypall ......");
		return true;
	}
}
