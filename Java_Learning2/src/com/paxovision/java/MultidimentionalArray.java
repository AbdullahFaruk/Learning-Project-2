package com.paxovision.java;

public class MultidimentionalArray {
	
	public static void main(String [] args){
		
		String[][] names = {
	            {"Mr. ", "Mrs. ", "Ms. "},
	            {"Smith", "Jones", "Sara"}
	        };
	        // Mr. Smith
	        System.out.println(names[0][0] + names[1][0]);
	        // Ms. Jones//mrs sara
	        System.out.println(names[0][1] + names[1][2]);
	        
	        System.out.println(names [0][2] + names[1][1]);
	    }
	}


