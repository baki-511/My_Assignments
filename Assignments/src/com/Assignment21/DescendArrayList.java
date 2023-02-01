package com.Assignment21;

/*
Assignments 21
1. Design the method which return the list that contain the element 
as Ram, Sohan, Ashok, Ajay, Prasanna now I want to sort that element based on descending order.
*/

import java.util.List; 
import java.util.ArrayList;
import java.util.Collections;

public class DescendArrayList {
	public List<String> getListElement(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sohan");
		list.add("Ashok");
		list.add("Ajay");
		list.add("Prasanna");
		
		return list;
	}
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("Ram");
//		list.add("Sohan");
//		list.add("Ashok");
//		list.add("Ajay");
//		list.add("Prasanna");
		
		DescendArrayList ds = new DescendArrayList();
		//Stored elements into new Array list
		List<String> list = ds.getListElement();
		System.out.println(list);
		
		
		//Sorting elements in Ascending order
		Collections.sort(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}
}
