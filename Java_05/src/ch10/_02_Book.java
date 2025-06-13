package ch10;

// p364,366
public class _02_Book {
	
	int bookNumber;
	String bookTitle;
	
	_02_Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookNumber + "," + bookTitle;
	}

}
