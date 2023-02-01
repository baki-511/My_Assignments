package com.Assignment20;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMobile {
	public void mobileNumbers() {
		ArrayList<String> mobileNo = new ArrayList<String>(); //Creating ArrayList object
		
		//Adding Five student mobile numbers
		mobileNo.add("9752334343");
		mobileNo.add("9823434224");
		mobileNo.add("7898092343");
		mobileNo.add("8982343292");
		mobileNo.add("9823432213");
		
		//Iterate Using iterator
		Iterator itr = mobileNo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	//Drivers Method
	public static void main(String[] args) {
		StudentMobile student = new StudentMobile();
		System.out.println("Iterate Using Iterator");
		student.mobileNumbers();
	}
}
