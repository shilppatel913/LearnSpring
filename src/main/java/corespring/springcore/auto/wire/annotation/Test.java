package corespring.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/auto/wire/annotation/autoconfig.xml");
		Employee e1=context.getBean("emp1", Employee.class);
		System.out.println(e1);
	}

}
