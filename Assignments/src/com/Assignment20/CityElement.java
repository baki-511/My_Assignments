package com.Assignment20;
/*
4. Suppose I have arraylist which contain elements as 
	[mumbai, pune, Bangalore, Hyderabad, mumbai], now I want to remove
	the mumbai from list and print that data.
	*/
import java.util.ArrayList;
public class CityElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Bangalore");
		list.add("Hyderabad");
		list.add("Mumbai");
		
//		list.add("Mumbai");
//		list.add("Mumbai");
//		list.add("Latur");
//		list.add("Mumbai");
//		list.add("Mumbai");
//		list.add("Mumbai");
//		list.add("Mumbai");
//		list.add("Mumbai");
//		list.add("Nanded");
		
		System.out.println(list);
//		int idx = list.indexOf("Mumbai");
//		list.remove(idx);
//		list.remove("Mumbai");
//		System.out.println(list);
//		list.remove("Mumbai");
//		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)=="Mumbai") {
				list.remove(i);
			}
		}
		System.out.println(list);
		
	}
}
