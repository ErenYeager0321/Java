package T2_MemberInnerClass;

class Library {
	private String name;
	
	public Library(String name) {
	this.name = name;
	}
	

	class Book {
		private String title;
		private String author;
		
		public Book(String title, String author) {
		this.title = title;
		this.author = author;
		}
		
		public void displayDetails() {
		System.out.println("Book: " + title + " by " + author + ", available at " + name);
		}
	}
}
public class P3_Library {
	public static void main(String[] args) {
		Library l = new Library("Central Library");
		Library.Book b = l.new Book("Spirited Away" , "Studio Ghibli");
		b.displayDetails();
	}
}
