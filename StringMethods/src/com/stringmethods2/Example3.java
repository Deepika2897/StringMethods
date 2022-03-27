package com.stringmethods2;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * indexOf(String str):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified substring.
		 * 
		 * =======================================================================
		 * 
		 * indexOf(String str, int fromIndex):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified substring, starting at the specified index.
		 * 
		 */
		
		String text = "I LOVE BIRIYANI,I LOVE PANIPURI.";
		
		System.out.println(text.indexOf("LOVE"));
		
		System.out.println(text.indexOf("LOVE", 2));		

	}


	}


