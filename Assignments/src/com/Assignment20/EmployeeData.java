package com.Assignment20;

//3. Design the method for ArrayList<Employee> which returns the list of employee and print that data.

import java.util.ArrayList;
public class EmployeeData {
	
	//Creating getEmployee using ArrayList
	public ArrayList<Employee> getEmployee() {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(10,"Aniket","Latur"));
		al.add(new Employee(11,"Ganesh","Pune"));
		al.add(new Employee(12,"Krishna","Nanded"));
		al.add(new Employee(13,"Sanket","Nagar"));
		//Iterate using forEach
		for(Employee e: al) {
			System.out.println(e);
		}
		return al;
	}
	
	//Main method
	public static void main(String[] args) {
		EmployeeData ed = new EmployeeData();
		System.out.println(ed.getEmployee());
//		ed.forEachIterate();
		
	}
}
