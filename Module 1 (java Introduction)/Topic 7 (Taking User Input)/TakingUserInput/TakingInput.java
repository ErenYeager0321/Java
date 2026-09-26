package TakingUserInput;

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*nextInt()
		nextFloat()
		nextDouble()
		next()
		nextLine()for Names or Words
		nextByte()
		nextShort()
		nextLong()
		*/
//		System.out.println("Enter Your Name");
//		String Name = sc.nextLine(); 
//		System.out.println(Name);
	
		System.out.println("Enter Value Of a");
		int a = sc.nextInt();
		System.out.println("Enter Value Of b");
		int b = sc.nextInt();
		
		System.out.println("Sum Of A and B");
		int c = a+b;
		System.out.println(c);
		
		
		System.out.println("Enter Your Name");
		sc.nextLine();// Without This Buffer Line will be created and program will end and will not take any input
		String Name = sc.nextLine(); 
		System.out.println(Name);
		
	}
}
