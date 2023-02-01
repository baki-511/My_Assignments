package com.Assignment23;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryMap {
	public static void main(String[] args) {
		 ArrayList<String> maharashtraCity = new ArrayList<String>();
		 	maharashtraCity.add("Mumbai");
		 	maharashtraCity.add("Pune");
		 	maharashtraCity.add("Nagpur");
		 	
		 ArrayList<String> karnatakaCity = new ArrayList<String>();
		 	karnatakaCity.add("Banglor");
		 	karnatakaCity.add("Mysore");
		 	
		 ArrayList<String> madhyaPradeshCity = new ArrayList<String>();
		 	madhyaPradeshCity.add("Bhopal");
		 	madhyaPradeshCity.add("Indore");
		 	
		 HashMap<String, ArrayList<String>> states = new HashMap<String, ArrayList<String>>();
		 	states.put("Maharashtra", maharashtraCity);
		 	states.put("Karnataka", karnatakaCity);
		 	states.put("Madhya Pradesh", madhyaPradeshCity);
		 	
		 HashMap<String,  HashMap<String, ArrayList<String>>> india = new HashMap<String,  HashMap<String, ArrayList<String>>>();
				 india.put("India", states);
		 
		 System.out.println(india);
		
		
	 }
}
