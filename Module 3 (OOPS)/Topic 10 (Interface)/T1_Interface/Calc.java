package T1_Interface;
/*
	What actually Interface is  
	So interface is used to achieve *pure abstraction, it is
	used to achieve *standardization and you cannot create
	the object of interface.
	InterFace is basically a Abstract Class And Method , Speically used for 
	abstraction
	
	Standard definition:
	An Interface in Java programming language is defined as an abstract type used
	to specify the behaviour of a class. An interface in Java is a blueprint of a
	behaviour(method). A Java interface contains static constants and abstract
	methods.
	
	Simple Explanation:
	Imagine you're building smart home devices like lights, fans, and air conditioners. They
	all need to follow basic rules like turning on and turning off, but each device does it in
	its own way. A light might turn on with a button, an air conditioner with a remote, and a
	fan with a voice command. An interface helps by making all devices follow the same
	rules, but letting them decide how to do it.
	
	Why are Interfaces Important?
	• Flexibility: Interfaces allow each class to follow the same rules but implement them
	  in their own way.
	• Multiple Implementations: A class can follow multiple interfaces, giving it more
	  freedom.
	• No Restrictions: Unlike abstract classes, interfaces don't tell you how to do things;
	  they just tell you what to do.
*/

import java.util.Scanner;

public interface Calc {
	void add();
	void sub();
	void mul();
	void div();
}
// Can make class in interface too without crating differently
class CasioCalce implements Calc{
	int a = 10;
	int b = 10;
	public void add() {
		int c = a+b;
		System.out.println(c);
	}

	public void sub() {
		int c = a-b;
		System.out.println(c);
	}

	public void mul() {
		int c = a*b;
		System.out.println(c);
	}

	public void div() {
		int c = a/b;
		System.out.println(c);
	}
}

class EpsonCalce implements Calc {
	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void add() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a-b;
		System.out.println(c);

	}

	@Override
	public void mul() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a*b;
		System.out.println(c);

	}

	@Override
	public void div() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a/b;
		System.out.println(c);

	}
}

class Mathe {
	public static void operate(Calc ref) {
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
	}
}

class MathOperations {
	public static void main(String[] args) {
		Mathe.operate(new CasioCalce());
		Mathe.operate(new EpsonCalce());
	}
}