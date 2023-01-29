package in.aachal.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import in.aachal.beans.PayementContext;



public class PayementContextTest {

	public static void main(String[] args) {

		try {
			
			//Locate and hold Spring bean cfgs file
			FileSystemResource res = new FileSystemResource("src/main/java/in/aachal/cfg/applicationContext.xml");
			
			//create IOC container
			BeanFactory factory=new XmlBeanFactory(res);
			//PayementContext ctx  = factory.getBean("payementCtx" , PayementContext.class);
			PayementContext ctx  = factory.getBean("payementCtx" , PayementContext.class);
			//close container
			ctx.payBill(1000.00, 19684);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
