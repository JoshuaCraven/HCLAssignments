package com.hcl.assignment3;
import java.util.Scanner;

public class Student {
	
	public static void Average() {
		Scanner sc = new Scanner(System.in);
		int grade1 = sc.nextInt();
		System.out.print("Enter your second grade:");
		int grade2 = sc.nextInt();
		System.out.print("Enter your third grade:");
		int grade3 = sc.nextInt();
		int sum= (grade1+grade2+grade3)/3;//calculates the average from the three inputted grades
		
		if (sum>50) {
			System.out.println("congratulations you passed!");
		}
		else {
			System.out.println("You failed.");
		}
	}
	public static void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.next();
		
		System.out.print("Thank you "+ name+" now enter your first grade:");
		
		
	}

	public static void main(String[] args) {
		Input();
		Average();
	}

}
