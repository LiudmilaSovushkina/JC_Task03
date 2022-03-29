package by.academy.tr.book;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();

		init1(b1);
		init2(b2);
		init3(b3);
		init4(b4);

		Book[] arrayBook = { b1, b2, b3, b4 };

		Scanner sc = new Scanner(System.in);

		print(arrayBook);
		sortAuthor(arrayBook);
		sortPublisher(arrayBook);
		sortYearPublished(arrayBook, sc);
	}

	public static void init1(Book b1) {
		b1.setId(1);
		b1.setTitle("The Java Handbook");
		b1.setAuthor("Patrick Naughton, Michael Morrison");
		b1.setPublisher("Osborne/McGraw-Hill");
		b1.setYearPublished(1996);
		b1.setNumberOfPages(424);
		b1.setPrice(27.95);
		b1.setBinding("hardcover");
	}

	public static void init2(Book b2) {
		b2.setId(2);
		b2.setTitle("Thinking in Java");
		b2.setAuthor("Bruce Eckel");
		b2.setPublisher("Prentice Hall");
		b2.setYearPublished(1998);
		b2.setNumberOfPages(1152);
		b2.setPrice(39.95);
		b2.setBinding("hardcover");
	}

	public static void init3(Book b3) {
		b3.setId(3);
		b3.setTitle("The Java Language Specificationa");
		b3.setAuthor("James Gosling , Bill Joy, Guy Steele");
		b3.setPublisher("Addison-Wesley");
		b3.setYearPublished(1997);
		b3.setNumberOfPages(720);
		b3.setPrice(31.05);
		b3.setBinding("hardcover");

	}

	public static void init4(Book b4) {
		b4.setId(4);
		b4.setTitle("The Java Programming Language, 2nd Edition");
		b4.setAuthor("Ken Arnold, James Gosling");
		b4.setPublisher("Addison-Wesley");
		b4.setYearPublished(1998);
		b4.setNumberOfPages(464);
		b4.setPrice(34.75);
		b4.setBinding("hardcover");
	}

	public static void print(Book[] arrayBook) {
		for (int i = 0; i < arrayBook.length; i++) {
			System.out.println(arrayBook[i].toString());
		}
	}

	// список книг заданного автора

	public static void sortAuthor(Book[] arrayBook) {

		System.out.println("\nКниги автора <Bruce Eckel>:");

		for (int i = 0; i < arrayBook.length; i++) {
			if (arrayBook[i].getAuthor() == "Bruce Eckel") {
				System.out.println(arrayBook[i]);
			}
		}
	}

	// список книг, выпущенных заданным издательством

	public static void sortPublisher(Book[] arrayBook) {

		System.out.println("\nКниги издательства <Addison-Wesley>:");

		for (int i = 0; i < arrayBook.length; i++) {
			if (arrayBook[i].getPublisher() == "Addison-Wesley") {
				System.out.println(arrayBook[i]);
			}
		}
	}

	// список книг, выпущенных после заданного года

	public static void sortYearPublished(Book[] arrayBook, Scanner sc) {

		System.out.println("\nВвведите год >");
		int year = sc.nextInt();

		System.out.println("Книги, выпущенные после " + year + " года:");

		for (int i = 0; i < arrayBook.length; i++) {
			if (arrayBook[i].getYearPublished() > year) {
				System.out.println(arrayBook[i]);
			}
		}
	}
}
