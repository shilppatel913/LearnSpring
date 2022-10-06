package corespring.springcore.standalone.collections;
import java.util.*;
public class Person {
	private List<String> friends;
	private Map<String,Integer> courses;
	private Properties properties;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courses=" + courses + ", properties=" + properties + "]";
	}
	
}
