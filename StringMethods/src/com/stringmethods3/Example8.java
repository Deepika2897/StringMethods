package com.stringmethods3;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * substring(int beginIndex):
		 * 
		 * Returns a string that is a substring of this string.
		 * 
		 * ========================================================
		 * substring(int beginIndex, int endIndex):
		 * 
		 * Returns a string that is a substring of this string.
		 */
		
		String message = "It is raining,it is so pleasant";
		
		
		System.out.println(message.substring(10));
		
		System.out.println(message.substring(19));
		
		System.out.println("=================");
		
		System.out.println(message.substring(6, 17));
		
	}

}
