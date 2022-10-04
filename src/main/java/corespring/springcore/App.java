package corespring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //you will have to create an instance of the IOC container first
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student=(Student) context.getBean("Student1");
        System.out.println(student);
        
    }
}
