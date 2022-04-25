package com.bankingapplication;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerLogin {

	public static void main(String[] args) throws SQLException {

		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		UserDetails uDetails = new UserDetails();
		int userchoice = 0;
		do {
			System.out.println("1.CreateAccount");
			System.out.println("2.View a AccountDetails");
			System.out.println("3.Login");
			System.out.println("9.To Exit");
			userchoice = scanner.nextInt();

			switch (userchoice) {
			case 1: {
				uDetails.addCustomer();
				break;
			}
			case 2: {
				uDetails.viewCustomer();
				break;
			}
			case 3:
				uDetails.UserLogin();
				break;
			case 4:
				uDetails.resetPass();
				break;

			}

		} while (userchoice != 9);
		scanner.close();
	}

}
