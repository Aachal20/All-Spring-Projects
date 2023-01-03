package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVo;

public class RealtimeDITest {

	public static void main(String[] args) {
		//Create IOC Container
				DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
				XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

				//Get Controller class object
				MainController controller = factory.getBean("controller", MainController.class);

				//Read inputs as String value and store them into EmployeeVO class object
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Employee Name: ");
				String name = sc.next();
				System.out.println("Enter Employee Desg: ");
				String desg = sc.nextLine();
				System.out.println(desg);
				sc.nextLine();
				System.out.println("Enter Basic Salary: ");
				String basicSalary = sc.next();

				EmployeeVo vo = new EmployeeVo();
				vo.setEname(name);
				vo.setDesg(desg);
				vo.setBasicSalary(basicSalary);

				//Invoke the Business Method
				try {
					String msg = controller.processEmployee(vo);
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Problem in Employee Registration");
				}
			}//main
		}//class