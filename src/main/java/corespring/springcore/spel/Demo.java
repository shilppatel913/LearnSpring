package corespring.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//we will set all the values using expression language

@Component
public class Demo {
	@Value("#{11+34+25}")
	private int x;
	@Value("#{45+67}")
	private int y;
	//we can use a static method that is returning a value in the form of an expression
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double z;
	//we can also use static variables like the value of PI and E
	@Value("#{ T(java.lang.Math).PI }")
	private double a;
	//we can also use an object in the form of an expression
	@Value("#{ new java.lang.String('Shilp Patel') }")
	private String name;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + "]";
	}
	
	
}
