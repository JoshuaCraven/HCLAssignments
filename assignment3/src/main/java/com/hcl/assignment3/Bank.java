package com.hcl.assignment3;

import java.util.Scanner;

public class Bank {
	public static int deposit(int balance) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how much you want to deposit:");
		int input = sc.nextInt();
		balance=balance+input;
		
		System.out.println("Your current balance is: "+balance);
		
		return balance;
		
		
	}
	
	public static int withdrawal(int balance) {
		Scanner sc=new Scanner(System.in);
		int input= sc.nextInt();
		if(balance>=input) {
			balance=balance-input;
		}
		else {
			System.out.println("You don't have "+input+" in your account.");
		}
		System.out.println("Your current balance is: "+balance);
		return balance;
		
	}
	

	public static void main(String[] args) {
		int balance=1000;//set current balance to 1000
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 for deposit and 2 for withdrawal:  ");
		int input=sc.nextInt();
		
		if(input==1) {
			deposit(balance);
		}
		else if(input==2) {
			withdrawal(balance);
		}
		else {
			System.out.println("You did not enter deposite or withdrawal");
		}


	}

}
