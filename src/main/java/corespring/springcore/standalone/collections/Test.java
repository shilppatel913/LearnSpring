package corespring.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/standalone/collections/standalonecollectionsconfig.xml");
		Person p1=(Person)context.getBean("person1");
		System.out.println(p1);
		System.out.println("------------------------------");
		Person p2=(Person)context.getBean("person2");
		System.out.println(p2);
	}

}
