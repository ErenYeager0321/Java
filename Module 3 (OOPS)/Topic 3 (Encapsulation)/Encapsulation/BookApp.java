package Encapsulation;

public class BookApp {
	public static void main(String[] args) {
		Book b = new Book();
		/*  Thats without Private ,  we can access it easily , anyone can */
		// b.pageNo = 100;
		// System.out.println("Book with " + b.pageNo + " pages is of 200rs");
	
		b.setPage(-100);
		System.out.println("Book with " + b.getPage() + " pages is of 200rs");
	
	} 
}
