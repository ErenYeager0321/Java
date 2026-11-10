package T5_Mastering_AbstractClasses;
/*
1. Creating References, Not Objects:
	One key feature of abstract classes is that you can't create an object 
	directly from an abstract class. But you can create references of an 
	abstract class type, which will refer to objects of its subclasses. 
	This allows you to leverage polymorphism — one reference type pointing 
	to different objects, enabling you to perform different tasks based on 
	the actual type of the object.
	Example:

	Here, Vehicle is abstract, and you can't directly create a Vehicle object. 
	But you can create a Vehicle reference that points to a Car object. 
	This is called upcasting, where a parent class reference is used to 
	refer to a subclass object.


*/

abstract class Vehicle {
	abstract void run();
}

class Car extends Vehicle {
	void run() {
		System.out.println("Car is running smoothly.");
	}
}

public class T1_Reference {
	public static void main(String[] args) {
	Vehicle myCar = new Car();
		myCar.run(); // Outputs: Car is running smoothly.
	}
}


