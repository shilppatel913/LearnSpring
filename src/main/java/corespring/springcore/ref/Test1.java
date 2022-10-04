package corespring.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/ref/refconfig.xml");
		B b=(B)context.getBean("bref");
		A a=(A) context.getBean("aref");
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
	}

}
