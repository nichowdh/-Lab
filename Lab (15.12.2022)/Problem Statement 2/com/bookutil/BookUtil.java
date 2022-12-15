package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil { // book util class
	public static void main(String[] args) { // main method
		BookStore obj = new BookStore();
		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) { // for loop
			// User Inputs

			System.out.println("For book-" + i);
			System.out.println("Enter bookID:");
			Scanner scanBookID = new Scanner(System.in);
			int bookID = scanBookID.nextInt();

			System.out.println("Enter title:");
			Scanner scanTitle = new Scanner(System.in);
			String title = scanTitle.nextLine();

			System.out.println("Enter author:");
			Scanner scanAuthor = new Scanner(System.in);
			String author = scanAuthor.nextLine();

			obj.addBook(new Book(bookID, title, author));
			obj.displayAll();

		}
		obj.displayAll();
		obj.searchByAuthor("Niladri"); // passing value
		obj.searchByTitle("Java");

	}

}
