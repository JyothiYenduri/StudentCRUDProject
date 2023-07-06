package com.Student.Manage;

import java.sql.*;

public class Cp {
	static Connection con;
	public static Connection createConnection() {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","root");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
