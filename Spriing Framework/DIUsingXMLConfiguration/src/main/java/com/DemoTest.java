package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.display();
		Resource res = new ClassPathResource("beans.xml");  // load the file get the resource reference
		BeanFactory obj = new XmlBeanFactory(res);	// get the BeanFactory reference. 
		
		Employee emp1 = (Employee)obj.getBean("emp1");
		emp1.display();
		
		Employee emp3 = (Employee)obj.getBean("emp1");
		emp3.display();
		
		Employee emp2 = (Employee)obj.getBean("emp2");
		emp2.display();
		
		Employee emp4 = (Employee)obj.getBean("emp2");
		emp4.display();
		
	}

}
