package T6_Hybrid_Inheritance;

/*   Hybrid Inheritance  */

class LibraryItem {//Base Class
	String title;
	String itemId;
	
	public void displayDetails() {
	System.out.println("Title: " + title + ", Item ID: " + itemId);
	}
}
	
class Book extends LibraryItem {//Child Single Inheritance 
	String author;
	public void displayBookDetails() {
	displayDetails();
	System.out.println("Author: " + author);
	}
}
	
class Magazine extends LibraryItem {//Child Hierarchical Inheritance - Both Inherit From Same Base Class
	String issue;
	public void displayMagazineDetails() {
	displayDetails();
	System.out.println("Issue: " + issue);
	}
}
	
class ScienceBook extends Book {//Child Multi Level Inheritance - Inherit From Book Class
	String field;
	public void displayScienceBookDetails() {
	displayBookDetails();
	System.out.println("Field: " + field);
	}
}

public class P1_Library_Management {
	public static void main(String[] args) {
		ScienceBook scienceBook = new ScienceBook();
		scienceBook.title = "Physics Fundamentals";
		scienceBook.itemId = "B1001";
		scienceBook.author = "Dr. Smith";
		scienceBook.field = "Physics";
		scienceBook.displayScienceBookDetails();

		System.out.println("-----");

		Magazine magazine = new Magazine();
		magazine.title = "Tech Monthly";
		magazine.itemId = "M2001";
		magazine.issue = "July 2024";
		magazine.displayMagazineDetails();
		}
}
