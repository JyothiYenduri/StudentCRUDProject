package com.Student.Manage;

public class Student {
private int sid;
private String sname;
private String ph;
private String city;
private int marks;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getPh() {
	return ph;
}
public void setPh(String ph) {
	this.ph = ph;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Student(int sid, String sname, String ph, String city, int marks) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.ph = ph;
	this.city = city;
	this.marks=marks;
}
public Student(String sname, String ph, String city, int marks) {
	super();
	this.sname = sname;
	this.ph = ph;
	this.city = city;
	this.marks=marks;
}
public Student() {
	super();
	
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", ph=" + ph + ", city=" + city +", marks=" + marks + "]";
}


}
