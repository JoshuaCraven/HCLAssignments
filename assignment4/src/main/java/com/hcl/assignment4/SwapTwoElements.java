package com.hcl.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {
	
	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<>();
		
		
		list.add("John");
		list.add("Sam");
		list.add("Harry");
		System.out.println(list);
		
		
		Collections.swap(list,0,2);
		
		System.out.println(list);
		
		
	}

}
