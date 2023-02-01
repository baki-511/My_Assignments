package com.Java.Assignments;

/*Assignments 9
1. Write the Java program in which create the multiple objects and display 
the count of number of objects created into class.*/

public class Assignment09 {
	static int count=0;
	
	Assignment09(){
		count++;
	}
	
	//Main Method
	public static void main(String[] args) {
		Assignment09 obj1 = new Assignment09();
		Assignment09 obj2 = new Assignment09();
		Assignment09 obj3 = new Assignment09();
		
		System.out.println("Number of Objects is "+count);
	}
	
}


