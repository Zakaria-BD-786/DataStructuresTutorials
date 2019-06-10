package StacksTutorial;

public class LinkedListStack {
	Node head;
	
	public void push(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		
		
	}
	

	public int pop() {
		Node n = head;
		int data = n.data;
		n = n.next;
		head = n;
		return data;

	}
	
	
	
	
	public void show() {
		Node n = head;
		while(n.next != null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data);
		
	}
	public int result() {
		return head.data;
	}
	public void peek() {
		Node n = head;
		System.out.println(n.data);
		
	}
	
	

}
