package LinkedListTutorial;

public class Runner {
	
	public static void main(String [] args) {
		
		LinkedList list = new LinkedList();
		list.insertAtEnd(5);
		list.insertAtEnd(50);
		list.insertAtStart(1);
		list.insertAtEnd(55);
		list.insertAtIndex(2,10);
		list.insertAtIndex(0,12);
		//list.deleteAtIndex(3);
		//list.delete(1);
		
		
		list.show();
		list.reverse();
		list.show();
		
		
		
	
	}

}
