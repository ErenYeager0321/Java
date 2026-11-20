package T2_MainMethod;
/* *IMP Q For Interview -  Explain Main Method
 * Ans - The main() method is the entry point of a Java program. 
    	 It is the method from where Java starts executing the program.
		 What Exactly is the main() Method in Java?
	
	*Syntax of Main Method
	public static void main(String[] args) {
    System.out.println("Hello Java");
	}

Explanation of Each Keyword

1. public
Meaning: Access Modifier.
It allows the JVM to access the main method from outside the class.
In simple words, JVM can access it from anywhere.

2. static
Meaning: Static keyword.
It allows the JVM to call the main method without creating an object of the class.
For example:
Main.main(args);
No object is required.

3. void
Meaning: Return type.
It means the main method does not return any value.
For example, it does not return an integer, String, or any other value.

4. main
Meaning: Method name.
It is the specially recognized entry-point method name used by the JVM to start a conventional Java application.

5. String[] args
String[] args
Meaning: Command-line arguments.
It is an array of String values used to receive input from the command line when running a Java program.
Example:
public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
If you run the program with Hello, output will be:
Hello

Standard Definition:
The main() method is a special method that serves as the entry point of 
every Java application. It's where the Java program begins execution. 
Without it, your program won't know where to start!

Simple Explanation:
Think of the main() method as the first step of a job interview:
1. Prepare your resume - This is like input. You gather all the necessary details about yourself to begin.
2. Apply to companies - This is like processing. You take your resume and apply it to different job opportunities.
3. Attend interviews - These are like the steps to solve the problem. You meet with companies, answer questions, and try to impress them.
4. Receive job offers - This is like the output. Based on your efforts, you get job offers, which is the result of your work.

In the same way, the main() method in Java starts your program, takes inputs, processes them, and gives the output.
Structure of the main() Method
The main() method has a specific way it needs to be written so that Java can understand it as the starting point of the program. This special way of writing it is called its "signature."
The usual signature looks like this:
public static void main(String[] args)
// Everything will Have to Explain
Breakdown of the Signature:
1. public: This access modifier makes the main() method accessible to anyone, including the JVM, so it can start running the program.
2. static: The static keyword means that the method belongs to the class, not to a specific object of the class. This is important because the main() method runs without creating an instance of the class.
3. void: The main() method doesn't return any value. It simply starts the program and runs the instructions inside it without sending anything back.
4. String[] args: This is an array that holds command-line arguments. When you run the program from the terminal, you can pass additional information through this array. Although you won't use it often in simple programs, it can be really helpful in complex ones!

*/
public class About {

}
