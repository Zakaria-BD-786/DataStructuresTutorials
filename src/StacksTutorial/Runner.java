package StacksTutorial;

public class Runner {
public static void main(String [] args) {
	
	/*ArrayStackFixed nums = new ArrayStackFixed();
	nums.push(5);
	nums.push(6);
	
	nums.show();
	System.out.println(nums.size());*/
	
	

	
	/*LinkedListStack elem = new LinkedListStack();
	elem.push(5);
	elem.push(10);
	elem.push(50);
	elem.show();
	elem.peek();
	elem.pop();
	elem.push(100);
	elem.show();
	elem.pop();
	elem.show();
	elem.peek();
	elem.size();*/
	
	/*ArrayStackDynamic nums = new ArrayStackDynamic();
	
	nums.push(5);
	nums.show();
	System.out.println();
	nums.push(10);
	nums.show();
	System.out.println();
	nums.push(15);
	nums.show();
	System.out.println();
	nums.push(20);
	nums.show();
	System.out.println();
	nums.push(25);
	nums.show();
	System.out.println();
	nums.pop();
	nums.show();
	System.out.println();
	nums.pop();
	nums.show();
	System.out.println();
	nums.pop();
	nums.show();
	System.out.println();
	nums.pop();
	nums.show();
	System.out.println();	*/
	
	/*String str = "5,4,3,*,+,10,5,*,-";
	String[] arrOfStr = str.split(",");
	
	for(String a:arrOfStr) {
		if(a.matches("\\d+")) {
			System.out.println(a);
		}
		
		else {
			System.out.println(a);
		}
		
	}
		
		

	EvalPostFix eval = new EvalPostFix();
	eval.evaluate(str);*/
	//String str = "[,(,{,},]";
	/*int count =0;
	String arrOfStr [] = str.split(",");
	
	
	for(String a:arrOfStr) {
		
		System.out.println("Char"+a);
		if(a.matches("[\\{\\(\\[]")) {
		   System.out.println(a);
		}
		else {
			System.out.println("No");
			}
		
		}*/
	
	
	
	
	
	////System.out.println(check.isStackEmpty());
	//check.balance(str);
String str = "2 + 3 * 5 - 6 * 1";	
	
InfixToPostfix exprn = new InfixToPostfix();
exprn.convert(str);
	
	
}
}
