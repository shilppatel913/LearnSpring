package corespring.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//initializing bean interface for init method
//disposable bean interface for destroy method 

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	//This is init method present in the interface Initializing Bean
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init method is being called using interface");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying pepsi class");
		
	}
	
}
