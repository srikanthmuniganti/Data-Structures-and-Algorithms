package com.demo;

import com.demo.College.Student;

/*******************
 * 
 * @author Srikanth Muniganti
 *
 *******************/
/*
 * Two types of Nested Classes
 * 1. Static Nested Classes
 * 2. Non-Static Nested Class (a.k.a Inner Classes)
 *  
 */





// example of static nested classes

public class NestedClass {

	public static void main(String[] args) {

		// static class
		College.Student.msg();
		Student c=new College.Student();
//		Student c2=new College.Student();
//		System.err.println(c.hashCode()+"\n"+c2.hashCode());
		c.msg();
		// non static class
		// 1. member -inner-class
		Department department=new Department();
		/*****important*****/
		Department.Student2 s=department. new Student2();
		
		
		// Anonymous class implementation
		// now compiler creates an anonymous class 
		// which implements anonymousClass() method --> which could be overriding or overloading.
		Department2 department2=new Department2() {
			public void anonymousClass() {
				System.out.println("\nAnonymous Classs");
				Student2 s=new Student2();
				System.out.println("Anonymous Classs");
			}
		};
		department2.anonymousClass();
		
		//Anonymous class implementation ---> using Interface
		
		Deps deps=new Deps() {
			
			@Override
			public void anonymousClass() {
				System.out.println("\nInterface based Anonymous Class");
				new Student2();
				System.out.println("Interface based Anonymous Class");
				
			}
		};
		deps.anonymousClass();
		
		System.out.println("\nCalling Local Inner class from Nested Class");
		Department3.getStudent();		
		//Department3.getDeptName();
		System.out.println("Called Local Inner class from Nested Class");
		
		
		
		// Nseted interface
		new InterfaceNesting().inside();

	}
	
	

}

