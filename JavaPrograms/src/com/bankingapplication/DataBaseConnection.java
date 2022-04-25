package com.bankingapplication;

import java.sql.*;
import java.sql.DriverManager;

public class DataBaseConnection {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingapp", "root",
					"1234");
		} catch (Exception e) {
			System.out.println("Connection Failed");
		}
		return connection;
	}

}
