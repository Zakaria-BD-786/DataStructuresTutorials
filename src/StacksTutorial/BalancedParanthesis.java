package StacksTutorial;

public class BalancedParanthesis {
	
Node head;	
String op;
int count=0;

    
    
	public void balance(String expr) {
		String arrOfStr [] = expr.split(",");
		
		for(String a:arrOfStr) {
			if(a.matches("[\\{\\[\\(]")) {
			   push(a);
			}
			else if(a.matches("[\\]]")){
				if(isStackEmpty()||pop().matches("[^\\[]")) {
					System.out.println("Parenthesis is not balanced");
					break;
				}
			}
			else if(a.matches("[\\}]")){
				if(isStackEmpty()||pop().matches("[^\\{]")) {
					System.out.println("Parenthesis is not balanced");
					break;
				}	
			}
			else if(a.matches("[\\)]")){
				if(isStackEmpty()||pop().matches("[^\\(]")){
					System.out.println("Parenthesis is not balanced");
					break;
				}	
			}
			
			count++;
		}
			
		if(count==arrOfStr.length) {
			
			System.out.println("Parenthesis is balanced");
		}
	}

	
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

public boolean isStackEmpty() {
	return head == null;
	
}

}
