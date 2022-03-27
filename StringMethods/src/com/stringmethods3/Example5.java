package com.stringmethods3;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * split(String regex):
		 * 
		 * Splits this string around matches of the given regular expression.
		 *   
		 */
		
		String message = "Hi, did you finished your lunch";
		
		String words[] = message.split("\\s");
		
		for(String word: words)
		{
			System.out.println(word);
		}
		
	}

}
