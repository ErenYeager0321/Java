package T1_Super_Keyword;
/*
	
  
  
    What Exactly is the super Keyword?
	Simple Explanation:
	Think of super as a respectful way of saying, "I need help from my parent."
	Just like if you're learning to drive and you ask your dad to show you 
	how he does it — you're referring to your parent's way. In Java, super 
	lets a class access the parent's variable, method, or constructor 
	when needed.
	
	Standard Definition:
	The super keyword in Java is a reference variable used to refer to the 
	immediate parent class object. It allows a subclass to access fields,
	methods, and constructors of its parent class.
	
	Why is the super Keyword Important?
	
	Code Reuse: It helps reuse already existing variables and methods from 
	the parent class, saving time and reducing redundancy.
	
	Clarity in Inheritance: When both parent and child have the same method 
	or variable names, super helps to avoid confusion by clearly pointing to
	the parent class.
	
	Constructor Chaining: It allows calling a parent class's constructor 
	from the child class to ensure proper initialization.
	
	Let's understand the different ways super is used in Java:
	
	Accessing Parent Class Variables: If the child and parent class both have 
	a variable with the same name, super.variableName is used to refer to the
	parent's version.
	
	Accessing Parent Class Methods: If the child overrides a method from 
	the parent but still wants to use the parent's logic, it can do so using
	super.methodName().
  
 */

class Vehicle {
	String name = "Generic Vehicle";
	
	public void start() {
	System.out.println(name + " is starting.");
	}
}

class Car extends Vehicle {
	// Shadowing the name field from Vehicle
	String name = "Car";
	
	public void start() {
	// Call to parent method
	super.start();
	System.out.println(this.name + " is starting with a key turn.");
	}
	
	public void displayName() {
	// Accessing the parent class's name field using super
	System.out.println("Parent name: " + super.name);
	System.out.println("Car name: " + this.name);
	}
}
	
//public class TransportTest {
//	public static void main(String[] args) {
//	Car myCar = new Car();
//	myCar.start(); // Demonstrates method access
//	myCar.displayName(); // Demonstrates field access
//	}
//}
public class About {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.start(); // Demonstrates method access
		myCar.displayName(); // Demonstrates field access
		}
}
