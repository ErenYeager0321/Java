package T3_AbstractMethods;
/*
Standard Definition:
An abstract method is a method that is declared in an abstract class but does not have a body or implementation. It's like a promise that any class extending the abstract class must provide an implementation for that method.

Simple Explanation:
Imagine you are in a group project, and your teacher gives you a template with some sections left empty. Your job is to fill in the details in those sections. The template is the abstract method, and you, as the student (subclass), need to provide the details (method implementation).

Why Are Abstract Methods Important?
* Flexibility: Abstract methods let us define a general structure for our classes, while allowing each subclass to give its own specific details.
* Consistency: They help us make sure all subclasses follow the same pattern. For example, every type of Mentor will have to provide a way to trainInterns().
* Reusability: By creating an abstract method, we can use it in many places, allowing different parts of our program to work together without having to repeat the same details.
* Organization: It helps keep our program organized. We can focus on the structure without worrying about the details right away.
*/
abstract class KodnestMentor {
	// Declare abstract methods that all mentors must implement
	public abstract void teachConcepts();
	public abstract void groomForDrives();
}

class JavaMentor extends KodnestMentor {
	// Implement methods specifically for Java mentors
	public void teachConcepts() {
	System.out.println("Java mentor teaches Java concepts.");
	}
	public void groomForDrives() {
	System.out.println("Java mentor grooms for back-end drives.");
	}
}

class ReactMentor extends KodnestMentor {
	// Implement methods specifically for React mentors
	public void teachConcepts() {
	System.out.println("React mentor teaches React concepts.");
	}
	public void groomForDrives() {
	System.out.println("React mentor grooms for front-end drives.");
	}
}

public class About {
	public static void main(String[] args) {
	KodnestMentor javaMentor = new JavaMentor();
	KodnestMentor reactMentor = new ReactMentor();
	javaMentor.teachConcepts(); // Output: Java mentor teaches Java concepts.
	javaMentor.groomForDrives(); // Output: Java mentor grooms for back-end drives.
	reactMentor.teachConcepts(); // Output: React mentor teaches React concepts.
	reactMentor.groomForDrives(); // Output: React mentor grooms for front-end drives.
	}
}

