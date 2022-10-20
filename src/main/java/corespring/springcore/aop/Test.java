package corespring.springcore.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import corespring.springcore.aop.LibraryService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/aop/aopconfig.xml");
		LibraryService lb=context.getBean("libraryServiceProxy",LibraryService.class);
		lb.issueBook(3, 3);
		lb.returnBook(2, 2);
		lb.addBook(1);

	}

}
