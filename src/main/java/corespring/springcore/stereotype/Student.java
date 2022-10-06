package corespring.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Shilp")
	private String studentName;
	@Value("12")
	private int studentId;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	
}
