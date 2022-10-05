package corespring.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	//to enable post construct and pre destroy we need use one tag in xml conf file
	
	//post construct is used for init method
	@PostConstruct
	public void start() {
		System.out.println("Init inside example class");
	}
	//predestroy is used for the destroy method
	
	@PreDestroy
	public void end() {
		System.out.println("Destroy inside example class");
	}
}
