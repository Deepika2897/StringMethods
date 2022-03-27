package com.stringmethods2;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * indexOf(int ch):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified character.
		 * 
		 * =======================================================================
		 * 
		 * indexOf(int ch, int fromIndex):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified character, starting the search at the specified index.
		 * 
		 */
		
		String text = "I LOVE MY FAMILY";
		
		System.out.println(text.indexOf('I'));
		
		System.out.println(text.indexOf('I', 11));
		
		System.out.println(text.indexOf('L', 2));
		
		

	}
	}


