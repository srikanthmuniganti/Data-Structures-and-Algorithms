package com.demo;

// Static Nested Class Example
// this static nested class can access all the methods and variables of outer class including private 
// and can only access static variables and methods of outer class
// By default the methods in Static Nested Class will not become static, when need to make it static explicitly. 

public class College {
	
	 final static private int id=101;
	
	public static String getCollegeName()
	{
		return "Vardhaman";
	}
	public static String getAddress()
	{
		return "Hyderabad";
	}
	
	static class Student{
		public Student(){			
			System.err.println("College id : "+College.id);
			System.err.println("College Name : "+getCollegeName());
			System.err.println("Address  : "+ getAddress());
		}
		static void msg() {
			System.out.println("Message from Student");
		}
	}
	
}
