package QueueTutorial;

public class LinkedListQueue {
	
	Node front;
	Node rear;
	
	
	public void enqueue(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(front == null) {
			front=rear=node;
			
		}
		else {
			rear.next = node;
			rear=node;
			
		}
	}
   public void dequeue() {
	   if(front == null) {
		   System.out.println("Queue is empty");
	   }
	   else {
	   int data = front.data;
	   front = front.next;
	   System.out.println(data);
        }
	   }
   
   
   public void show() {
	   Node n = front;
	   while(n.next!=null) {
		   System.out.println(n.data);
		   n=n.next;
	   }
	   System.out.println(n.data);
   }

}
