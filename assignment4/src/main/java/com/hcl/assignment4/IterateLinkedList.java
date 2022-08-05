package com.hcl.assignment4;

import java.util.LinkedList;
import java.util.Iterator;

public class IterateLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		Iterator z = list.listIterator(0);
		
		while(z.hasNext()) {
			System.out.println(z.next());
		}

	}

}
