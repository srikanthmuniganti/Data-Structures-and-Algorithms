package com.demo;

// non static class way of implementation
/*
 * Types
 * 1. Member Inner Class ----> class created within class and outside method
 * 2. Anonymous Inner Class ----> class created for implementing an interface or extending class. 
 * 									The java compiler decides its name.
 * 3. Local Inner Class ----> A class was created within the method
 */


// Member Inner Class Example

public class Department {
	
final  private int id=05;
	
	private  String getDeptName()
	{
		return "CSE ---> Member Inner Class";
	}
	private  String getHodName()
	{
		return "Srikanth ----> Member Inner Class";
	}

	class Student2 {
		
		public Student2() {
			System.err.println("\n\nDepartment id : "+id);
			System.err.println("Department Name : "+getDeptName());
			System.err.println("Hod  : "+ getHodName());
			
		
		}

	}

}
