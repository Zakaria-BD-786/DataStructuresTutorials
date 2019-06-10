package LinkedListTutorial;

public class LinkedList {

	Node head;

	public void insertAtEnd(int data) {

		Node n = head;
		Node node = new Node();
		node.data = data;
		node.next = null;

		if(head == null) {
			head = node;
		}
		else {
			while(n.next !=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		
	}
	
	public void insertAtIndex(int index,int data) {
		
		
		if(index == 0) {
			insertAtStart(data);
		}
		else {
		Node n = head;
		Node node = new Node();
		node.data = data;
		for(int i=0;i<index-1;i++) {
			
			n = n.next;
			}
		
		node.next = n.next;
		n.next = node;
		}
				
	}
	
	public void deleteAtIndex(int index) {
		
		Node n = head;
		Node n1;
		
		for(int i=0;i<index-1;i++) {
			n = n.next;
			
		}
		n1 = n.next;
		n.next = n1.next;
		
		
	}
	
   public void delete(int item) {
	   
	   Node n = head;
	   Node n1;
	   Node n2 = head;
	   int count =0;
	   while(n.next!=null) {
		   count++;
		   if(n.data == item) {
			   for(int i=1;i<count-1;i++) {
				   
				   n2 = n2.next;
				   
			   }
			   n1 = n2.next;
			   n2.next = n1.next;
			   break;
			   
		   }
		   n=n.next;
		  
	   }
	   if(n.next == null) {
		   System.out.println("Element not found");
	   }
	  
	   
	   
	   
   }
   
   public int size() {
	   
	   Node n = head;
	   int count = 0;
	   while(n.next!=null) {
		   
		   count++;
		   n = n.next;
	   }
	   count = count+1;
	   return count;
   }
   
   
   public void reverse() {
	   Node temp = head;
	   Node prev = null;
	   Node curr = null;
	   
	   
	   while(temp.next!=null) {
		   curr = temp.next;
		   temp.next = prev;
		   prev = temp;
		   temp = curr;
		   
	   }
	   temp.next = prev;
	   head = temp;
   }
   	
	public void show() {

		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;

		}
		System.out.println(n.data);

	}
}