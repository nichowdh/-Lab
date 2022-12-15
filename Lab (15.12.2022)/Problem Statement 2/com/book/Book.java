package com.book;

public class Book {// main book class

	String bookID, title, author;

	public Book(String bookID, String title, String author) {// parameterized constructor

		// with try block
		try {
			// conditon for bookID
			if ((bookID.startsWith("B") && (bookID.length() == 4))) { // condition
				this.bookID = bookID; // if condition meets
			} else {
				throw new InvalidBookException("book id should be start with 'B' and lenght of 4"); // throws exception
			}

		} catch (Exception e) { // exception handling
			System.out.println(e);
		}
	}

	// getters for all data members
	public String getBookID() {
		return bookID;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String toString() { // for printing all details of Book objects
		System.out.println("Book [bookID='" + bookID + "', title='" + title + "', author='" + author + "']");
		return toString();
	}

}

//creating custom exception class
class InvalidBookException extends Exception {
	public InvalidBookException(String s) { // parameterized constructor
		super(s);
	}
}