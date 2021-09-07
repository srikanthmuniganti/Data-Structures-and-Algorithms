package stack.impl;

import java.util.LinkedList;
import java.util.Scanner;


/***********
 * 
 * @author srikanth Muniganti
 * 
 * 1 --push
 * 2-pop
 * 3---show
 * 4---undo
 *
 */




public class LinkedListImplementation {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		// As a Stack, using stack operations
		// elements pushed at the front only
		LinkedList<String> linkedList=new LinkedList<>();
		// using add methods
		// works generally, adds at the end of the list
		LinkedList<String> linkedList2=new LinkedList<>();

		for (int i = 0; i>=0; i++) {
			String ns=sc.nextLine();
			String[] s = ns.split(" ");
			switch (s[0]) {
			case "1":
				if (linkedList.isEmpty()){
					linkedList.push(s[1]);
					linkedList2.add(s[1]);
				}
				else {
					System.out.println("stack not empty");
					String sss=linkedList.peek();
					linkedList.push(sss.concat(s[1]));
					linkedList2.add(linkedList2.getLast().concat(s[1]));
				}
				System.out.println("pushed");
				break;
			case "2":
				String ss = linkedList.peek();
				String ss2=linkedList2.get(linkedList2.size()-1);
				System.out.println(ss.substring(0, ss.length() - 1));
				linkedList.push(ss.substring(0, ss.length() - 1));
				linkedList2.add(ss2.substring(0, ss.length() - 1));
				System.out.println("deleted");
				break;
			case "3":
				System.out.println(linkedList.peek().charAt(linkedList.peek().length() - 1));
				System.out.println(linkedList2.getLast().charAt(linkedList.peek().length() - 1));
				System.out.println("peek value");
				break;
			case "4":
				linkedList.pop();
				linkedList2.remove(linkedList2.getLast());
				System.out.println("Undoing");
				break;

			}
			
			System.out.println(linkedList);

			System.out.println(linkedList2);
		}
sc.close();
	}	
	
}





/******************************************************************
 * output
1 srikanth
pushed
[srikanth]
[srikanth]
1 srikanth2
stack not empty
pushed
[srikanthsrikanth2, srikanth]
[srikanth, srikanthsrikanth2]
2
srikanthsrikanth
deleted
[srikanthsrikanth, srikanthsrikanth2, srikanth]
[srikanth, srikanthsrikanth2, srikanthsrikanth]
4
Undoing
[srikanthsrikanth2, srikanth]
[srikanth, srikanthsrikanth2]
3
2
2
peek value
[srikanthsrikanth2, srikanth]
[srikanth, srikanthsrikanth2]
****************************************************************/
