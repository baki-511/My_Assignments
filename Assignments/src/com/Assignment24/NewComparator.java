package com.Assignment24;

import java.util.Comparator;

public class NewComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
//		return emp1.getCity().compareTo(emp2.getCity());
	
//		if(emp1.getId() == emp2.getId())
//			return 0;
//		else if(emp1.getId()>emp2.getId())
//			return 1;
//		else
//			return -1;
	}
	
}
