package com.Assignment24_Q_02;

/*
Assignments 24
2. Suppose I have Student class containing I'd, name and salary now I want 
to sort the data based on comparator interface by using salary.
*/
import java.util.ArrayList;
import java.util.Collections;


public class StudentData {
	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();//Creating array list
		stu.add(new Student(10, "Aniket", 50000));
		stu.add(new Student(40, "Suresh", 70000));
		stu.add(new Student(20, "Suresh", 40000));
		stu.add(new Student(50, "Nisha", 20000));
		stu.add(new Student(30, "Pradeep", 30000));
		
		System.out.println("\n**************************************************");
		System.out.println("\t\tBefore sorted");
		System.out.println("**************************************************");
		//Iterate using forEach
		for(Student e: stu) {
			System.out.println("  "+e);
		}
		//Sorting Student fields
		Collections.sort(stu);
		System.out.println("\n**************************************************");
		System.out.println("\tList is Sorted according to the salary...");
		System.out.println("**************************************************");
		for(Student e :stu) {
			System.out.println("  "+e);
		}
	}
}
