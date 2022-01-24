package com.classobjectoops;
import java.util.Scanner;
public class Book {

	String isbnNo;
	String bookName;
	float bookPrice;
	int no_Of_Pages;
	String publishedDate;
	Scanner src = new Scanner(System.in);
	
	public void readBookDetails() {
		
		System.out.println("Enter the Book Details");
		System.out.println("Enter the Book ISBN number");
		isbnNo = src.next();
		System.out.println("Enter the Book Name");
		src.nextLine();
		bookName = src.nextLine();
		System.out.println("Enter the Book Price");
		bookPrice = src.nextFloat();
		System.out.println("Enter the no_Of_Pages");
		no_Of_Pages = src.nextInt();
		System.out.println("Enter the Book Published Date");
		publishedDate = src.next();
		
	}
     public void displayBookDetails() {
		
    	System.out.println("The Book Details");
    	
 		System.out.println("Book ISBN number = " + isbnNo);
 		 
 		System.out.println("Book Name = "+bookName);
 		
 		System.out.println("Book Price = "+bookPrice);
 		
 		System.out.println("no_Of_Pages = "+no_Of_Pages);
 		
 		System.out.println("Published Date = " +publishedDate);
		
	}
	
	
}
