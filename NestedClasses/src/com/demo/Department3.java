package com.demo;

//Local Inner Class ----> A class was created within the method

public class Department3 {

	final static private int id = 05;

	public static String getDeptName() {
		return "CSE ---> Local Inner Class";
	}

	public static String getHodName() {
		return "Srikanth ----> Local Inner Class";
	}

	public static void getStudent() {

		System.out.println("Getting Student Class ----> Local Inner Class");

		class Student3 {
			public Student3() {
				System.err.println("Department id : " + id);
				System.err.println("Department Name : " + getDeptName());
				System.err.println("Hod  : " + getHodName());
			}

			public void msg() {
				System.out.println("Message from Inner Classs-----------------> Local Inner Class");
			}
		}
		Student3 s = new Student3();
		s.msg();

	}

}
