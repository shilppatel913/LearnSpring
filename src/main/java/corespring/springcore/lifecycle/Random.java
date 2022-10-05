package corespring.springcore.lifecycle;

public class Random {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting price");
	}

	@Override
	public String toString() {
		return "Random [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Initialization is being performed");
	}
	
	public void destroy() {
		System.out.println("Resouces are being saved");
	}
	
}
