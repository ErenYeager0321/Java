package T1_Has_A_Realtionship;

class Book1 {
	Chapter chapter = new Chapter();
}

class Chapter {
	String title;
	String content;
}

public class T2_Composition {
	public static void main(String[] args) {

		// Create a book and add the chapter
		Book1 myBook = new Book1();
		myBook.chapter.title = "Introduction to Java";
		myBook.chapter.content = "Java is a high-level programming language...";

		// Read the chapter
		System.out.println("Reading Chapter: " + myBook.chapter.title);
		System.out.println("Content: " + myBook.chapter.content);
		}
}
