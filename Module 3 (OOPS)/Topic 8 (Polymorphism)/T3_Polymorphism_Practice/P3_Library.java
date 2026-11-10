package T3_Polymorphism_Practice;

class Book {
	public void checkOut() {
		System.out.println("Book checked out quickly!");
	}
	public void returnBook() {
		System.out.println("Book returned immediately!");
	}
	public void catalog() {
		System.out.println("Book cataloged efficiently!");
	}
}

public class P3_Library {
	public static void main(String[] args) {
		Book b = new Book();
		managebook(b);
	}
	
	public static void managebook(Book b) {
		b.checkOut();
		b.returnBook();
		b.catalog();
	}
}
