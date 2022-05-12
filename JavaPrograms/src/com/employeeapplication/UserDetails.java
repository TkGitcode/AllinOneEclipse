package com.employeeapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserDetails {
	Scanner scanner = new Scanner(System.in);
	HashMap<Integer, EmployeeDetails> empMTSmap = new HashMap<Integer, EmployeeDetails>();
	HashMap<Integer, EmployeeDetails> empMLSmap = new HashMap<Integer, EmployeeDetails>();

	HashMap<Integer, HashMap<Integer, EmployeeDetails>> empObj = new HashMap<Integer, HashMap<Integer, EmployeeDetails>>();
    HashMap<Integer, EmployeeDetails> overAllEmp=new HashMap<Integer, EmployeeDetails>();
	public void addEmloyee() {
		empMTSmap.put(1, new EmployeeDetails("Kumar", 10001, 45, "MTS", 50000, "Male"));
		empMTSmap.put(2, new EmployeeDetails("Santhosh", 10002, 24, "MTS", 100000, "Male"));
		empMTSmap.put(3, new EmployeeDetails("Ramya", 10003, 27, "MTS", 110000, "Female"));
		empMTSmap.put(4, new EmployeeDetails("Srinivas", 10004, 23, "MTS", 60000, "Male"));
		empMTSmap.put(5, new EmployeeDetails("Monikaa", 10005, 35, "MTS", 70000, "Female"));
		empMTSmap.put(6, new EmployeeDetails("Kumar", 10006, 39, "MTS", 80000, "Male"));

		empMLSmap.put(1, new EmployeeDetails("Kumar", 10001, 45, "MLS", 50000, "Male"));
		empMLSmap.put(2, new EmployeeDetails("Santhosh", 10002, 24, "MLS", 100000, "Male"));
		empMLSmap.put(3, new EmployeeDetails("Ramya", 10003, 27, "MLS", 110000, "Female"));
		empMLSmap.put(4, new EmployeeDetails("Srinivas", 10004, 23, "MLS", 60000, "Male"));
		empMLSmap.put(5, new EmployeeDetails("Monikaa", 10005, 35, "MLS", 70000, "Female"));
		empMLSmap.put(6, new EmployeeDetails("Kumar", 10006, 39, "MLS", 80000, "Male"));

		empObj.put(1, empMLSmap);
		empObj.put(2, empMTSmap);
		
		System.out.println(empObj);

		System.out.println("Employeee Details Added Successfully");

	}

	public void displayEmployee() {
		if (empMTSmap.isEmpty())
			System.out.println("Sorry No Data Found");
		else {
			empMTSmap.forEach((k, v) -> System.out.println(k + " " + v));
		}
	}

	public void searchBy() {

		System.out.println("1.Search By Id \n" + "2.Search By Name \n" + "3.Search By Age \n" + "4.Total Employee \n"
				+ "5.Male and Female Count \n" + "6. Search Above Age");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: {

			SearchById();
			break;
		}
		case 2: {
			SearchByName();
			break;
		}
		case 3: {
			SearchByAge();
			break;
		}
		case 4: {
			countOfEmployee();
			break;
		}
		case 5: {
			countofMF();
			break;
		}
		case 6: {
			findAboveAge();
			break;
		}
		}

	}
	
	//FlatMap
	private void combineTwo()
	{
		//overAllEmp = 
		// empObj.entrySet().stream().flatMap(Fla);
	}

	private void findAboveAge() {
		System.out.println("Enter a Age :");
		int age = scanner.nextInt();
		empMTSmap.entrySet().stream().filter(e -> e.getValue().empAge >= age)
				.forEach(e -> System.out.println(e.getValue().empName + " " + e.getValue().empAge));

	}

	// Male and Female Count
	private void countofMF() {

		System.out.println("No of Male Employees : " + empMTSmap.entrySet().stream()
				.filter(e -> e.getValue().empGender.equals("Male")).map(Map.Entry::getValue).count());
		System.out.println("No of Female Employees : " + empMTSmap.entrySet().stream()
				.filter(e -> e.getValue().empGender.equals("Female")).map(Map.Entry::getValue).count());

	}

	// Total Count of Employee
	private void countOfEmployee() {
		System.out.println("Total Employee " + empMTSmap.entrySet().stream().count());

	}

	// SearchBy Age
	private void SearchByAge() {
		System.out.println("Enter a Employee Age");
		int search = scanner.nextInt();
		empMTSmap.entrySet().stream().filter(e -> e.getValue().empAge == search).map(Map.Entry::getValue).forEach(
				e -> System.out.println("Employee Name : " + e.empName + ",  " + "Employee Age : " + e.empAge));

	}

	// SearchBy Name
	private void SearchByName() {
		System.out.println("Enter a Employee Name");
		String search = scanner.next();
		empMTSmap.entrySet().stream().filter(e -> e.getValue().empName.equals(search)).map(Map.Entry::getValue)
				.forEach(e -> System.out.println("Employee Id : " + e.empId + ",  " + "Employee Name : " + e.empName));
		// Count of Employee of Searching Name
		System.out.println("Count of " + search + " is " + empMTSmap.entrySet().stream()
				.filter(e -> e.getValue().empName.equals(search)).map(Map.Entry::getValue).count());

	}

	// SearchBy Id
	private void SearchById() {
		System.out.println("Enter a Employee Id");
		int search = scanner.nextInt();
		System.out.println(empMTSmap.entrySet().stream().filter(e -> e.getValue().empId == search)
				.map(Map.Entry::getValue).findFirst());

	}
	// new EmployeeDetails(null, 0, 0, null, 0);

}
