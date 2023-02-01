package com.Java.Assignments;

/*Assignments 2
1. Write the Java Program in which declare the different primitives data types.
2. Write the Java program to print first character of your name on console. 
3. Write the Java Program to declare the local variable as x.
4. Write the Java Program to assign local variable value as 50.
5. Write the Java Program to declare the global variables as y.
6. Write the Java Program to Print the global variable value as 25.
*/

public class Assignment02 {
	int y=25;
	public static void main(String[] args) {
		//1.Declaration of different primitive data types
		byte byteVal=10;
		short shortVal=20;
		int intVal=50;
		long longVal=100l;
		float floatVal=14.67f;
		double doubleVal=987.879d;
		char charVal='B';
		
		//Output of primitive data types
		System.out.println("Byte Value = "+byteVal);
		System.out.println("Short Value = "+shortVal);
		System.out.println("Integer Value = "+intVal);
		System.out.println("Float Value = "+floatVal);
		System.out.println("Double Value = "+doubleVal);
		System.out.println("Character Value = "+charVal);
		
		//First character of Name "Aniket"
		char firstChar = 'A';
		System.out.println("\nFirst character of My name :- "+firstChar);
		
		/*
		* 3. Write the Java Program to declare the local variable as x.
		* 4. Write the Java Program to assign local variable value as 50.
		*/
		int x=50;
		System.out.println("\nValue of Local variable x = "+x);
		
		
		/*
		* 5. Write the Java Program to declare the global variables as y.
		* 6. Write the Java Program to Print the global variable value as 25.
		*/
		//First we create object to access global variable
		Assignment02 obj = new Assignment02();
		System.out.println("\nValue of Global Variable y = "+obj.y);
		
	}
}
