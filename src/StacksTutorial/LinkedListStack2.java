package StacksTutorial;

public class LinkedListStack2 {
	Node head;

	public String pop() {
		Node n = head;
		String a  = n.a;
		n = n.next;
		head = n;
		System.out.println(a);
		return a;

	}
	
public void push(String data) {
		
		Node node = new Node();
		node.a = data;
		System.out.println(node.a);
		node.next = head;
		head = node;
		
}


	public String peek() {
		Node n = head;
		String a = n.a;
		return a;
	}
	public Boolean isStackEmpty() {
		return head == null;
		
	}
	
}


