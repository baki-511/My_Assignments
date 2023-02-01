package com.Java.Assignment8;

/*1.1 Design the Employee class which contain
firstName, lastName, city and mobileNumber and  country.*/
public class Employee {
	
	String country;
	Employee(){
		country="India";
	}
	private String firstName,lastName, city;
	private long mobileNumber;
	
	//Setter method to set firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//Setter method to set lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//Setter method to set city name
	public void setCity(String city) {
		this.city = city;
	}
	//Setter method to set mobileNumber
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	//Getter method to return firstName
	public String getFirstName() {
		return firstName;
	}
	//Getter method to return lastName
	public String getLastName() {
		return lastName;
	}
	//Getter method to return city name
	public String getCity() {
		return city;
	}
	//Getter method to return mobilNumber
	public long getMobileNumber() {
		return mobileNumber;
	}
	
}
