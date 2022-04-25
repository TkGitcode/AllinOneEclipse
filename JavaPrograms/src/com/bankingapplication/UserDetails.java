package com.bankingapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class UserDetails implements Encryption {
	static String passWord;
	int wrongCount = 0;
	Scanner scanner = new Scanner(System.in);
	Connection connection;

	// Encrypt PassWord
	@Override
	public String Encrtpt(String pass) {
		String encryptString = "";
		char chatPass[] = pass.toCharArray();
		for (int i = 0; i < pass.length(); i++) {
			if (chatPass[i] >= 'a' && chatPass[i] <= 'z') {
				int nextChar = chatPass[i] + 1;
				encryptString += (char) nextChar + "";
			}
			if (chatPass[i] >= 'A' && chatPass[i] <= 'Z') {
				int nextChar = chatPass[i] + 1;
				encryptString += (char) nextChar + "";
			}
			if (chatPass[i] >= '0' && chatPass[i] <= '9') {
				int nextNo = Integer.parseInt(chatPass[i] + "");
				encryptString += (nextNo + 1);
			}
		}
		return encryptString;
	}

	// Password Validation
	public boolean ValidatePass() {
		System.out.println("Enter a Password");
		passWord = scanner.next();
		System.out.println("Re-Enter Your Password");
		String RepassWord = scanner.next();
		if (passWord.length() != RepassWord.length() || passWord.length() <= 8)
			return false;
		else if (passWord.equals(RepassWord)) {
			return true;
		}
		return false;
	}

	// New Customer
	public void addCustomer() throws SQLException {
		System.out.println("Enter Account Holder Name");
		String CustomerName = scanner.next();
		// System.out.println("Enter Balance");
		float OpeningBalance = 500;
		boolean check = false;
		int count = 0;
		try {

			while (!check) {
				check = ValidatePass();
				if (check == true)
					count = 0;
				else
					count++;
				if (count > 0)
					System.out.println("Please Re Enter Your PassWord");
			}
			connection = DataBaseConnection.getConnection();
			PreparedStatement signinpreparedStatement = connection
					.prepareStatement("insert into customermaster_tbl(Password,Balance,AccountHolderName) values(?,?,?)");

			signinpreparedStatement.setString(1, Encrtpt(passWord));
			signinpreparedStatement.setString(2, Float.toString(OpeningBalance));
			signinpreparedStatement.setString(3, CustomerName);

			int succuss = signinpreparedStatement.executeUpdate();
			if (succuss > 0) {
				System.out.println("Succes");
			} else
				System.out.println("Fail");
		} catch (SQLIntegrityConstraintViolationException e) {
			System.err.println(e + "");
		}

	}

	// View a Customer
	public void viewCustomer() throws SQLException {
		System.out.print("Enter a Account Number : ");
		long CustNo = scanner.nextLong();
		System.out.println("Enter a PassWord : ");
		String pass = scanner.next();
		boolean check = false;

		while (!check) {
			if (CheckUser(CustNo, pass)) {
				check = true;
				connection = DataBaseConnection.getConnection();
				PreparedStatement ViewCustomer = connection
						.prepareStatement("select * from customermaster_tbl where AccountNo=?");
				ViewCustomer.setString(1, Long.toString(CustNo));
				ResultSet rsResultset = ViewCustomer.executeQuery();
				while (rsResultset.next()) {
					System.out.println("Account No : " + rsResultset.getString(1) + " " + "Name :"
							+ rsResultset.getString(4) + " " + "Balance : " + rsResultset.getString(2));
				}
				System.out.println();
			} else {
				System.out.println("You Entered Wrong passWord or Account Number Please Check");
				System.out.println("If you want to Continue press 1 else 0");
				int choice = scanner.nextInt();
				if (choice > 0)
					viewCustomer();
			}
		}

	}

	// UserLogin
	public void UserLogin() throws SQLException {
		System.out.println("Enter a Account No : ");
		long ActNo = scanner.nextLong();
		System.out.println("Enter a PassWord : ");
		String pass = scanner.next();
		boolean check = false;
		while (!check) {
			if (CheckUser(ActNo, pass)) {
				check = true;

			} else {
				System.out.println("You Entered Wrong passWord or Account Number Please Check");
				System.out.println("If you want to Continue press 1 else 0");
				int choice = scanner.nextInt();
				if (choice > 0) {
					wrongCount++;
					if (wrongCount < 3)
						UserLogin();
				}
			}
			if (wrongCount >= 3) {
				System.out.println("Please Reset Your PassWord");
				resetPass();
				break;
			}
		}

	}

	// Checks Account No and PassWord
	public boolean CheckUser(long ActNo, String pass) throws SQLException {
		connection = DataBaseConnection.getConnection();
		PreparedStatement LoginStatement = connection
				.prepareStatement("select * from customermaster_tbl where AccountNo=? and Password=?");
		LoginStatement.setString(1, Long.toString(ActNo));
		LoginStatement.setString(2, Encrtpt(pass));
		ResultSet rsResultset = LoginStatement.executeQuery();
		if (rsResultset.next()) {
			return true;
		} else {
			return false;
		}
	}

	// PassWordReset
	public void resetPass() throws SQLException {
		System.out.println("Enter a AccountNo to Reset a PassWord");
		int rstPassActNo = scanner.nextInt();
		connection = DataBaseConnection.getConnection();
		PreparedStatement RestPassStatement = connection
				.prepareStatement("select * from customermaster_tbl where AccountNo=?");
		RestPassStatement.setString(1, Long.toString(rstPassActNo));
		ResultSet rsResultset = RestPassStatement.executeQuery();
		if (rsResultset.next()) {
			int count = 0;
			boolean check = false;
			while (!check) {
				check = ValidatePass();
				if (check == true)
					count = 0;
				else
					count++;
				if (count > 0)
					System.out.println("Please Re Enter Your PassWord");
			}

			connection = DataBaseConnection.getConnection();
			PreparedStatement updatePass = connection
					.prepareStatement("update customermaster_tbl set Password=? where AccountNo=?");
			updatePass.setString(1, Encrtpt(passWord));
			updatePass.setString(2, Integer.toString(rstPassActNo));
			updatePass.executeUpdate();
		} else {
			System.out.println("You Entered Wrong  Account Number Please Check");
			System.out.println("If you want to Continue press 1 else 0");
			int choice = scanner.nextInt();
			if (choice > 0)
				resetPass();
		}
	}
	

}
