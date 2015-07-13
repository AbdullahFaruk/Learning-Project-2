package com.paxovision.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_HashTable {

	public static void main(String[] args) {

		// The HashMap class uses a hashtable to implement the Map interface.

		// Create a hash map
		HashMap<String, Double> myHashMap = new HashMap<String, Double>();
		// Put elements to the map
		myHashMap.put("Zara", (3434.34));
		myHashMap.put("Mahnaz",(123.22));
		myHashMap.put("Ayan",(1378.00));
		myHashMap.put("Daisy",(99.22));
		myHashMap.put("Qadir",(-19.08));

		// Get a set of the entries
		Set set = myHashMap.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) i.next();
			System.out.print(mapEntry.getKey() + ": ");
			System.out.println(mapEntry.getValue());
		}
		System.out.println();
		// Deposit 1000 into Zara's account
		double balance = ((Double) myHashMap.get("Zara")).doubleValue();
		myHashMap.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + myHashMap.get("Zara"));
	}

}
