package com.jsp.basicSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataEmployee {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String query = "INSERT INTO employee values(3,'Swastik','swastik@mail.com')";
		
		
		Connection connection = null;
		try {
			
			//step 1 : load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step 2 : Establish Connection
			connection = DriverManager.getConnection(url, username, password);
			
			//Step 3 : Establish statement
			Statement statement = connection.createStatement();
			
			//step 4 : Execute
			System.out.println(statement.execute(query));
			
			//step 5 : close connection
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
