package corespring.springcore.onlyannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//now let us say we dont want to use this component also then we can remove this annotation
//and use @Bean in the config class to declare our Student class as a bean
// let us use one dependency known as Samosa

//@Component
public class Student {
//	@Value("24")
//	private int x;
	private Samosa samosa;
	
	public void study() {
		this.samosa.eat();
		System.out.println("Student is studying");
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	

//	@Override
//	public String toString() {
//		return "Student [x=" + x + "]";
//	}
	
	
}
