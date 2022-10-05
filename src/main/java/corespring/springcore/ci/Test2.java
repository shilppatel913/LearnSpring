package corespring.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/ci/ciconfig.xml");
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);
		
		Addition add=(Addition)context.getBean("add1");
		add.doSum();
		
	}
}
