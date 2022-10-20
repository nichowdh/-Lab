package problem3;

//Program to create library book Management system
class Library { // class
	// daa variables
	private int bookId;
	private String bookName, bookAuthor;

	// constructor
	public void addBook(int bookId, String bookName, String bookAuthor) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public void dispenseBook(String name) { // method
		if (name == bookName) { // if condition
			// printing part
			System.out
					.println("Book_Id: " + bookId + "" + "Book_Name: " + bookName + "" + "Book_Author: " + bookAuthor);
		} else { // else condition
			System.out.println("Book not found");
		}
	}

}

public class BookManagement { // main class
	public static void main(String[] args) { // main method
		Library obj1 = new Library(); // creating object
		obj1.addBook(78, "Physics", "P.K Das"); // passing values
		obj1.dispenseBook("Physics");
		Library obj2 = new Library(); // creating object
		obj2.addBook(79, "Chemistry", "S.B Sen"); // passing values
		obj2.dispenseBook("Chemistry");
		obj1.dispenseBook("Math");
		obj2.dispenseBook("Biology");
	}

}
