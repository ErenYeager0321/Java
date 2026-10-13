package T7_Cons_Overloading;

public class About {
	/*
	Constructor Overloading --> When Method Have Same Name With Different Signatures/Parameters
								  Create objects with different initial states
								  No return type, not even void
								  Called automatically via new
								  Must match the class name
	Method Overloading --> Perform the same operation with different inputs
							Any valid method name
							Can have different return types
		
	  
  * Standard Definition:
	Constructor overloading in Java means having more than one constructor in the
	same class — but each constructor has a different set of parameters.
	
	Simple Explanation:
	It's like placing an order at a coffee shop:
	• You can say, "Just coffee."
	• Or "Coffee with milk."
	• Or "Coffee with milk and sugar."
	The barista knows how to make each one — even though it's all just "coffee."
	In Java, constructor overloading lets you create objects with different amounts of
	information, while still using the same class.*/
	
	/*class Message {
	 * 
		// Constructor 1: No parameters
		public Message() {
		System.out.println("Default Message: Hello!");
		}
		
		// Constructor 2: One string parameter
		public Message(String msg) {
		System.out.println("Message: " + msg);
		}
		
		// Constructor 3: One string and one integer
		public Message(String msg, int times) {
		System.out.println("Message: " + msg);
		System.out.println("Reminders: " + times);
		}
	}
	
	public class TestMessage {
		public static void main(String[] args) {
		Message defaultMsg = new Message(); // Uses default
		constructor
		Message personalMsg = new Message("Hi, how are you?"); // Uses
		constructor with one parameter
		Message reminderMsg = new Message("Kindly pay bill", 3); // Uses
		constructor with two parameters
	}
	*/
}
