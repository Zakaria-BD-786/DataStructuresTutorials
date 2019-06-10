package StacksTutorial;

public class ArrayStackDynamic {
	
	int capacity =2;
	int stack[] = new int[capacity];
	int top =0;
	
	
	public void push(int data) {
		
		if(size()==capacity) {
			expand();
		}
		
		stack[top] = data;
		top++;
		
	}
	
	private void expand() {
		
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack,0, newStack,0, length);
		stack = newStack;
		capacity*=2;
		
		
	}
	
	public int pop() {
		int data=0;
		top--;
		data = stack[top];
		System.out.println(data);
		stack[top]=0;
		if(size()==(capacity/4)){
		shrink();
		}
		
		return data;
	}
	
	public void shrink() {
		int length=size();
		int newStack[] = new int[capacity/2];
	    System.arraycopy(stack,0, newStack,0, length);
		stack = newStack;
		capacity/=2;
			
			
		
	}

	public void show() {
		for(int i:stack) {
			System.out.print(i+" ");
		}
	}
	
	public int size(){
		return top;
	}
}
