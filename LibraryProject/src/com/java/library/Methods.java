package com.java.library;

import java.util.Scanner;

public class Methods {
	private static final int MAX_BOOKS = 10;
    private static final int MAX_PATRONS = 5;
    private static String[] books = new String[MAX_BOOKS];
    private static String[] authors = new String[MAX_BOOKS];
   private static String[] patrons = new String[MAX_PATRONS];
   private static String[] borrowedBooks = new String[MAX_PATRONS];
   String Patronname;        
	private static int bookCount = 0;
	private static int authorCount = 0;
    private static int patronCount = 0;
    
    static Scanner sc = new Scanner(System.in);
	public  void Addbook() {
		
		if(bookCount>=MAX_BOOKS) {
			System.out.println("You cannot add the book ,maximum limit has done");
			
		}else {
			System.out.println("Enter book title :");
			String title=sc.nextLine();
			System.out.println("Enter book Author :");
			String author=sc.nextLine();
	        books[bookCount]=title;
	           authors[authorCount]=author;
	           bookCount++;
			System.out.println("You have added the book Successfully");
			
			
			
		}
	}
	
	public void AddPatron() {
		if (patronCount >= MAX_PATRONS) {
            System.out.println("Cannot add more patrons. Maximum limit reached.");
            return;
        }

        System.out.print("Enter the patron name: ");
        
        String patronName = sc.nextLine();

        patrons[patronCount] = patronName;
        patronCount++;

        System.out.println("Patron added successfully!");
    }

public static void borrowBook() {
    System.out.print("Enter the patron name: ");
    
    String patronName = sc.nextLine();

    int patronIndex = findPatronIndex(patronName);

    if (patronIndex == -1) {
        System.out.println("Patron not found.");
        return;
    }

    if (borrowedBooks[patronIndex] != null) {
        System.out.println("Patron already borrowed a book.");
        return;
    }

    System.out.print("Enter the book title: ");
    String bookTitle = sc.nextLine();

    int bookIndex = findBookIndex(bookTitle);

    if (bookIndex == -1) {
        System.out.println("Book not found.");
        return;
    }

    if (books[bookIndex] == null) {
        System.out.println("Book is not available for borrowing.");
        return;
    }

    books[bookIndex] = null;
    borrowedBooks[patronIndex] = bookTitle;

    System.out.println("Book borrowed successfully!");
}

public static void returnBook() {
    System.out.print("Enter the patron name: ");
    
    String patronName = sc.nextLine();

    int patronIndex = findPatronIndex(patronName);

    if (patronIndex == -1) {
        System.out.println("Patron not found.");
        return;
    }

    if (borrowedBooks[patronIndex] == null) {
        System.out.println("Patron has not borrowed any book.");
        return;
    }

    System.out.print("Enter the book title: ");
    String bookTitle = sc.nextLine();

    int bookIndex = findBookIndex(bookTitle);
    

    if (bookIndex == -1) {
        System.out.println("Book not found.");
        return;
    }

    books[bookIndex] = bookTitle;
    borrowedBooks[patronIndex] = null;

    System.out.println("Book returned successfully!");
}

public static int findBookIndex(String bookTitle) {
    for (int i = 0; i < bookCount; i++) {
        if (books[i] != null && books[i].equalsIgnoreCase(bookTitle)) {
            return i;
        }
        else {
        	if(borrowedBooks[i] != null && borrowedBooks[i].equalsIgnoreCase(bookTitle)) {
        		
        	}
        }
    
   
}
	return -1;
}

private static int findPatronIndex(String patronName) {
    for (int i = 0; i < patronCount; i++) {
        if (patrons[i].equalsIgnoreCase(patronName)) {
            return i;
        }
    }
    return -1;
}
}

		
	
	
	


