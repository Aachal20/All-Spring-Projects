package in.aachal.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {

	
	private Date date;


	@Autowired
	public WishMessageGenerator(@Qualifier("dt1")  Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator.WishMessageGenerator()::0-parm constru");
		System.out.println("system date and time::"+date);
	}


	public String generateMessage(String msg) {
		System.out.println(date);
		int hour = date.getHours();
		if(hour<12)
			return "GM  "+msg;
		else if(hour<22)
			return "GA  " +msg;
		else if(hour<27)
			return "GE  "+msg;
		else
			return "GN  "+msg;

	}


}
