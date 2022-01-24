package com.classobjectoops;
import java.util.Scanner;
public class BookMain {
//public static void main(String[] args) {
//	Scanner src = new Scanner(System.in);
//	Book book = new Book();
//	char ch = 'y';
//	while (ch == 'y') {
//	System.out.println(" Enter the Transaction.....");
//		System.out.println(" Enter 'read' to enter book details.......");
//		System.out.println(" Enter 'display' to view book detailds......");
//		
//	String trancation = src.next();
//	// using switch case
//	switch(trancation) {
//	case "read":
//	 book.readBookDetails();
//	 break;
//	case "display":
//		 book.DisplayBookDetails();
//		 break;
//	default:
//	System.out.println(" Wrong Choice..");
//	break;
//	}// end switch case
//	System.out.println("Enter Wrong Choice Continues..");
//	ch = src.next().charAt(0);
//}
//}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// create a book object
		Book b = new Book();
		char ch = 'y';// local variable because it is defined inside main method

		while (ch == 'y') {
			System.out.println("Enter the Transaction.....");
			System.out.println("Enter 'read' to enter book details.....");
			System.out.println("Enter 'display' to view book details.....");
			String transaction = sc.next();

			switch (transaction) {
			case "read":
				b.readBookDetails();
				break;
			case "display":
				b.displayBookDetails();
				break;
			default:
				System.out.println("Wrong choice....");
				break;
			}// close of switch
			System.out.println("Enter the choice to continue.....");
			ch = sc.next().charAt(0);
		} // close of while

	}
}

