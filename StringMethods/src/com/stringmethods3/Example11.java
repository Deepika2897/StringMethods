package com.stringmethods3;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * trim():
		 * 
		 * Returns a string whose value is this string, with 
		 * any leading and trailing whitespace removed.
		 * 
		 */
		
		String message = " It is raining outside";
		System.out.println(message.length());
		System.out.println(message);
		
		System.out.println("===============================================");
		
		String text = message.trim();//trim() used
		
		System.out.println(text.length());
		System.out.println(text);
		

	}

}
