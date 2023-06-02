package com.java.ATM;

import java.util.Scanner;

public class ATM {
	
	Scanner sc=new Scanner(System.in);

	 Account ac=new Account();
	 int number;
	 
	 public void createaccount1() {
		 System.out.println("Enter the account number :");
		 int acc_no=sc.nextInt();
		 ac.setacconum(acc_no);
		 System.out.println("Enter the pin number :");
		 int pin=sc.nextInt();
		 ac.setpin(pin);
		 System.out.println("Enter the balance :");
		 double balance=sc.nextInt();
		 ac.setbalance(balance);
		 System.out.println("Account created Successfully");

	 }
	 
	 public void account4login() {
		 System.out.println("Enter the account number :");
		int  acc_no=sc.nextInt();
		 ac.setacconum(acc_no);
		 System.out.println("Enter the pin number :");
		 int pin=sc.nextInt();
		 ac.setpin(pin);
		 System.out.println("Welcome the Accno "+acc_no);
		 
	 }
	 public void login() {
		 do {
				
				
				System.out.println("Welcome to the Simple ATM");
				 System.out.println("1. Check Balance");
		         System.out.println("2. Deposit");
		         System.out.println("3. Withdraw");
		         System.out.println("4. Exit");
		         System.out.print("Choose an option: ");
		         number=sc.nextInt();
		         
		         
		         
		        
				switch(number) {
		         
		         case 1:
		        	 
		        	  
					System.out.println("Current balance :"+ac.checkbalance());
		        	 break;
		        	 
		         case 2:
		        	 System.out.println("Enter deposit amount: ");
		        	
		                 int depositAmount = sc.nextInt();
		                 ac.deposit(depositAmount);
		                 break;
		         case 3:
		             System.out.print("Enter withdrawal amount: $");
		             int withdrawalAmount = sc.nextInt();
		             ac.withdraw(withdrawalAmount);
		             break;
		         case 4:
		             System.out.println("Thank you");
		             break;
		             default:
		            	 System.out.println("invalid number");
		             
		                
		             } 
		         
		                 
		             }while(number!=4);
		         
		         
		         }
	 }


