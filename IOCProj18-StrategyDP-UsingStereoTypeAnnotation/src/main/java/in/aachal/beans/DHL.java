package in.aachal.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier{

	@Value("${os.name}")
	private String os;
	public DHL() {
		System.out.println("DHL.DHL() :: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return  "DHL service used for delivery";
	}
	@Override
	public String toString() {
		return "DHL [os=" + os + "]";
	}

	

}
