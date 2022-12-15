package com.book;

public class Book { // book class
	// instance variables
	int bookID;
	String title, author;

//parameterized constructor to intialize book
	public Book(int id, String title, String a) {
		this.bookID = id;
		this.title = title;
		this.author = a;
	}
}