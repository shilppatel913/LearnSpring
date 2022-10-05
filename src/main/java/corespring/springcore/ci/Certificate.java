package corespring.springcore.ci;

public class Certificate {
	String cName;
	public Certificate(String cName) {
		this.cName=cName;
	}
	@Override
	public String toString() {
		return "Certificate [cName=" + cName + "]";
	}
	
}
