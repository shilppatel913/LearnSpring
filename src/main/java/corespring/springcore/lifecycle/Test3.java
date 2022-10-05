package corespring.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractApplicationContext to call the destroy method using register shutdown
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("corespring/springcore/lifecycle/lifecycleconfig.xml");
		Random r1=(Random)context.getBean("random1");
//		context.registerShutdownHook();
		System.out.println(r1);
		context.registerShutdownHook();
		
		Pepsi p1=(Pepsi)context.getBean("pepsi1");
		System.out.println(p1);
	}

}
