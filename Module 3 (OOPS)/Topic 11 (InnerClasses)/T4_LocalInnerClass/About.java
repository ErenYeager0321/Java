package T4_LocalInnerClass;
/*
What Are Local Classes?
A Local Class is a class defined inside a method of the outer class. Unlike other inner classes, a Local Class exists only during the execution of the method in which it is defined. Once the method finishes executing, the local class is no longer available. It's like having a helper who comes in to do a specific job and leaves when the job is done.
How to Create a Local Class?
To create a Local Class, you define the class inside a method of the outer class. Here's the basic structure:
1. Outer Class: The main class where the method resides.
2. Local Class: The class defined inside a method of the outer class.

Example:
Let's look at an example to understand how to create and use a Local Class.

How This Code Works:
1. Outer Class (Library): Represents the library. It has a method organizeBooks() where we will define our Local Class.
2. Local Class (Book): Defined inside the organizeBooks() method. This class is used to represent a book. It has a title field and a method display() to print the book's title.
3. Using the Local Class:
* Inside the organizeBooks() method, we create an instance of the Book class and call its display() method.
* In the Main class, we create an object of the outer class Library and call the organizeBooks() method to see the result.

How to Use a Local Class?
You can use a Local Class in the following way:
1. Create the outer class first, create an instance of the outer class.
2. Define the local class inside a method. Define the class inside the method where it's needed.
3. Use the local class. You can create an instance of the local class and use it inside the method.

In the example above:
* We first create an instance of the Library class.
* Inside the organizeBooks() method, we define and use the Local Class Book.

Why Use Local Classes?
* Temporary Use: Local classes are useful when you need a class only within a specific method. They don't stick around after the method finishes, so they help keep the code clean and focused on a particular task.
* Encapsulation: Since the class is local to the method, it can only be used inside the method, ensuring that it doesn't interfere with the rest of the code.
* Access to Method Variables: Local classes can access final or effectively final variables from the enclosing method. This is helpful when you need a class to perform tasks using data from the method.

Key Points to Remember:
* A Local Class is defined inside a method of the outer class.
* It is temporary and only exists during the method's execution.
* Local classes can access final or effectively final variables from the outer method.
* They are useful for short-term tasks within a method, keeping the code cleaner and more organized.

*/

class Library {
	void organizeBooks() {
		class Book { // Local class (temporary guest)
			String title;
			
			Book(String title) {
			this.title = title;
			}
		
			void display() {
			System.out.println("Book Title: " + title);
			}
		}
	
	// Creating an instance/Obj of the local class ,  it should be crated inside the Method
	Book book1 = new Book("The Java Programming Language");
	book1.display();
	}
}

public class About {
	public static void main(String[] args) {
	// Creating an instance of the outer class
	Library library = new Library();
	// Calling the method that uses the local class
	library.organizeBooks();
	}
}

