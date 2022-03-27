package com.stringmethods3;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * toCharArray():
		 * 
		 * Converts this string to a new character array.
		 *   
		 */
		
		String message = "Hi, did you had your lunch";
		
		char characters[] = message.toCharArray();
		
		for(char character: characters)
		{
			System.out.println(character);
		}
		
	}

	}

