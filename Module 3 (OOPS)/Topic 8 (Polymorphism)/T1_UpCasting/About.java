package T1_UpCasting;
/*
	Standard Definition:
	Upcasting is a feature in Java where a child class object is stored 
	in a parent class reference. This happens automatically and is
	part of Java's inheritance system.
	
	*Having PArent type Ref To Child Object Is Loose Coupling/UpCasting
	
	Simple Explanation:
	Let's say your friend went to a restaurant and ordered a pizza, but instead of saying "pizza," he just told the waiter, "Bring me food."
	Now, even though he used a general word — food — what he actually gets is something specific — a pizza. That's exactly how
	Upcasting works in Java. You refer to something by its parent type (like food), but behind the scenes, it's really a specific object (like
	pizza). This helps you write flexible and reusable code, without worrying about the exact type every single time.

	That's exactly what Java does in upcasting.
	
	Why Is Upcasting So Important? 🎯
	Upcasting helps us write code that is:
	• Reusable: We can write one function that works for all types of vehicles.
	• Clean: No need to write separate logic for Car, Bike, Bus.
	• Flexible: You can store different objects in the same array or pass them to the same method.
	• Polymorphic: It's the foundation for runtime polymorphism in Java.
*/

/*
 Program 1: Without Upcasting (Direct Instantiation)


class Vehicle {
	public void drive() {
		System.out.println("Drive vehicle to travel!");
	}
}
	
class Car extends Vehicle {
	public void drive() {
		System.out.println("Drive car to travel!");
	}
}
	
public class Travel {
	public static void main(String[] args) {
	Car c = new Car(); // No upcasting here
	c.drive(); // Output: Drive car to travel!
	}
}
*/

/*
 * Program 2: With Upcasting
 */

class Vehicle {
	public void drive() {
		System.out.println("Drive vehicle to travel!");
	}
}
	
class Car extends Vehicle {
	public void drive() {
		System.out.println("Drive car to travel!");
	}
}
	
public class About{
	public static void main(String[] args) {
	Vehicle c = new Car(); // Upcasting happens here
	c.drive(); // Output: Drive car to travel!
	}
}

