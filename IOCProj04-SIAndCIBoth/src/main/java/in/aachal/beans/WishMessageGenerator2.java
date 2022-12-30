package in.aachal.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator2 {

	private Date date;

	public WishMessageGenerator2(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator()::0-parm constru");
		this.date = date;
		System.out.println("system date and time::"+date);
		
	}
	
	public void setDate(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator.setDate()");
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
