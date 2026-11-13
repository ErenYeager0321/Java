package T3_StaticNestedClass;
/*
What Are Static Nested Classes?
A Static Nested Class is a class defined inside another class with the static keyword. Unlike Member Inner Classes, which are tied to the outer class's instance, a Static Nested Class doesn't need an instance of the outer class to exist. It's like your cousin who's part of the family but doesn't need to live with you to be involved in family events.

How to Create a Static Nested Class?
To create a Static Nested Class, you simply define the inner class inside the outer class and use the static keyword. Here's the basic structure:

1. Outer Class: This is the main class.
2. Static Nested Class: Inside the outer class, use the static keyword to define the nested class



How This Code Works:
1. Outer Class (Library): This represents a library. It has a private field libraryName, but the Library class itself is not required to create the Book class.
2. Static Nested Class (Book): This class is defined inside the Library class using the static keyword. The Book class has its own private field bookTitle and a method display() to print the book's title.
3. Using the Static Nested Class:
* In the Main class, we create an instance of the Book class directly without needing to create an instance of the Library class.
* We use Library.Book to refer to the Book class inside the Library class.
How to Use a Static Nested Class?

You can use a Static Nested Class in the following way:

1. Access the outer class: You don't need to create an instance of the outer class to use a Static Nested Class.
2. Create an instance of the nested class: You can create an instance of the nested class using the outer class name.
In the example above:
* We create an instance of the Book class using Library.Book.
* This works because the Book class is static and doesn't need an instance of the Library class.

Why Use Static Nested Classes?

* Independence from Outer Class: Static Nested Classes don't depend on an instance of the outer class. This makes them useful when the inner class needs to be part of the outer class but doesn't need access to the outer class's instance data.
* Memory Efficiency: Since Static Nested Classes don't hold a reference to the outer class's instance, they are more memory-efficient.
* Organization: Static Nested Classes help group related functionality inside the outer class while maintaining the independence of the nested class.

Key Points to Remember:
* A Static Nested Class is a class inside another class defined using the static keyword.
* No instance of the outer class is needed to create an instance of a Static Nested Class.
* It is memory efficient because it does not hold a reference to the outer class instance.
* Static Nested Classes can be used when the class is related to the outer class but doesn't need to access the instance data of the outer class.
Common Interview Questions:
*/

//Outer class
class Library {
	String libraryName ;


	public Library(String libraryName) {
		super();
		this.libraryName = libraryName;
	}


	//Static Nested Class
	static class Book {
		private String bookTitle;
		
		//Constructor for Static Nested Class
		Book(String title) {
		this.bookTitle = title;
		}
		
		void display() {
		System.out.println("Book Title: " + bookTitle);
		}
	}
}	

public class About {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Library l = new Library("City Library");
		
	//Creating an instance of the Static Nested Class (Book) without needing the outer class instance
	Library.Book book1 = new Library.Book("The Java Programming Language");
	book1.display();
	}
}


