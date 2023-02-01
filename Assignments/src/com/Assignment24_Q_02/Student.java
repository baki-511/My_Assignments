package com.Assignment24_Q_02;
/*
Assignments 24
2. Suppose I have Student class containing I'd, name and salary now I want 
to sort the data based on comparator interface by using salary.
*/
public class Student implements Comparable<Student> {
	//Creating fields
	private int id;
	private String name;
	private int salary;
	
	//Creating Student class constructor
	public Student(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//Create getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	//toString method to fields value
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	//CompareTo method to compare student class by salary
	@Override
	public int compareTo(Student student) {
		if(salary == student.salary)
			return 0;
		else if(salary>student.salary)
			return 1;
		else
			return -1;
	}
}
