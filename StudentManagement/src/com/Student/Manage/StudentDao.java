package com.Student.Manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	
	public static boolean insertStudentToDB(Student st) {
		
		boolean f=false;
		try {
			
			Connection con=Cp.createConnection();
			String qry="insert into students(sname,ph,city,marks)values(?,?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(qry);
			
			pstmt.setString(1, st.getSname());
			pstmt.setString(2,st.getPh());
			pstmt.setString(3,st.getCity());
			pstmt.setInt(4,st.getMarks());
			
			pstmt.executeUpdate();
			f=true;
			}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int sid) {
		
		boolean f=false;
		try {
			
			Connection con=Cp.createConnection();
			String qry="delete from students where sid=?";
			
			PreparedStatement pstmt=con.prepareStatement(qry);
			
			pstmt.setInt(1, sid);
			
			
			pstmt.executeUpdate();
			f=true;
			}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudents() {
		
		
		try {
			
			Connection con=Cp.createConnection();
			String qry="select * from students ";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String ph=rs.getString(3);
				String city=rs.getString(4);
				int marks=rs.getInt(5);
				System.out.println("StudentID: "+id);
				System.out.println("StudentName: "+name);
				System.out.println("StudentPNo: "+ph);
				System.out.println("StudentCity: "+city);
				System.out.println("StudentMarks: "+marks);
				System.out.println("*******************************");
			}
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static boolean updateStudent(int id,String newName) {
		
		boolean f=false;
		try {
			
			Connection con=Cp.createConnection();
			String qry="update students set sname=? where sid=?";
			
			PreparedStatement pstmt=con.prepareStatement(qry);
			
			pstmt.setString(1, newName);
			pstmt.setInt(2, id);
			
			
			pstmt.executeUpdate();
			f=true;
			}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void studentsNameStartswithJ() {
try {
			
			Connection con=Cp.createConnection();
			String qry="select * from students where sname like 'j%' ";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String ph=rs.getString(3);
				String city=rs.getString(4);
				int marks=rs.getInt(5);
				System.out.println("StudentID: "+id);
				System.out.println("StudentName: "+name);
				System.out.println("StudentPNo: "+ph);
				System.out.println("StudentCity: "+city);
				System.out.println("StudentMarks: "+marks);
				System.out.println("*******************************");
			}
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void studentsBasedOnMarks() {
		try {
			
			Connection con=Cp.createConnection();
			String qry="select * from students where marks between 50 and 70 ";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String ph=rs.getString(3);
				String city=rs.getString(4);
				int marks=rs.getInt(5);
				System.out.println("StudentID: "+id);
				System.out.println("StudentName: "+name);
				System.out.println("StudentPNo: "+ph);
				System.out.println("StudentCity: "+city);
				System.out.println("StudentMarks: "+marks);
				System.out.println("*******************************");
			}
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void studentsMarksOnOrder() {
		
try {
			
			Connection con=Cp.createConnection();
			String qry=" select marks,count(*) as count from students group by marks ";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()) {
				//int id=rs.getInt(1);
				//String name=rs.getString(2);
				//String ph=rs.getString(3);
				//String city=rs.getString(4);
				int marks=rs.getInt(1);
				int count=rs.getInt(2);
				//System.out.println("StudentID: "+id);
				//System.out.println("StudentName: "+name);
				//System.out.println("StudentPNo: "+ph);
				//System.out.println("StudentCity: "+city);
				System.out.println("StudentMarks: "+marks);
				System.out.println("Studentcount: "+count);
				System.out.println("*******************************");
			}
			}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
