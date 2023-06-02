package com.java.library;

import java.util.Scanner;

public class SampleLibrary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Methods m1 = new Methods();
		int number;
		do {
			System.out.println("Library Management System");
			System.out.println("1. Add Book");
			System.out.println("2. Add Patron");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			number = sc.nextInt();

			switch (number) {
			case 1:
				m1.Addbook();
                  break;
			case 2:
				m1.AddPatron();
				break;
				
			case 3:
				m1.borrowBook();
				break;
				
			case 4:
				m1.returnBook();
				break;
			case 5:
				System.out.println("Thank you! visit Again");
				break;
			default:
                System.out.println("Invalid choice. Please try again.");
			}
		}
		while (number != 4);

	}
}
