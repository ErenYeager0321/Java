package T910_Access_Specifier;

//package com.library.data;

class Book {
	public String title = "1984";
}

//package com.library.app;
//import com.library.data.Book;

public class P1_Public_AS {
	public static void main(String[] args) {
	Book myBook = new Book();
	System.out.println("Title: " + myBook.title);
	}
}
