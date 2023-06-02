package com.java.ATM;

import java.util.Scanner;

public class ATMwithAccounts {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		
		Account a2=new Account();
		
		int number;
		while(true) {
		System.out.println("Welcome to the  ATM");
		 System.out.println("1. create Account");
         System.out.println("2. login");
         System.out.println("3. Exit");
         System.out.print("Choose an option: ");
         number=sc.nextInt();
switch(number) {
         
         case 1:
        	 a1.createaccount1();
        	 break;
        	 
         case 2:
        	 a1.account4login();
	          a1.login();
        	 break;
         case 3:
        	 System.out.println("Thank u");
         
             break;
         
              default:
            	  System.out.println("Invalid option");
            	  
            	 
}
	
}
		    }
         
	}

