package com.rogera.bank;

public class BankAccount {
	// MEMBER VARIABLES
	private double checkings;
	private double savings;
	
//	CLASS VARIABLE - variables are attributes
	private static int createdAccounts = 0;
	private static double totalAmountMoney = 0;
	
	
//	CONSTRUCTORS
	
//		EMPTY CONSTRUCTOR
	public BankAccount() {
		this.checkings = 5;
		this.savings = 5;
		createdAccounts++;
	}
	
//		FULL CONSTRUCTOR
	public BankAccount(double checkings, double savings) {
		super();
		this.checkings = checkings;
		this.savings = savings;
		createdAccounts++;
	}
	


	
	
	
// CLASS METHODS
	
	
	
// OTHER METHODS
//	DEPOSITS TO CHECKINGS & SAVINGS

	public void depositCheckings(double amount) {
		this.checkings += amount;
		totalAmountMoney += amount;
	}
	
	public void depositSavings(double amount) {
		this.savings += amount;
		totalAmountMoney += amount;
	}
	
	
//	WITHDRAW FROM CHECKINGS & SAVINGS
	
	public void withdrawCheckings(double amount) {
		if(this.checkings > amount) {
			this.checkings -= amount;
			totalAmountMoney -= amount;
		}
		else {
			System.out.println("Not enough Money, dude");
			}
		
	}	
	
	public void withdrawSavings(double amount) {
		if(this.savings > amount){
			this.savings -= amount;
			totalAmountMoney -= amount;
		}
		 else {
			System.out.println("Not enough Money, bro");
			}
	}
	
	
//	DISPLAY CHECKING & SAVINGS
	public void displayCheckingsAccount(double amount) {
		System.out.println(this.checkings);
		
	}
	
	public void displaySavingsAccount(double amount) {
		System.out.println(this.savings);
	}
	

	
//	GETTERS / SETTERS 
	
	public double getCheckings() {
		return checkings;
	}

	public void setCheckings(double checkings) {
		this.checkings = checkings;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	

	
	
}
