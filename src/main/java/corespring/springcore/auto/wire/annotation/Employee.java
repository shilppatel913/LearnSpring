package corespring.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Employee class is dependent on address class we can do autowiring here as we are using object of the address class.
public class Employee {
	//this autowired annotation can be used above an address, a setter method and a constructor
	//If in the configuration there are two beans with different names IOC will get confused which one to inject
	//so we can apply qualifier annotation and give the name of that particular bean insid the args
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
