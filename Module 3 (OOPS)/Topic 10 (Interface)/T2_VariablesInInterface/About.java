package T2_VariablesInInterface;
/*
public interface Shape {
	float pi = 3.147f;
	void calculateArea();
}

By Default compiler Convert them into this(down)

public abstract interface Shape { By Default All Interfaces present is public abstract
	public static final float pi = 3.147f; By Default All *Variables present is public static Final Variable
	public abstract void calculateArea(); By Default All Methods present is public abstract methods
}

	Variables in Interfaces Are Constant
	1. What is the role of variables in an interface?
	Answer:
	In an interface, variables are constants. They are implicitly public, 
	static, and final, meaning their values cannot be changed once assigned. 
	They provide shared values across all classes that implement the 
	interface, ensuring consistency.
	
	In an interface, any variable you declare is automatically a constant. 
	This means you cannot change the value of a variable once it's set. 
	In Java, this is done by default, as every variable in an interface 
	is implicitly public, static, and final.
	
	* Public: The variable is accessible from anywhere in the program.
	* Static: It belongs to the interface itself, not any particular instance of a class.
	* Final: The variable's value cannot be changed after it's set.
	
	Example:
	
	interface Vehicle {
	// Declaring a variable
	int MAX_SPEED = 120; // This is a constant (implicitly public, static, final)
	cant change the value in class bcz by default variales are Final in An interface
	}
	
	class Car implements Vehicle {
		public void displaySpeed() {
		// Using the constant from the interface
		System.out.println("The maximum speed is: " + MAX_SPEED + " km/h");
		}
	}
	
	Here, the MAX_SPEED variable in the Vehicle interface is a constant. You can use it in any class that implements the
	interface, like the Car class in the example above. But you cannot change MAX_SPEED because it's final.
*/
public class About {

}
