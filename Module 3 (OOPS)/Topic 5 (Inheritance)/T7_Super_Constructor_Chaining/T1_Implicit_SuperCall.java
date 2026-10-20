package T7_Super_Constructor_Chaining;

/*  About - 
	Standard Definition:
	In Java, implicit super() refers to the automatic call to the no-argument
	constructor of the parent class that the compiler inserts at the beginning of a
	subclass constructor if no super() or this() is explicitly written. This ensures that
	the parent class is properly initialized before the child class.
	
	Why Is It Important?
	• It keeps the object setup complete and correct
	• It avoids repeating code from the parent class
	• It helps you understand how things work in the background
	• It prepares the parent part of the object before the child part
*/


class Animal2 {
	// Constructor of Animal class
	public Animal2() {
	System.out.println("An animal is created.");
	}
}

class Dog extends Animal2 {
	// Constructor of Dog class
	public Dog() {
	// The compiler implicitly inserts super() here
	System.out.println("A dog is created.");
	}
}
	
public class T1_Implicit_SuperCall {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Dog myDog = new Dog(); // Creating an instance of Dog
		}
}
