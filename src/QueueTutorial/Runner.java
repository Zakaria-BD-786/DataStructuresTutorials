package QueueTutorial;

public class Runner {
	
	public static void main(String [] args) {
		

		ArrayQueue q = new ArrayQueue();
		
		q.enqueue(5);
		q.enqueue(50);
		q.enqueue(55);
		q.enqueue(60);
		q.enqueue(50);
		q.enqueue(55);
		q.enqueue(60);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(55);
		q.enqueue(100);
		q.dequeue();
	}

}
