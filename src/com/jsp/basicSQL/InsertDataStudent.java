package com.jsp.basicSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataStudent {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "INSERT INTO student VALUES(7,'Swa','swa@mail.com')";
		
		Connection connection = null;
		try {
			//step 1 : Load/Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Establish connection
			connection = DriverManager.getConnection(url, username, password);
			
			//step 3 : Establish Statement
			Statement statement = connection.createStatement();
			
			//step 4 : Execute the statement
			statement.execute(sql); 
			
			//step 5 : close
			
			Throwable tht = new ArithmeticException();
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("ALL GOOD");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
