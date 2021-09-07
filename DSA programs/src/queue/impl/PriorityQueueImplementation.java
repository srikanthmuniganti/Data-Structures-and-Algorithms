package queue.impl;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

// Follows FIFO 
// add-adds
// remove- removes head from queue
//peek-- points to head

public class PriorityQueueImplementation {

	public static void main(String[] args) {
		
		Queue<String> pq=new PriorityQueue<String>();
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String ns=sc.nextLine();
			String[] s = ns.split(" ");
			switch (s[0]) {
			case "1":
				if (pq.isEmpty()) {
					pq.add(s[1]);
				}
				else {
					System.out.println("stack not empty");
					String sss=pq.peek();
					pq.add(sss.concat(s[1]));
				}
				System.out.println("pushed");
				break;
			case "2":
				//String ss = pq.peek();
				String ss=pq.remove();
				//System.out.println(ss.substring(0, ss.length() - 1));
				//pq.add(ss.substring(0, ss.length() - 1));
				System.out.println("deleted   "+ ss);
				break;
			case "3":
				//System.out.println(pq.peek().charAt(pq.peek().length() - 1));
				System.out.println("peek value"+ pq.peek());
				break;
			case "4":
				pq.peek();
				System.out.println("Undoing");
				break;

			}
			
			System.out.println(pq);
		}
		sc.close();
		
	}	
	
	
}
