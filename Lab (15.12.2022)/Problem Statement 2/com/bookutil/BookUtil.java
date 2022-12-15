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
			String bookID = scanBookID.nextLine();

			System.out.println("Enter title:");
			Scanner scanTitle = new Scanner(System.in);
			String title = scanTitle.nextLine();

			System.out.println("Enter author:");
			Scanner scanAuthor = new Scanner(System.in);
			String author = scanAuthor.nextLine();

			obj.addBook(new Book(bookID, title, author));
			obj.displayAll();

			if (i != 4) { // condition for close scanner inputs
				continue;
			}

			scanBookID.close();
			scanTitle.close();
			scanAuthor.close();

		}

		System.out.println("Enter title to search book: ");
		String title = s.nextLine();
		System.out.println("Searched by title");
		obj.searchByTitle(title);

		System.out.println("Enter author name to search book");
		String author = s.nextLine();
		System.out.println("Searched by author");
		obj.searchByAuthor(author);
		// display all books with details
		System.out.println("Printing all books:");
		obj.displayAll();
		// close all inputs
		s.close();
	}

}
