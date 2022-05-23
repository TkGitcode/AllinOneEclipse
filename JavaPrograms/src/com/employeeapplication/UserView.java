package com.employeeapplication;

import java.util.Scanner;

public class UserView {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserDetails userDetails = new UserDetails();
		try {
			int choice = 0;
			while (choice != 9) {
				System.out.println("Enter Your Choice ");
				System.out
						.println("1.Add Employee List \n" + "2.Display All Employee List \n" + "3.Search a Employee ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1: {
					userDetails.addEmloyee();
					break;
				}
				case 2: {
					userDetails.displayEmployee();
					break;
				}
				case 3: {
					userDetails.searchBy();
					break;
				}
				case 4:
					//userDetails.removeDuplicate();
					//break;
				}
			}
			scanner.close();

		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}

}
