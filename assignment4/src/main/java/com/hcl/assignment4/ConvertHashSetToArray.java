package com.hcl.assignment4;


import java.util.HashSet;

public class ConvertHashSetToArray {

	public static void main(String[] args) {
		
		HashSet<String> list = new HashSet<>();
		
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		System.out.println(list);
		
		String[] array = new String[list.size()];
		
		list.toArray(array);
		
		for(String color : array) {
		System.out.println(color);
		
		}
		

	}

}
