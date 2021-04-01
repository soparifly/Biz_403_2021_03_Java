package com.soparifly.apps;

public class Student {

	int StudentID;
	String studentname;
	int grade;
	String address;
	
	public String getstudentName() {
		return studentname;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentname = "안연수";
		
		System.out.println(studentAhn.studentname);
		System.out.println(studentAhn.getstudentName());
	}
}
