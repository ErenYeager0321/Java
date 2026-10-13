package Static_3Method;

import java.util.Scanner;

public class P1_Math {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operation");
		String s = sc.next();
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		
		
		// switch(operation){
		// case "Addition" -> System.out.println("The result of addition is: "+MathOperations.add(num1, num2));
		// case "Subtraction" -> System.out.println("The result of subtraction is: "+MathOperations.subtract(num1, num2));
		// case "Multiplication" -> System.out.println("The result of multiplication is: "+MathOperations.multiply(num1, num2));
		// case "Division" -> System.out.println("The result of division is: "+MathOperations.divide(num1, num2));
		// }
		
		
		if(s.equals("Addition")) {
			MathOperations.add(a, b);
			} else if(s.equals("Subtraction")) {
			MathOperations.sub(a, b);
			} else if(s.equals("Multiplication")) {
			MathOperations.mul(a, b);
			} else {
			MathOperations.div(a, b);
			}
	}
}

class MathOperations{
	// Static method for addition
	static void add(int a , int b) {
		System.out.println("The result of addition is: " + (a+b));
	}
	 // Static method for subtraction   
	static void sub(int a, int b) {   
		System.out.println("The result of subtraction is: " + (a-b));  
		}   
	// Static method for multiplication   
	static void mul(int a, int b) {  
		System.out.println("The result of multiplication is: " + (a*b));  
		}  
	// Static method for division   
	static void div(int a, int b) {   
	System.out.println("The result of division is: " + (a/b));  
	}
}
