package com.Java.Assignments;

/*Assignments 8
1.1 Design the Employee class which contain
firstName, lastName, city and mobileNumber and  country.
1.2 Design the class as EmployeeInformation which takes the input for multiple 
    students from user and Design method public void getUserInput(), 
	country is same for all the students.
1.3 Pass the input to getStudentInformation() method
1.4 Print the multiple student information into getStudentInformation () method.
*/

//package com.Java.Assignment8;

/*Assignments 8
1.1 Design the Employee class which contain
firstName, lastName, city and mobileNumber and  country.
1.2 Design the class as EmployeeInformation which takes the input for multiple students from user and Design method public void getUserInput(), 
country is same for all the students.
1.3 Pass the input to getStudentInformation() method
1.4 Print the multiple student information into getStudentInformation () method.*/

import java.util.Scanner;

class Employee2 {
	String firstName, lastName, city, country;
	long moblileNumber;
	//created constructor
	public Employee2(String firstN, String lastN, String cityName, long mobileN, String countryN) {
		firstName = firstN;
		lastName = lastN;
		city = cityName;
		moblileNumber = mobileN;
		country = countryN;
		
	}
	//print value
	public void display() {
		System.out.println("First Name :- "+firstName+"\nLast Name :- "+lastName+"\nCity Name :- "+city+"\nCountry Name :- "+country);
	}
}

public class Assignment8 {
	String country;
	Assignment8(String countryN){
		country = countryN;
	}
	 public void getUserInput() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Your First Name :- ");
		 String firstName = sc.next();
		 
		 System.out.print("\nEnter Your Last Name \":- ");
		 String lastName = sc.next();
		 
		 System.out.print("\nEnter Your City Name :- ");
		 String cityName = sc.next();
		 
		 System.out.println("\nEnter Your Mobile Number :- ");
		 long mobileNumber = sc.nextLong();
		 
		/* System.out.println("Enter Your Country Name :- ");
		 String country = sc.next();*/
		 //class Employee
		// Employee(firstName, lastName, cityName, mobileNumber, country);
		 
		 //Calling getStudentInformation() method
		 getStudentInformation(firstName, lastName, cityName, mobileNumber, country);
		 
	 }
	 
	 public void getStudentInformation(String firstName, String lastName, String cityName, long mobileNumber, String country) {
		 System.out.println("\n\nEmployee Information .......\n");
		 System.out.println("First Name :- "+firstName+"\nLast Name :- "+lastName+"\nCity Name :- "+cityName+"\nMobile Number :- "+mobileNumber+"\nCountry Name :- "+country);
	 }
	 
	 public static void main(String[] args) {
		 System.out.println("First Employee");
		 Assignment8 empInfo = new Assignment8("India");
		 empInfo.getUserInput();
		 
		 System.out.println("\nSecond Employee");
		 Assignment8 empInfo2 = new Assignment8("India");
		 empInfo2.getUserInput();
		 
		 Employee2 emp = new Employee2("Aniket","Kore","Latur",932473974l,"India");
		 emp.display();
		 
//		 EmployeeInformation empInfo3 = new EmployeeInformation("India");
//		 empInfo.getUserInput();
	}
}
