package com.java.ATM;

public class Account {
	private	int acconum;
	private int pin;
	private double balance;
	private double[] transactions;
	private int transactionCount;
	
public Account() {
	balance=0;
	transactions=new double[100];
	transactionCount=0;
	
}

	
	public void setacconum(int acconum) {
		this.acconum=acconum;
	}
	
	public void setpin(int pin) {
		this.pin=pin;
	}
	
	
	
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	public int getacconum() {
		return acconum;
		}

		public int getPin() {
		return pin;
		}

		public double getbalance() {
		return balance;
		}
	
	public double checkbalance() {
		return getbalance();
	}
	
	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			transactions[transactionCount++]=amount;
			 System.out.println("Deposit successful!");
		}else {
				 System.out.println("Invalid deposit amount");
			 }
		}
 public void withdraw(int amount) {
		if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            transactions[transactionCount++]=-amount;
            System.out.println("Withdrawal successful!");
        }


}

 
 
}



