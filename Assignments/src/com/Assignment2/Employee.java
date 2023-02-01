package com.Assignment2;

public class Employee {
	private String firstName;
	private String lastName;
	private String city;
	private long mobileNumber;
	static String country = "India";
	
	//Setter Method
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	//Getter Method
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getCity() {
		return city;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
}
