package QueueTutorial;

public class ArrayQueue {

	int front;
	int rear;
	int size;

	int queue[] = new int[5];

	public void enqueue(int data) {
		if(getSize()==5) {
			System.out.println("Queue is full");
		}
		else {
		queue[rear]=data;
		rear = (rear+1)%5;
		size++;
	}
	}
	
	public void dequeue() {
		int data=0;
		if(isEmpty()){
				System.out.println("Empty Queue");
			}
		else {
				data = queue[front];
				front = (front+1)%5;
				size = size-1;
				System.out.println(data);
			}
		}


	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}

}
