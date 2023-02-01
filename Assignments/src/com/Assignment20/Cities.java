package com.Assignment20;

/*
 * 2. Design the generics arraylist for string and add five cities 
	into it and iterate that using for each loop.
*/

import java.util.ArrayList;
import java.util.Iterator;
public class Cities {
	public void cityName() {
		ArrayList<String> city = new ArrayList<String>();//Creating ArrayList object
		//Adding the five Cities 
		city.add("Latur");
		city.add("Pune");
		city.add("Delhi");
		city.add("Nanded");
		city.add("Hydrabad");
		
		//Iterate cities using forEach loop
		for(String names: city) {
			System.out.println(names);
		}
//		Iterator itr = city.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
	//Driver method
	public static void main(String[] args) {
		Cities city = new Cities();
		System.out.println("Iterate usig ForEach Loop...");
		city.cityName();
	}
}
