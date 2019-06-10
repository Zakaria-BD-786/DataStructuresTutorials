package StacksTutorial;

public class InfixToPostfix {

	String res ="";
	LinkedListStack2 stack = new LinkedListStack2();

	public void convert(String expr ) {

		String arrOfStr[] = expr.split(" ");

		for (String a :arrOfStr) {

			if(a.matches("[0-9]")) {
				res = res+a;
			}
			else if(a.matches("\\*")||a.matches("\\/")){
				stack.push(a);
			}
			else if(!stack.isStackEmpty()&&a.matches("\\+")||a.matches("\\-")) {
				if(stack.peek().matches("\\*")||stack.peek().matches("\\/")) {
					do {
						res = res+stack.pop();
					}
					while(!stack.isStackEmpty());
					stack.push(a);
				}
				else {
					stack.push(a);
					
				}
             
			}
			else {
				stack.push(a);
			}

		}
		while(!stack.isStackEmpty()) {
			res = res+stack.pop();
		}
		System.out.println(res);


	}

}


