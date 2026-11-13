package T3_Methods;
/*
What's a Method in an Interface?
Think of an interface method like a wish list. The interface tells you what 
needs to be done, but it doesn't tell you how to do it. It's like your mom 
telling you to clean your room but not explaining exactly how you should do 
it. You can choose how to clean your room: Do you want to vacuum first? Or 
maybe pick up the clothes? It's up to you!

How Do Methods in an Interface Work?
In an interface, methods don't have any code inside them. They only have 
a signature (the method name and the parameters) and no implementation. 
This means, when a class uses the interface, it must write the code 
(the implementation) for those methods.

Why Use Methods in an Interface?
Methods in interfaces help us in several ways:

1. Flexibility: Interfaces allow different classes to follow the same set of rules (methods) while allowing them to implement them in their own way.
2. Consistency: The interface ensures that all classes that implement it will have the same methods.
3. Polymorphism: You can write code that can work with different objects (classes) that follow the same interface, making the code more flexible.

Let's Know the Types of Methods in an Interface:
There are different types of methods in an interface in Java:

1. Abstract Methods
2. Default Methods
3. Static Methods

1. Abstract Methods
Abstract methods are the most common type of methods in an interface. They are simply method declarations (with no body or code inside). This means the method only tells you what needs to be done, but not how to do it. Any class that implements the interface must define how to perform the method.
Example:

interface Animal {
	void makeSound(); // Abstract method with no code
}
class Dog implements Animal {
	public void makeSound() {
	System.out.println("Bark");
	}
}
class Cat implements Animal {
	public void makeSound() {
	System.out.println("Meow");
	}
}
public class Main {
	public static void main(String[] args) {
	Animal myDog = new Dog();
	myDog.makeSound(); // Output: Bark
	Animal myCat = new Cat();
	myCat.makeSound(); // Output: Meow
	}
}

2. Default Methods
Starting from Java 8, interfaces can also have default methods. These are methods that already have a predefined implementation (code) in the interface. If a class
implements the interface, it can use the default method without changing it. However, the class can also override the method if it wants to provide its own
behavior.
Example:

interface Vehicle {
	void start(); // Abstract method
	// Default method with a predefined implementation
	default void stop() {
	System.out.println("Vehicle is stopping.");
	}
}
class Car implements Vehicle {
	public void start() {
	System.out.println("Car is starting.");
	}
}
public class Main {
	public static void main(String[] args) {
	Vehicle myCar = new Car();
	myCar.start(); // Output: Car is starting.
	myCar.stop(); // Output: Vehicle is stopping.
	}
}

3. Static Methods
Interfaces can also have static methods. These methods belong to the interface itself, not to any object of a class that implements the interface. Static methods can be called directly
on the interface, without needing to create an object of a class.
Example:

interface Calculator {
	// Static method in an interface
	static int add(int a, int b) {
	return a + b;
	}
}
public class Main {
	public static void main(String[] args) {
	int result = Calculator.add(5, 3); // Output: 8
	System.out.println(result);
	}
}
• The add() method is static and can be called directly from the Calculator interface, without needing an object.
Real-Life Analogy for Methods in an Interface
Imagine you are planning a party, and you have a party checklist (this is your interface). The checklist tells you what needs to be done — like:
• Invite guests
• Order food
• Set up decorations

But it doesn't tell you how to do these tasks. You can invite guests via email, phone, or social media. You can order food by calling a restaurant or using an app. The checklist doesn't
care how you do these tasks — it just tells you what needs to be done.
In the same way, methods in an interface tell the class what to do, but the class can decide how to do it.

Key Points to Remember:
• Abstract methods define what should be done, and the class provides the implementation for them.
• Default methods have a predefined implementation in the interface. Classes can use them or override them.
• Static methods belong to the interface itself and can be called without creating an instance of a class.
*/
public class About {

}
