package com.greatlearning.model;

public class Employee {
	
	private static String firstName;
	private static String lastName;
	private static String department;
	private static String company = "DummyCompany";
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName) {
		Employee.firstName=firstName;
		Employee.lastName=lastName;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		Employee.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		Employee.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		Employee.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		Employee.lastName = lastName;
	}
	
}
