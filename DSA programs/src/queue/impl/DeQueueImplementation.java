package queue.impl;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
// implented using stack operations
public class DeQueueImplementation {
	
	public static void main(String[] args) {
		
	Deque<String> dequeue=new ArrayDeque<>();
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < 5; i++) {
		String ns=sc.nextLine();
		String[] s = ns.split(" ");
		switch (s[0]) {
		case "1":
			if (dequeue.isEmpty()) {
				dequeue.push(s[1]);
			}
			else {
				System.out.println("stack not empty");
				String sss=dequeue.peek();
				dequeue.push(sss.concat(s[1]));
			}
			System.out.println("pushed");
			break;
		case "2":
			//String ss = pq.peek();
			String ss=dequeue.remove();
			//System.out.println(ss.substring(0, ss.length() - 1));
			//pq.add(ss.substring(0, ss.length() - 1));
			System.out.println("deleted   "+ ss);
			break;
		case "3":
			//System.out.println(pq.peek().charAt(pq.peek().length() - 1));
			System.out.println("peek value"+ dequeue.peek());
			break;
		case "4":
			dequeue.peek();
			System.out.println("Undoing");
			break;

		}
		
		System.out.println(dequeue);
	}
sc.close();
}

	

}
