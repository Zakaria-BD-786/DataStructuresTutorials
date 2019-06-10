package StacksTutorial;



public class ArrayStackFixed {
	
	int stack[] = new int[2];
	int top =0;
	
	public void push(int data) {
		
		if (top == 2) {
			System.out.println("Stack is full");
		}
		else {	
			stack[top] = data;
			top++;
		}
	}
	public int pop() {
		
		int data=0;
		if (top == 0) {
			System.out.println("Stack is empty");
		}
		else {
			
			top--;
			data = stack[top];
			stack[top] =0;
			
			}
		return data;
		
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
			
		}
	
	
	public int peek() {
		int data;
		data = stack[top-1];
		return data;
		
	}
	
	
	public void show() {
		for(int i:stack) {
			System.out.println(i);
		}
	}
	
}
