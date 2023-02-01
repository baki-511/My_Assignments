package com.Assignment2;

import java.util.Scanner;

public class EmployeeInformation {
	public void getUserInput() {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First name :- ");
		emp.setFirstName(sc.next());
		
		System.out.print("Enter Last Name :- ");
		emp.setLastName(sc.next());
		
		System.out.print("Enter city Name :- ");
		emp.setCity(sc.next());
		
		System.out.print("Enter Mobile Number :- ");
		emp.setMobileNumber(sc.nextLong());
		
		getStudentInformation(emp.getFirstName(), emp.getLastName(), emp.getCity(), emp.getMobileNumber(), Employee.country);
		
		
	}
	
	public void getStudentInformation(String fName, String lName, String cityN, long mobileNo, String countryN) {
		System.out.println("\n------------------Student Information --------------");
		System.out.println("First Name :- "+fName);
		System.out.println("Last Name :- "+lName);
		System.out.println("City Name :- "+cityN);;
		System.out.println("Mobile Number :- "+mobileNo);
		System.out.println("Country Name :- "+countryN);
	}
}
