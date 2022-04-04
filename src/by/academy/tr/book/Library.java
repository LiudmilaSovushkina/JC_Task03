package by.academy.tr.book;

public class Library {
	private String libraryName;
	private Book[] booksList;

	public Library(String libraryName, Book[] booksList) {
		this.libraryName = libraryName;
		this.booksList = booksList;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setBooksList(Book[] booksList) {
		this.booksList = booksList;
	}

	public Book[] getBooksList() {
		return booksList;
	}
}
