package T8_OverRidden_And_ChildSpecific_Behaviour;

/*
	Let's know the Types of Methods in Inheritance?
	In Java inheritance, there are three main types of methods you will work with:
	1. Inherited Methods - These are methods defined in the parent class 
	(superclass) that the child class can use directly without changing 
	anything.
	2. Overridden Methods - These are methods that the child class changes 
	(overrides) to provide a different version of the behavior.
	3. Child-Specific Methods - These methods are created only in the child 
	class and do not exist in the parent class. They provide new behavior 
	unique to the child class.
	
	Why these methods are Important?
	* Helps you understand how behavior is passed from parent class to child class.
	* Makes it clear when you should reuse, change, or create new methods.
	* Helps avoid confusion when reading or writing code in real-world projects.
	* These concepts are frequently asked in Java interviews and coding tests.
*/

class Employee {
	void work() {
		System.out.println("Employee is working");
	}
	void attendMeeting() {
		System.out.println("Employee is attending a meeting");
	}
}
	
	class Manager extends Employee {
	// Overridden method
	void attendMeeting() {
		System.out.println("Manager is leading a meeting");
	}
	
	// Child-specific method
	void conductReview() {
		System.out.println("Manager is conducting a performance review");
	}
}
	
public class About {
	public static void main(String[] args) {
	Manager myManager = new Manager();
	
	// Calling the inherited method
	myManager.work(); // Output: Employee is working
	
	// Calling the overridden method
	myManager.attendMeeting(); // Output: Manager is leading a meeting
	
	// Calling the child-specific method
	myManager.conductReview(); // Output: Manager is conducting a performance review
	}
}

