package com.hcl.assignment2;
import java.util.Scanner;

public class PrintPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to find out if it's prime:");
		int x = sc.nextInt();
		boolean z = true;
		
		for(int i=2; i<=x/2;++i) {
			if(x%i==0) {
				z=false;
				break;
			}
		}
		if (z==true) {
			System.out.println(x+ " is a prime number.");
		}
		else {
			System.out.println(x+ " is not a prime number.");
		}
	}

}
