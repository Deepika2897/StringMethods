package com.stringmethods3;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * startsWith(String prefix):
		 * 
		 * Tests if this string starts with the specified prefix.
		 *   
		 */
		
		String message = "welcome to java, it is case-sensitive";
		System.out.println(message.startsWith("welcome"));
		
		System.out.println(message.startsWith("to"));
		
		System.out.println(message.startsWith("to java"));
		System.out.println(message.startsWith("welcome to java"));
		
		System.out.println(message.startsWith("w"));
		
	}

	}


