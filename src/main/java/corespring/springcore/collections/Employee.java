package corespring.springcore.collections;

import java.util.*;

public class Employee {
	private String empName;
	private Set<String> phones;
	private List<String> addresses;
	private Map<String,String> courses;
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(String empName, Set<String> phones, List<String> addresses, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phones=" + phones + ", addresses=" + addresses + ", courses="
				+ courses + "]";
	}
	

}
