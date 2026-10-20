package T7_This_Constructor_Chaining;
/*
	Standard Definition:
	this() is a special keyword in Java used to call another constructor 
	of the same class from within a constructor. It helps in constructor 
	chaining, allowing code reusability and reducing duplication.
	
	Why Is It Important?
	• It helps us write less code by reusing logic from one constructor in another.
	• It keeps all the constructor logic in one place, so we don't repeat the same lines.
	• It makes the program easier to understand and read.
	• If we need to change something later, we update it in one constructor only, not in many places.
	• It reduces errors and makes the code more clean and professional.
*/

class Book {
	String title;
	String author;
	int year;
	
	// Constructor to initialize all details
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
		System.out.println("Creating Book: " + this.title + ", " + this.author + ", " + this.year);
	}
	
	// Constructor with title and author only
	public Book(String title, String author) {
		this(title, author, 2020); // Calls the main constructor with a default year
	}
	
	// Default constructor
	public Book() {
		this("Unknown Title", "Unknown Author"); // Calls the constructor with two parameters
	}
}
	
public class About {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Book myBook = new Book(); // Uses default constructor
		}
}
