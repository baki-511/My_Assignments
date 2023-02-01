package com.Assignment24;
/*
Assignments 24
1. Suppose I have Employee class that containing I'd, name and city now I want
to sort the data based on comparable interface by using name.
*/
import java.util.ArrayList;
import java.util.Collections;
public class ComparatorQue{
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10, "Aniket", "Latur"));
		emp.add(new Employee(60, "Mahesh", "Baramati"));
		emp.add(new Employee(30, "Nisha", "Chandhigad"));
		emp.add(new Employee(20, "Ganesh", "Devnagr"));
//		System.out.println(emp);
		System.out.println("\n**************************************************");
		System.out.println("\t\tBefore sorted");
		System.out.println("**************************************************");
		for(Employee e: emp) {
			System.out.println(e);
		}
//		Collections.sort(emp,new Employee);
		System.out.println("\n**************************************************");
		System.out.println("\tList is Sorted according to the name...");
		System.out.println("**************************************************");
		Collections.sort(emp, new NewComparator());
		for(Employee e : emp) {
			System.out.println(e);
		}
		
	}
}

	

