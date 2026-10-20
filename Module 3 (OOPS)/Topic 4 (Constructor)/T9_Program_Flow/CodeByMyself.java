package T9_Program_Flow;

public class CodeByMyself {
	//Question - Find Who Wil Execute First Constructor Static/Non Static Block
	// Answer - first *Blocks of Both Then *Constructor then *Methods
	
	// Non Static - Instance Variable Block Method
	
	static int a ;//Static Variable
		   int b ;// Instance/Non Static Variable
		   String name;
		   
	//Static Block
	static {
		a = 99;
		System.out.println("Static Block Executed");
		System.out.println("a : "+a);
		System.out.println(" ");
	}
	//Instance/Non Static Block
		{
			System.out.println("Instance/Non Static Block Executed");
			b=888;
			a=777;
			System.out.println("Value of a "+a+" and b is "+b);
			System.out.println(" ");
		}
	/*
		After Blocks Constructor Executes So Constructor A and B values will be given to Methods
		*/
	//Static Mehtod
	static void display1(){
		System.out.println("Static Method Execucted");
		System.out.println("a : "+a);
		System.out.println("End Here --------------------");
		System.out.println(" ");
	}
	
	//Instance/Non Static Method
	void display2() {
		System.out.println("Instance/Non Static Method Execucted");
		System.out.println("a : "+a+" b : "+b);
		System.out.println("End Here --------------------");
		System.out.println(" ");
	}
	
	//Constructor
	public CodeByMyself(String c) {
		name = c;
		System.out.println(c);
		System.out.println("Constructor exec ...");
		a=10;
		b=20;
		System.out.println();
	}
}
