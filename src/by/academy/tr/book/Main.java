package by.academy.tr.book;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book[] booksList = new Book[4];
		booksList[0] = new Book(1, "The Java Handbook", "Patrick Naughton, Michael Morrison", "Osborne/McGraw-Hill",
				1996, 424, 27.95, "hardcover");

		booksList[1] = new Book(2, "Thinking in Java", "Bruce Eckel", "Prentice Hall", 1998, 1152, 39.95, "hardcover");
		booksList[2] = new Book(3, "The Java Language Specificationa", "James Gosling , Bill Joy, Guy Steele",
				"Addison-Wesley", 1997, 720, 31.05, "hardcover");
		booksList[3] = new Book(4, "The Java Programming Language, 2nd Edition", "Ken Arnold, James Gosling",
				"Addison-Wesley", 1998, 464, 34.75, "hardcover");

		sortAuthor(booksList);
		sortPublisher(booksList);
		sortYearPublished(booksList, sc);
	}

	// список книг заданного автора

	public static void sortAuthor(Book[] booksList) {

		System.out.println("Книги автора <Bruce Eckel>:");

		for (int i = 0; i < booksList.length; i++) {
			String author = booksList[i].getAuthor();
			if (author.equals("Bruce Eckel")) {
				System.out.println(booksList[i]);
			}
		}
	}

	// список книг, выпущенных заданным издательством

	public static void sortPublisher(Book[] booksList) {

		System.out.println("\nКниги издательства <Addison-Wesley>:");

		for (int i = 0; i < booksList.length; i++) {
			String publisher = booksList[i].getPublisher();
			if (publisher.equals("Addison-Wesley")) {
				System.out.println(booksList[i]);
			}
		}
	}

	// список книг, выпущенных после заданного года

	public static void sortYearPublished(Book[] booksList, Scanner sc) {

		System.out.println("\nВвведите год >");
		int year = sc.nextInt();

		System.out.println("Книги, выпущенные после " + year + " года:");

		for (int i = 0; i < booksList.length; i++) {
			if (booksList[i].getYearPublished() > year) {
				System.out.println(booksList[i]);
			}
		}
	}
}
