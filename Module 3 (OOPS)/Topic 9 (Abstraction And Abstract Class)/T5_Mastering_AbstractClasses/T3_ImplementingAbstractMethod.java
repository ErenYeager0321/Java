package T5_Mastering_AbstractClasses;
/*
	3. Implementing Abstract Methods:
When a class extends an abstract class, it must implement all the abstract methods of the parent class, unless the subclass is also
abstract. This ensures that every subclass has the specific behavior that was declared in the parent abstract class.
Example:
abstract class Animal {
abstract void makeSound();
}
class Dog extends Animal {
void makeSound() {
System.out.println("Bark");
}
}
abstract class Cat extends Animal {
// Does not implement makeSound method
}
In this example:
Dog provides an implementation of the abstract method makeSound().
Cat does not implement the method, as it's abstract, leaving it for a concrete subclass to implement.
*/

abstract class Animal {
	abstract void makeSound();
}

class Dog extends Animal {
	void makeSound() {
	System.out.println("Bark");
	}
}

abstract class Cat extends Animal {
// Does not implement makeSound method
}

public class T3_ImplementingAbstractMethod {

}
