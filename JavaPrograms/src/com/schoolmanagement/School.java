package com.schoolmanagement;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		StudentAccess sta=new StudentAccess();
		while (choice != 9) {
			System.out.println("Enter Your Choice ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
                  //sta.AddStudent();
                  break;
			}
			case 2: {

			}
			}
		}
		sc.close();

	}

}
