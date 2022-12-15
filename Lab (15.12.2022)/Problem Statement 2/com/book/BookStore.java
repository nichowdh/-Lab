package com.book;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore { // book store class
	boolean found, published;
	ArrayList<Book> al1 = new ArrayList<Book>();

	public void addBook(Book b) { // 1st method
		al1.add(b);
	}
	// Search book based on title

	public void searchByTitle(String title) { // 2nd method
		Iterator<Book> it = al1.iterator();
		while (it.hasNext()) {
			Book obj = (Book) it.next();
			if (obj.title == title) {
				System.out.println("Book found=");
				System.out.println(obj.title + " " + obj.author);
			}
		}
	}

	// Search book based on author
	public void searchByAuthor(String a) { // 3rd method
		Iterator<Book> it = al1.iterator();
		while (it.hasNext()) {
			Book obj = (Book) it.next();
			if (obj.author == a) {
				System.out.println("Book found=");
				System.out.println(obj.title + " " + obj.author);
			}
		}
	}

	public void displayAll() { // 4th method
		Iterator<Book> it = al1.iterator();
		while (it.hasNext()) {
			Book obj = (Book) it.next();
			System.out.println(obj.bookID + " " + obj.title + " " + obj.author);

		}
	}

}