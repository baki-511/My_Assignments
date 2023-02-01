package com.Assignment18;

/*
 *Assignment 18:
 *2. Suppose you have array that containing elements 10,20,30,10,30,50,60 Find out duplicate elements 
 *into array and print it. 
 */
	
public class DuplicateNumber {
	//Printing Duplicate elements 
	public void duplicateNumber(int[] arr) {
		int n=arr.length;
		int k=0;
		int temp[]=new int[n/2];
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {//10,20,30,10,20,30,50,60,60
				if((arr[i]==arr[j]) && arr[i]!= -1) {
					temp[k]=arr[i];
					arr[j]= -1;
					k++;
				}
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(temp[i]+" ");
		}
	}
	//Printing the array methods
	public void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	//Driver method
	public static void main(String[] args) {
		int arr[] = {10,20,30,10,20,30,50,60,60};
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Array Elements :- ");
		dn.printArr(arr);
		System.out.println("Duplicate Elements :- ");
		dn.duplicateNumber(arr);
	}
}
