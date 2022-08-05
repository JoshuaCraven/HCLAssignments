package com.hcl.assignment4;

import java.util.LinkedList;

public class LinkedListReplaceElement {

	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<>();
		
		list.add("John");
		list.add("Jill");
		list.add("Jackson");
		list.add("Jennifer");
		list.add("Josh");
		
		System.out.println(list);
		list.set(3, "Lily");
		System.out.println(list);
		
		

	}

}
