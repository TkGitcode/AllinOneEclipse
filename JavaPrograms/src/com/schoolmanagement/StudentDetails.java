package com.schoolmanagement;

public class StudentDetails {

	public String studentName;
	public int studentId;
	public String studentSection;

	public StudentDetails(String studentName, int studentId, String studentSection) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentSection = studentSection;
	}

	public StudentDetails() {

	}

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

	public String getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentId=" + studentId + ", studentSection="
				+ studentSection + "]";
	}

}