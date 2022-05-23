package com.School;

public class StudentDetails {

	public String studentName;
	public int studentId;
	public String studentGender;
	public String street;
	public String district;
	public int pinCode;

//	public StudentDetails(String studentName, int studentId, String studentGender) {
//		super();
//		this.studentName = studentName;
//		this.studentId = studentId;
//		this.studentGender = studentGender;
//	}

	public StudentDetails() {

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
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

	public String getstudentGender() {
		return studentGender;
	}

	public void setstudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentId=" + studentId + ", studentGender="
				+ studentGender + "]";
	}

}
