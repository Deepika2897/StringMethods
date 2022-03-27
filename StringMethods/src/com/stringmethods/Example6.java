package com.stringmethods;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/**
		 * equals(Object anObject):
		 * 
		 * Compares this string to the specified object.
		 * 
		 * ================================================
		 * 
		 * equalsIgnoreCase(String anotherString):
		 * 
		 * Compares this String to another String, ignoring case considerations.
		 * 
		 */		
		
		String text1 = "Deepika";
		
		String text2 = "DEEPIKA";
		
		String text3 = "Girl";
		
		String text4 = "Deepika";
		
		String text5 = "Deepibis";	

		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text1.equals(text4));
		
		System.out.println("==========================");
		
		System.out.println(text1.equalsIgnoreCase(text4));
		
	}



	}


