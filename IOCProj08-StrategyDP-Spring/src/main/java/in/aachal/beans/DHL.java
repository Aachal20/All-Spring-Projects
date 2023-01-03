package in.aachal.beans;

public class DHL implements Courier{

	public DHL() {
		System.out.println("DHL.DHL() :: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+  "DHL service used for delivery";
	}

	

}
