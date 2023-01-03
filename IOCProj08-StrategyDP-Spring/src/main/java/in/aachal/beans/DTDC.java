package in.aachal.beans;

public class DTDC implements Courier {

	public DTDC() {
	 System.out.println("DTDC :: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return oid+ "DTDC service used for delivery";
	}
}
