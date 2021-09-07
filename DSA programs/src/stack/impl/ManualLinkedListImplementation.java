package stack.impl;

import java.util.Scanner;

public class ManualLinkedListImplementation {

	private static LinkedListNode node;
	private static LinkedListNode head;
	private static LinkedListNode first;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("showing");
		for (int i = 1; i > 0; i++) {
			System.out.println("1. Add\n2. display\n3. Add at Index\n4. Delete\n");
			int n = sc.nextInt();
			LinkedListNode temp = null;
			switch (n) {
			case 1:
				System.err.println("enter data to insert");
				int data = sc.nextInt();
				if (i == 1) {
					node = new LinkedListNode(data, null);
					head = first = node;
				} else {

					while (head.getRef() != null) {
						head = head.getRef();
					}
					head.setRef(new LinkedListNode(data, null));
				}
				break;

			case 2:
				System.err.println("Displaying Nodes");
				head = first;
				while (head.getRef() != null) {
					System.out.print(head.getData() + "   ");
					head = head.getRef();
				}
				System.out.println(head.getData());
				break;

			case 3:
				int j = 0;
				head = first;
				System.err.println("enter Index value");
				int index = sc.nextInt();
				System.err.println("enter data to insert");
				data = sc.nextInt();
				if (index != 1 && index != 0) {
					while (head.getRef() != null && j + 1 < index) {
						temp = head;
						head = head.getRef();
						j++;
					}
					node = new LinkedListNode(data, null);
					node.setRef(head);
					temp.setRef(node);
				} else {
					node = new LinkedListNode(data, null);
					node.setRef(first);
					first = node;
				}

				break;
			case 4:
				head = first;
				System.err.println("enter data to be deleted");
				data = sc.nextInt();

				while (head.getData() != data) {
					temp = head;
					head = head.getRef();
				}
				temp.setRef(head.getRef());
				break;
			}
		}
		sc.close();
	}

}
