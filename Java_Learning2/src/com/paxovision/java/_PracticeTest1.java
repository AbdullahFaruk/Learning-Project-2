package com.paxovision.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _PracticeTest1 {

	public static void main(String[] args) {
		
	HashMap myHashMap = new HashMap();
	
	myHashMap.put("Zakir", new Double (1000));
	myHashMap.put("Alim", new Double (2000));
	myHashMap.put("Rubana", new Double (3000));
	myHashMap.put("Faruk", new Double (5513.22));
	
	//Get the set of the entries
	
	Set mySet = myHashMap.entrySet();
	
	//get the iterator
	Iterator i = mySet.iterator();
	
	//Display the elements
	
	while (i.hasNext()){
	
		Map.Entry mapEntry = (Map.Entry)i.next();
		System.out.println(mapEntry.getKey() + ": ");
		System.out.println(mapEntry.getValue());
	}
	
	System.out.println();
	
	//desposit into Rubana apas account
	
	double balance = ((Double ) myHashMap.get("Rubana")).doubleValue();
	myHashMap.put("Rubana", new Double (balance + 1000));
	System.out.println("The new Balance for Rubana: " + myHashMap.get("Rubana"));
	
	
	
		

	}

}
