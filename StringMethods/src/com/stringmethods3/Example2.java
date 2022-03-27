package com.stringmethods3;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * lastIndexOf(String str):
		 * 
		 * Returns the index within this string of the last occurrence 
		 * of the specified substring.
		 *   
		 */
		
		String message = "Kerala is my favourite place, it is chill,it is cool"; 
		System.out.println(message.lastIndexOf("kerala"));
		
		System.out.println(message.lastIndexOf("it is chill"));
		System.out.println(message.lastIndexOf(" cool"));
		
	}

	}


