package com.hcl.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		Collections.reverse(list);
		System.out.println("This is the reverse list: "+list);
		

	}

}
