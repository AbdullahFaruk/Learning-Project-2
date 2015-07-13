package com.paxovision.java;

public class ArrayDemo {

	public static void main(String[] args) {

		// declare the array as myArray which is integer
		int[] myArray;

		// allocate the memory of myArray
		myArray = new int[5];
		// initialize the first element
		myArray[0] = 10;
		// initialize the second element
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		
		System.out.println("The first array index: " + myArray[0]);
		System.out.println("The Second array index: " + myArray[1]);
		System.out.println("The last array index: " + myArray[4]);
		
		
	}

}
