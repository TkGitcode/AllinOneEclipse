package com.examportal;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	
	
	static Connection getConnection()
	{
		Connection connection=null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamconduction", "root", "1234");
		}catch(Exception e){
			System.out.println("Connection Failed");
		}
		return connection;
	}
	

}
