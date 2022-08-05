package com.hcl.assignment3;
import java.util.Scanner;

public class WashingMachine {
	
	public void switchOn() {
	}
	public static int acceptClothes(int numOfClothes) {
		System.out.println("You put "+ numOfClothes+ " pieces of clothing in the washing machine!");
		return numOfClothes;
	}
	public void acceptDetergent() {	
	}
	public void switchOff() {
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the number of clothes you are loading in the washing machine?");
		acceptClothes(sc.nextInt());
	}

}
