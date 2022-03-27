package com.stringmethods2;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * intern():
		 * 
		 * Returns a canonical representation for the string object.
		 * 		 * 
		 */
		
		String text = "LEARN MORE";
		
		String text1 = text.intern();
		
		System.out.println(text1);

	}
	}


