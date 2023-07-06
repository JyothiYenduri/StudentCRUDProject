
package Mian;
import java.io.IOException;
import java.util.*;

import com.Student.Manage.Student;
import com.Student.Manage.StudentDao;
public class Start {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to Student management application");

		while(true) {
			System.out.println("Press 1 to Create new Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Update Student data");
			System.out.println("Press 4 to Show all the Student details");
			System.out.println("Press 5 to Show all the Student details where name starts with j");
			System.out.println("Press 6 to show all the student details where marks between 50 to 70");
			System.out.println("Press 7 to show all the student details group by their marks");
			System.out.println("Press 8 to Exit app");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			if(ch==1) {
				
				System.out.println("Enter Student name");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter student phone number");
				String ph=sc.nextLine();
				System.out.println("Enter student city");
				String city=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter student marks");
				int marks=sc.nextInt();
				Student st=new Student(name,ph,city,marks);
				boolean found=StudentDao.insertStudentToDB(st);
				if(found) {
					System.out.println("Student added successfully");
				}else {
					System.out.println("Something went wrong try again");
				}
				System.out.println(st);
				
				
			}else if(ch==2) {
				
				System.out.println("Enter sid to delete a student");
				int sid=sc.nextInt();
				boolean f=StudentDao.deleteStudent(sid);
				if(f) {
					System.out.println("Student deleted successfully");
				}else {
					System.out.println("Something went wrong try again");
				}
			}else if(ch==3) {
				
				System.out.println("Enter sid to update student details");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new name to update");
				String s1=sc.nextLine();
				boolean f1=StudentDao.updateStudent(id,s1);
				if(f1) {
					System.out.println("Student updated successfully");
				}else {
					System.out.println("Something went wrong try again");
				}
				
			}else if(ch==4) {
				
				System.out.println("The detials of the student are: ");
				StudentDao.showAllStudents();
			}else if(ch==5){
				System.out.println("The detials of the student name starts with j are: ");
				StudentDao.studentsNameStartswithJ();
				
			}else if(ch==6){
				System.out.println("The detials of the students whose marks b/w 50 & 70: ");
				StudentDao.studentsBasedOnMarks();
			}else if(ch==7){
				System.out.println("The detials of the students group by their marks");
				StudentDao.studentsMarksOnOrder();
			}else if(ch==8){
				break;
			}else {
				
			}
			
		}
		//System.out.println("Thank you for using my application");
	}

}
