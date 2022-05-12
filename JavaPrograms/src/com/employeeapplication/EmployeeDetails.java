package com.employeeapplication;

public class EmployeeDetails {

	String empName;
	int empId;
	int empAge;
	String empDesgnation;
	float empSalary;
	String empGender;

	public EmployeeDetails(String empName, int empId, int empAge, String empDesgnation, float empSalary,
			String empGender) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgnation = empDesgnation;
		this.empSalary = empSalary;
		this.empGender = empGender;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "EmployeeDetails : [empName= " + empName + ", empId= " + empId + ", empAge= " + empAge
				+ ", empDesgnation= " + empDesgnation + ", empSalary= " + empSalary + ",empGender = " + empGender
				+ " ]";
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesgnation() {
		return empDesgnation;
	}

	public void setEmpDesgnation(String empDesgnation) {
		this.empDesgnation = empDesgnation;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpGender() {
		return empGender;
	}

}
