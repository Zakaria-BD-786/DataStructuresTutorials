package StacksTutorial;

public class EvalPostFix {
	
	int op1;
	int op2;
    LinkedListStack nums = new LinkedListStack();
    
    
	public void evaluate(String expr) {
		String arrOfStr [] = expr.split(",");

		for(String a:arrOfStr) {
			if(a.matches("\\d+")) {
			    nums.push(Integer.parseInt(a));
			}
			else {
				op2= nums.pop();
				op1 = nums.pop();
				int new_value = generate(op1,op2,a);
				nums.push(new_value);
				
			}
		}
		System.out.println("The result is " +nums.result());
	}

	private int generate(int op12, int op22, String a) {
		int value=0;
		switch(a) {
		case "+":
			value = op12+op22;
			break;
		case "-":
			value = op12-op22;
			break;
		case "*":
			value = op12*op22;
			break;
		case "/":
			value = op12/op22;
			break;
		default:
			System.out.println("Invalid");

		}
		return value;


	}



	

}
