package com.paxovision.java;

import java.util.ArrayList;

public class MyArrayList {
	
	public static void main(String [] args){
		
		ArrayList<String> myElements = new ArrayList<>();
		
		myElements.add("Apple");
		myElements.add("Orange");
		myElements.add("Banana");
		myElements.add("Mangoes");
		myElements.add("Pears");
		
		System.out.println("The size of my arraylist is: " + myElements);
		System.out.println("The size of my array list in number: " + myElements.size());
		
		myElements.remove("Pears");
		
		System.out.println("Now the new Array list after deleter Pears are: " + myElements);
		System.out.println("Now the count is: " + myElements.size());
		
		
		
	    }
		
		
		
	}

	
	
	


