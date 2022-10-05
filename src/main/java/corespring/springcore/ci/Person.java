package corespring.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certificate c;
	
	public Person(String name,int personId,Certificate c) {
		this.name=name;
		this.personId=personId;
		this.c=c;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", c=" + c.cName + "]";
	}
	
}
