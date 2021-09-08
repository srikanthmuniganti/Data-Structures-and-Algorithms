package com.demo;


// Anonymous Class 

interface Deps{
	public abstract void anonymousClass();
}

public abstract class Department2 {
	
final static int id = 05;
	
	static String getDeptName()
	{
		return "CSE ---> Anonymous Inner Class";
	}
	static String getHodName()
	{
		return "Srikanth ---> Anonymous Inner Class";
	}
	public abstract void anonymousClass();
	

}



class Student2 {
	
	public Student2() {
		
		System.out.println("Department id : "+ Department2.id);
		System.out.println("Department Name : "+Department2.getDeptName());
		System.out.println("Hod  : "+Department2.getHodName());
	}
}
