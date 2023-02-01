package com.Java.Assignments;

/*
 * Assignments 3
 * 1. Design the separate method as String getStudentName (String name) 
 * which return student name and print it.
 */
public class Assignment03 {
	//Create non-static method with getStudentName()
	public String getStudentName(String name) {
		return name;
	}
	public static void main(String[] args) {
		//creating an object 
		Assignment03 obj = new Assignment03();
		System.out.println(obj.getStudentName("Java"));
	}
}
