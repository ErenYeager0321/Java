package T9_Program_Flow;

public class About {
    /*
		Standard Definition:
	Java Program Flow refers to the exact sequence in which Java executes different parts of your code — from class loading to object creation to method execution.
	
	Simple Explanation:
	Think of your Java program like a stage play:
	The play starts (main() method runs).
	New actors (objects) enter — they put on makeup (instance variables), change costumes (instance blocks), and then say their first line (constructor).
	Then, the story progresses through scenes (methods).
	Why is It Important for You?
	When you know the flow:
	You know what happens before and after main()
	You understand how objects are built step by step
	You see the difference between static and instance behaviors
	You gain confidence in what your program is doing
	Without understanding this, it’s easy to get confused by outputs that don’t match what you expected.
	Understanding the Flow Through an Example
	
	Let’s walk through a program line by line.
	
	public class FlowExample {
	
	    // Static variable
	    static int staticVar = 10;
	
	    // Instance variable
	    int instanceVar = 20;
	
	    // Static block
	    static {
	        System.out.println("Static block executed. staticVar = " + staticVar);
	        staticVar = 30;
	    }
	
	    // Instance block
	    {
	        System.out.println("Instance block executed. instanceVar = " + instanceVar);
	        instanceVar = 40;
	    }
	
	    // Static method
	    static void staticMethod() {
	        System.out.println("Static method executed. staticVar = " + staticVar);
	    }
	
	    // Instance method
	    void instanceMethod() {
	        System.out.println("Instance method executed. instanceVar = " + instanceVar);
	    }
	
	    // Constructor
	    public FlowExample() {
	        System.out.println("Constructor executed. instanceVar = " + instanceVar);
	    }
	
	    // Main method
	    public static void main(String[] args) {
	        System.out.println("Main method started.");
	
	        // Calling static method
	        staticMethod();
	
	        // Creating an instance of FlowExample
	        FlowExample example = new FlowExample();
	
	        // Calling instance method
	        example.instanceMethod();
	
	        System.out.println("Main method ended.");
	    }
	}
	
	Flow of Execution Explained:
	Loading the Class:
	The program starts with the loading of the FlowExample class by the Java Virtual Machine (JVM).
	Static variables and static blocks are executed first. This happens only once when the class is loaded.
	Static Variable Initialization:
	
	The static variable staticVar is initialized to 10.
	
	Output: (Nothing yet, because this is just variable initialization).
	Static Block Execution:
	The static block is executed immediately after static variables are initialized.
	The static block prints the current value of staticVar (which is 10) and then updates staticVar to 30.
	
	Output:
	Static block executed. staticVar = 10
	Main Method Execution:
	The JVM then starts executing the main() method because this is the entry point of the program.
	
	Output:
	
	Main method started.
	Static Method Execution:
	The staticMethod() is called from the main() method.
	The method prints the current value of staticVar, which is 30 (updated by the static block).
	
	Output:
	
	Static method executed. staticVar = 30
	Object Creation (FlowExample):
	When new FlowExample() is called, the following steps occur in order:
	
	a. Instance Variable Initialization:
	The instance variable instanceVar is initialized to 20.
	
	Output: (Nothing yet, because this is just variable initialization).
	
	b. Instance Block Execution:
	The instance block is executed immediately after instance variables are initialized.
	The instance block prints the current value of instanceVar (which is 20) and then updates instanceVar to 40.
	
	Output:
	Instance block executed. instanceVar = 20 
	c. Constructor Execution:
	The constructor is executed after the instance block.
	The constructor prints the current value of instanceVar, which is 40 (updated by the instance block).
	
	Output:
	
	Constructor executed. instanceVar = 40
	
	Instance Method Execution:
	The instanceMethod() is called on the newly created object.
	The method prints the current value of instanceVar, which is 40.
	
	Output:
	Instance method executed. instanceVar = 40
	Completion of Main Method:
	Finally, the main() method prints a message indicating it has ended.
	
	Output:
	
	Main method ended.
	The final output of the program will be:
	Static block executed. staticVar = 10
	Main method started.
	Static method executed. staticVar = 30
	Instance block executed. instanceVar = 20
	Constructor executed. instanceVar = 40
	Instance method executed. instanceVar = 40
	Main method ended.
	
	Real-Life Analogy:
	Think of this program like starting your day.
	When you wake up, the room lights turn on automatically (like static block)
	You begin your morning routine (like main method)
	You check your to-do list (static method)
	You make your breakfast — you gather ingredients (instance variable), follow steps (instance block), and finish cooking (constructor)
	You finally sit down to eat (method call)
	This structure helps you understand that every action happens in a sequence — and Java works exactly the same way.
	
	Key Takeaways:
	Static blocks run once when the class is loaded.
	main() is the first method that runs in your program.
	Creating an object triggers:
	Instance variable initialization
	Instance block
	Constructor
	Instance methods can only be used after the object is created.
	Java always follows the same order — so once you learn it, you won’t forget it.
    */
}
