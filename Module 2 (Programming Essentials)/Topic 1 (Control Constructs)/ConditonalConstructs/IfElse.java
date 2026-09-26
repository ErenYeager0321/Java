package ConditonalConstructs;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int Age = sc.nextInt();
		if(Age>=18) {
		System.out.println("You Can Fuck");
		System.out.println("You Can Fuck");
		System.out.println("You Can Fuck");/*without braces if condition is 
     	matched all 3 will print if not matched then last 2 will be printed
		so use brace 	*/
		}
		else {
			System.out.println("Fuck Yourself");
		}
	
		
		
		
	}
}
