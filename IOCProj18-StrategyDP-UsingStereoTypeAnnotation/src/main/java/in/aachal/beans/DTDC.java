package in.aachal.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Primary
@PropertySource("in/aachal/commons/info.properties")
public class DTDC implements Courier {

	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;            //keys of properties file
	
	@Value("${os.name}")
	private String os;           //system properties key
	
	@Value("${Path}")
	private String path;        //path env..variable
	
	
	public DTDC() {
	 System.out.println("DTDC :: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return oid+ "DTDC service used for delivery";
	}
	
	@Override
	public String toString() {
		return "DTDC [name=" + name + ", age=" + age + ", os=" + os + ", path=" + path + "]";
	}
	
	
}
