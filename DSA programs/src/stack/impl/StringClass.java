package stack.impl;
import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		int n=sc.nextInt();
		sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s2);
		
		System.err.println(s.format("%.2f", 15.15254));
		
		System.out.println(s);
		System.out.println(s2);
	}
		
}
