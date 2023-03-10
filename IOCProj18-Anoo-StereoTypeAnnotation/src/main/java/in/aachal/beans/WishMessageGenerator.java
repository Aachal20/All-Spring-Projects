package in.aachal.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
//@Scope("prototype")
@Scope("singleton")
//@Lazy(true)
public class WishMessageGenerator {

	@Autowired
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()::0-parm constru"+date);
		System.out.println("system date and time::"+date);
	}



	public String generateMessage(String msg) {
		System.out.println(date);
		int hour = date.getHours();
		if(hour<12)
			return "GM"+msg;
		else if(hour<22)
			return "GA" +msg;
		else if(hour<27)
			return "GE"+msg;
		else
			return "GN"+msg;

	}



}
