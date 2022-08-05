package com.hcl.assignment2;
import java.util.Scanner;

public class SwapTwoVariables {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Your first number is "+x+" and your second is "+y);
		System.out.println("Swapping your two numbers");
		
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("Now your first number is "+x+" and your second is "+y);
		
		
	}

}
