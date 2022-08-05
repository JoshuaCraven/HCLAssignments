
package com.hcl.assignment2;
import java.util.Scanner;

public class SumOfTwo {
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		
		if (x+y==z) {
			System.out.println("The sum of your first two integers is equal to your third!");
		}
		else {
			System.out.println("The sum of your first two integers is NOT equal to your third!");
		}
}
	
}
