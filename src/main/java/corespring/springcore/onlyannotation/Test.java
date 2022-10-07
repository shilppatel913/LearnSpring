package corespring.springcore.onlyannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student s1=(Student) context.getBean("student");
//		Student s1=(Student) context.getBean("getStudent");
		Student s1=(Student) context.getBean("temp1");
		s1.study();
	}

}
