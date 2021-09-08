package com.demo;


//Local Inner Class ----> A class was created within the method

public class Department3 {
	
final  private int id=05;
	
	private  String getDeptName()
	{
		return "CSE ---> Local Inner Class";
	}
	private  String getHodName()
	{
		return "Srikanth ----> Local Inner Class";
	}

	
	class Student3 {
		
		public Student3() {
			System.err.println("\n\nDepartment id : "+id);
			System.err.println("Department Name : "+getDeptName());
			System.err.println("Hod  : "+ getHodName());
			
		
		}

	}

}
