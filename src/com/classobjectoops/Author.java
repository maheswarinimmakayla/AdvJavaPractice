package com.classobjectoops;

import java.util.Scanner;

public class Author {

	String authorName;
	String bookName;
	String gender;
	String publishedDate;
	int no_of_books;
   
	
	Scanner src = new Scanner(System.in);
	
	public void readAuthorDetails() {
		
		System.out.println("Enter the Author Details");
		System.out.println("Enter the Author Name");
		authorName = src.next();
		System.out.println("Enter the Book Name");
		src.nextLine();
		bookName = src.nextLine();
		System.out.println("Enter the no Of Pages");
		no_of_books = src.nextInt();
		System.out.println("Enter the gender");
		gender = src.next();
		System.out.println("Enter the author Published Date");
		publishedDate = src.next();
		
	}
     public void displyAuthorDetails() {
		
    	 System.out.println("The Author Details");
    	
 		System.out.println("Book ISBN number = " + authorName);
 		 
 		System.out.println("Book Name = "+bookName);
 		
 		System.out.println("Book Price = "+no_of_books);
 		
 		System.out.println("no_Of_Pages = "+gender);
 		
 		System.out.println("Published Date = " +publishedDate);
		
	}
}
