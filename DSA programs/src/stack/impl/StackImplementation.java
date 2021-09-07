package stack.impl;
import java.util.Scanner;
import java.util.Stack;

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
public class StackImplementation {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < 5; i++) {
			String ns=sc.nextLine();
			String[] s = ns.split(" ");
			switch (s[0]) {
			case "1":
				if (stack.isEmpty()) {
					stack.push(s[1]);
				}
				else {
					System.out.println("stack not empty");
					String sss=stack.peek();
					stack.push(sss.concat(s[1]));
				}
				System.out.println("pushed");
				break;
			case "2":
				String ss = stack.peek();
				System.out.println(ss.substring(0, ss.length() - 1));
				stack.push(ss.substring(0, ss.length() - 1));
				System.out.println("deleted");
				break;
			case "3":
				System.out.println(stack.peek().charAt(stack.peek().length() - 1));
				System.out.println("peek value");
				break;
			case "4":
				stack.pop();
				System.out.println("Undoing");
				break;

			}
			
			System.out.println(stack);
		}
sc.close();
	}

}
