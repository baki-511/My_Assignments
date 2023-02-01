package com.Java.Assignment8;

import java.util.Scanner;

/*Assignments 8
1.1 Design the Employee class which contain
firstName, lastName, city and mobileNumber and  country.
1.2 Design the class as EmployeeInformation which takes the input for multiple 
    students from user and Design method public void getUserInput(), 
	country is same for all the students.
1.3 Pass the input to getStudentInformation() method
1.4 Print the multiple student information into getStudentInformation () method.
*/
public class EmployeeInformation {
	
	public void getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student First Name :- ");
		String firstName = sc.next();
		
		System.out.print("Enter Student Last Name :- ");
		String lastName = sc.next();
		
		System.out.print("Enter City Name :- ");
		String city = sc.next();
		
		System.out.print("Enter Mobile Number :- ");
		long mobileNumber = sc.nextLong();
		
		
		Employee em = new Employee();
		em.setFirstName(firstName);
		System.out.println(em.getFirstName());
		
		em.setLastName(lastName);
		System.out.println(em.getLastName());
		
		em.setCity(city);
		System.out.println(em.getCity());
		
		em.setMobileNumber(mobileNumber);
		System.out.println(em.getMobileNumber());
		
		System.out.println(em.country);
		
//		EmployeeInformation em = new EmployeeInformation();
//		em.printDat();
		
	}
//	public void printData() {
//		
//	}
//	public static void main(String[] args) {
//		Employee ep = new Employee();
//		EmployeeInformation epInf = new EmployeeInformation();
//		epInf.getUserInput();
//		ep.setFirstName(firstName);
//		System.out.println(ep.getFirstName());
	
		
//	}
//	public void printDat() {
//		Employee em3 = new Employee();
//		System.out.println(em3.getFirstName());
//	}
}
