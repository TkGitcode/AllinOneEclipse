package com.employeeapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserDetails {
	Scanner scanner = new Scanner(System.in);
	HashMap<Integer, EmployeeDetails> empMTSmap = new HashMap<Integer, EmployeeDetails>();
	HashMap<Integer, EmployeeDetails> empMLSmap = new HashMap<Integer, EmployeeDetails>();

	List<HashMap<Integer, EmployeeDetails>> empObj = new ArrayList<HashMap<Integer, EmployeeDetails>>();

	public void addEmloyee() {
		empMTSmap.put(1, new EmployeeDetails("Kumar", 10001, 45, "MTS", 50000, "Male"));
		empMTSmap.put(2, new EmployeeDetails("Santhosh", 10002, 24, "MTS", 100000, "Male"));
		empMTSmap.put(3, new EmployeeDetails("Ramya", 10003, 27, "MTS", 110000, "Female"));
		empMTSmap.put(4, new EmployeeDetails("Srinivas", 10004, 23, "MTS", 60000, "Male"));
		empMTSmap.put(5, new EmployeeDetails("Monikaa", 10005, 35, "MTS", 70000, "Female"));
		empMTSmap.put(6, new EmployeeDetails("Sangeetha", 10006, 39, "MTS", 80000, "Female"));
		empMLSmap.put(1, new EmployeeDetails("Kumaran", 10007, 45, "MLS", 50000, "Male"));
		empMLSmap.put(2, new EmployeeDetails("Selva", 10008, 24, "MLS", 100000, "Male"));
		empMLSmap.put(3, new EmployeeDetails("Siva", 10009, 27, "MLS", 110000, "Male"));
		empMLSmap.put(4, new EmployeeDetails("Arjun", 100010, 23, "MLS", 60000, "Male"));
		empMLSmap.put(5, new EmployeeDetails("Kani", 100011, 35, "MLS", 70000, "Female"));
		empMLSmap.put(6, new EmployeeDetails("Chithra", 100012, 39, "MLS", 80000, "Female"));
		empObj.add(empMLSmap);
		empObj.add(empMTSmap);
		System.out.println("Employeee Details Added Successfully");
	}

	public void displayEmployee() {
		if (empObj.isEmpty())
			System.out.println("Sorry No Data Found");
		else {
			System.out.println("Total Employee : "
					+ empObj.stream().flatMap(x -> x.entrySet().stream().map(e -> e.getValue().empName)).count());
			empObj.stream().flatMap(x -> x.entrySet().stream().map(e -> e.getValue().empName))
					.forEach(e -> System.out.println(e));
		}
	}

	public void searchBy() {

		System.out.println("1.Search By Id \n" + "2.Search By Name \n" + "3.Search By Age \n" + "4.Total Employee \n"
				+ "5.Male and Female Count \n" + "6. Search Above Age \n" + "7.Search By Designation \n"
				+ "8.Limited Employee of Above 35 age ");
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
		case 7: {
			SearchByDesignation();
			break;
		}
		case 8: {
			viewLimitedEmployee();
			break;
		}
		case 9: {
			juniorAndSenior();
			break;
		}
		}

	}

	public void juniorAndSenior() {
	
	}

	// limit
	// Above 35 Year
	public void viewLimitedEmployee() {

		empObj.stream().flatMap(x -> x.entrySet().stream()).filter(x -> x.getValue().empAge >= 35).limit(4)
				.forEach(x -> System.out.println(x.getValue().empName + " " + x.getValue().empAge));
	}

	// distinct
	public void removeDuplicate() {
		empObj.stream().flatMap(x -> x.entrySet().stream().distinct());
	}

	// FlatMap
	// Find By Designation
	private void SearchByDesignation() {
		System.out.println("Enter a Designation To search");
		String des = scanner.next();
		empObj.stream().flatMap(x -> x.entrySet().stream().filter(e -> e.getValue().empDesgnation.equals(des)))
				.forEach(e -> System.out.println("Emplloyee Name : " + e.getValue().empName + " "
						+ "Employee Designation : " + e.getValue().empDesgnation));
	}

	// Find By Age
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
		empMTSmap.entrySet().stream().filter(e -> e.getValue().empAge == search).map(e -> e.getValue().empName)
				.forEach(e -> System.out.println("Employee Name : " + e));

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
