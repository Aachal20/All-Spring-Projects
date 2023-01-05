package in.aachal.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import in.aachal.beans.WishMessageGenerator;

public class SpringBeanScopesTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/aachal/cfgs/applicationContext.xml");
		
		//get raget class object
		WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator1 = factory.getBean("wmg",WishMessageGenerator.class);
		
		
		System.out.println("=============================");
		System.out.println("generator1==geneartor  ::"  +(generator==generator1));
		System.out.println("gen1 Hashhocdoe :: "+generator.hashCode()+ " gen2 Hashcode ::" +generator1.hashCode());
		//invoke the BM
		//String msg = generator.generateMessage("Aachal");
		//System.out.println("Wish MEssage is :: "+msg);
	}

}
