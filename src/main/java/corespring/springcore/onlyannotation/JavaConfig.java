package corespring.springcore.onlyannotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//this is our configuration class we will be creating beans here with the help of annotations
//to tell that this is our configuration file we have to use @Configuration annotation

@Configuration
//@ComponentScan(basePackages = "corespring.springcore.onlyannotation")
public class JavaConfig {
	//we can also give alias names of the object in the params of the bean
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa=new Samosa();
		return samosa;
	}
	
	@Bean(name = {"student","temp1"})
	public Student getStudent() {
		Student student=new Student(getSamosa()); //Injecting dependecy of Samosa class inside the Student class using constructor injection
		return student;
	}
	

}
