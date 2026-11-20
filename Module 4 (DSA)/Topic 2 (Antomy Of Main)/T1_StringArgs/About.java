package T1_StringArgs;
/*
Standard Definition
String[] args is a parameter in the main() method of Java that holds 
command line arguments. These are pieces of data passed to the program 
when you run it from the command line. It allows users to give input to 
the program at the time of execution, making it much more flexible.

Simple Explanation:
Think of String[] args like a mailbox where you can send information or 
instructions to the program. For example, if you want your program to 
show a person's name, instead of writing the name directly in the code, 
you can pass it as a command line argument. This way, you can change the 
name without touching the code every time you run the program.

Passing Arguments via Command Line
To pass arguments to a Java program, you can provide them directly after 
running the program from the command line. Here's how to do it:

1. Compile the Java Program
First, compile your Java program using the following command:
java MyProgram.java

2. Run the Program with Arguments
Next, run your program with the arguments you want to pass. Use the following command:
java MyProgram arg1 arg2 arg3

In this example, arg1, arg2, and arg3 are the values (arguments) that will be passed to the main() method.

Accessing Command Line Arguments
Inside the main() method, you can receive the arguments using the args[] array. Each argument is stored in the array, and you can get it using its position (index). Here's an example:

public class MyProgram {
	public static void main(String[] args) {
	int length = args.length;
		if (length == 0) {
			System.out.println("No arguments were passed.");
		} else {
		for (int i = 0; i < length; i++) {
			System.out.println("Argument " + i + " = " + args[i]);
			}
		}
	}
}

Explanation of the Code:
args.length: This gives the total number of arguments passed to the program.
args[i]: This accesses the argument at position i in the args array.

Running the Program
After compiling the program, you can run it with different arguments.

java MyProgram Hello World Java

Output:
Argument 0 = Hello
Argument 1 = World
Argument 2 = Java

This shows that the program prints each argument passed to it. If no arguments are passed, the program will print "No arguments were passed."

Why the String[] args?
Flexibility: Instead of modifying code every time they want different values, users can simply give these values when running the program.
Flexibility: It lets users provide different types of information, like a file name or a number, making the program more adaptable.
Simplicity: Executing With command-line arguments, users can change the program behavior without needing to change the code itself.

Real-Life Analogy: A Restaurant Order
Think of String[] args like ordering food at a restaurant. The menu (the program) is fixed, but the order details (command-line arguments) can change. You can specify how you want your food prepared.

Menu: Choose your food (program).
Order Details: Specify how spicy, the price you pay, or add extra toppings (command-line arguments).

Key Takeaways:
String[] args lets your program accept information when you run it.
It makes the program flexible because you can give input without changing the code.
You can use the String[] args to fetch information about your program.
You can get the number of arguments passed to the program using args.length.
You can get each argument by its position using its index (e.g., args[0], args[1]).
You can use a loop to iterate through all the arguments passed to the program.
You can use if-else statements to check if any arguments were passed or to handle specific arguments.
You can use command-line arguments to pass information to your program, such as file names, configuration settings, or user preferences.
This allows you to create more dynamic and interactive programs.
You can change the behavior of your program without modifying the source code.
This is especially useful for testing different scenarios or for automating tasks.
You can also use command-line arguments to pass data to your program that will be used in calculations or other operations.
For example, you could pass the radius of a circle as a command-line argument and then calculate its area.
The possibilities are endless!
*/
public class About {
	
}
