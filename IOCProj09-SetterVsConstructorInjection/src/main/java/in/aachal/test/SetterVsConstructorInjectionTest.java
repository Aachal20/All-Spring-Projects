package in.aachal.test;

import javax.swing.DefaultListCellRenderer;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.aachal.beans.Customer;
import in.aachal.beans.Employee;
import in.aachal.beans.Student;



public class SetterVsConstructorInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/aachal/cfgs/applicationContext.xml");


		//get target class obj
		Employee emp = factory.getBean("emp" , Employee.class);
		System.out.println(emp);
		System.out.println("==========================");

		Customer cust = factory.getBean("cust" , Customer.class);
		System.out.println(cust);
		System.out.println("==========================");
		
		//get target class obj
		Student  stud = factory.getBean("stud" , Student.class);
		System.out.println(stud);
		System.out.println("==========================");


	}
}
