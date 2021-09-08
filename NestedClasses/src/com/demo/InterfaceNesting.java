package com.demo;

interface InterfaceNesting1 {
	default void msg() {
		System.out.println("ouside interface");
	}
	interface InterfaceNesting2{
		void display();
	}

}

class InterfaceNesting3 implements InterfaceNesting1.InterfaceNesting2{

	@Override
	public
	void display() {
		System.out.println("Inside Display -----> Nested Interface method.....");
	}
	
	interface InsideInterface
	{
		default void inside() {
			System.out.println("\n\nInside Interface");
		}
	}
}

public class InterfaceNesting implements InterfaceNesting3.InsideInterface{
	
	
}