package com.School;

import java.io.IOException;
import java.util.Scanner;

import org.apache.tomcat.util.json.ParseException;

public class UserView {

	public static void main(String[] args) throws IOException, ParseException {

		Scanner scanner = new Scanner(System.in);
		StudentAccess studentAccess = new StudentAccess();
		int choice = 0;
		while (choice <= 9) {
			System.out.println("Enter Your Option \n 1.Add Student Details \n 2.View StudentDetails ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				studentAccess.addStudentDetails();
				break;
			}
			case 2: {
				studentAccess.viewStudentDetails();
				break;

			}
			}
		}
		scanner.close();
	}

}
