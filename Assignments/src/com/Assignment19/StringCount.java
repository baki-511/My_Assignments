package com.Assignment19;
/*
Assignments-19


1. Design a method for counting the alphabet, vowels and numbers
	from String. Input should be from user into main method and pass 
	that to methods. And result will print into main method
*/
import java.util.Scanner;

public class StringCount {
	//method to count Alphabets, vowels and numbers
	public void countAlphaVowelAndNum(String s) {
		int len = s.length();
		//intitializing all values to zero
		int countAlphabets =0;
		int countVowels =0;
		int countNumbers =0;
		
		for(int i=0;i<s.length();i++) {
			
			if((s.charAt(i)>='a' && s.charAt(i)<='z') 
					|| (s.charAt(i)>='A' && s.charAt(i)<='Z')) {
				countAlphabets++;
			}
			if((s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
					|| (s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')) {
				countVowels++;
			}
			else if(s.charAt(i)>='1' && s.charAt(i)<='9'){
				countNumbers++;
			}
		}
		System.out.println("Total Alphabets = "+countAlphabets+
				"   Total Vowels = "+countVowels+"  Total Numbers = "+countNumbers);
	}
	//Driver method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String - ");
		String str = scan.nextLine();
		
		StringCount sc = new StringCount();
		sc.countAlphaVowelAndNum(str);
	}
}
