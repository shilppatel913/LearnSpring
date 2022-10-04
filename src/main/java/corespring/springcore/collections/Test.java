package corespring.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/collections/collectionsconfig.xml");
		Employee emp1=(Employee) context.getBean("emp1");
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProps());

	}

}
