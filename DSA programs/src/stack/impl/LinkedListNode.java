package stack.impl;

public class LinkedListNode{
	
	public LinkedListNode(int data, LinkedListNode ref) {
		super();
		this.setData(data);
		this.ref = ref;
	}
	private int data;
	private LinkedListNode ref;
	public LinkedListNode getRef() {
		return ref;
	}
	public void setRef(LinkedListNode ref) {
		this.ref = ref;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}	
}