package by.academy.tr.book;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publisher;
	private int yearPublished;
	private int numberOfPages;
	private double price;
	private String binding;

	public Book(int id, String title, String author, String publisher, int yearPublished, int numberOfPages,
			double price, String binding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.binding = binding;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public String getBinding() {
		return binding;
	}

	public String toString() {
		String s = id + ": \"" + title + "\", " + author + "/ - " + publisher + ", " + yearPublished + " - "
				+ numberOfPages + "p.- $" + price + "/" + binding;
		return s;
	}
}
