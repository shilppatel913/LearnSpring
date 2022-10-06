package corespring.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String args[]) {
			ApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/stereotype/stereotypeconfig.xml");
			Student s1=(Student) context.getBean("student");
			System.out.println(s1.hashCode());
			Student s2=(Student)context.getBean("student");
			System.out.println(s2.hashCode());
		}
}
