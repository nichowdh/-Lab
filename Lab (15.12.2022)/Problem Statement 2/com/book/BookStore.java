package com.book;

import java.util.ArrayList;

public class BookStore { // book store class
	boolean found, published;
	ArrayList<Book> b_list = new ArrayList<>();

	public void addBook(Book b) { // 1st method
		b_list.add(b);
	}

	public void searchByTitle(String title) { // 2nd method
		for (Book b : b_list) {
			if (title.contains(b.getTitle())) {
				System.out.println(b);
				break;
			} else {
				System.out.println("not found");
				break;
			}
		}
	}

	public void searchByAuthor(String author) { // 3rd method
		for (Book b : b_list) {
			if (author.contains(b.getAuthor())) {
				System.out.println(b);
				break;
			} else {
				System.out.println("not found");
				break;
			}
		}
	}

	public void displayAll() { // 4th method
		// traversing
		for (Book b : b_list) {
			System.out.println(b);
		}
	}

}
