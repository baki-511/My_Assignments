package com.Assignment19;

/*
 * 2. Design the java method for String getReverseString(String reverse) 
 * and take the input from user into main method and pass to that method.
	Result will print into main method
 * 
 **/ 
import java.util.Scanner;

//method to print Reverse String 
public class StringReverse {
	public void reverseString(String str) {
		int len = str.length();
		String newString  = "";//creating an empty string
		
		for(int i=len-1;i>=0;i--) {
			char ch = str.charAt(i);
			newString = newString + ch; //Adding last character of string 
		}
		//printing original & Reverse string
		System.out.println("Original String = "+str);
		System.out.println("Reverse String = "+newString);
	}
	
	//Driver method
	public static void main(String[] args) {
		//Scanner method to take input from user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string :- ");
		String s = scan.nextLine();
		System.out.println();
		
		StringReverse reverse = new StringReverse();
		reverse.reverseString(s);//Calling reverseString method
	}
}
