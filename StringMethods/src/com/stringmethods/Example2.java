package com.stringmethods;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * compareTo(String anotherString):
		 * 
		 * Compares two strings lexicographically.
		 * 
		 * =======================================================
		 * 
		 * compareToIgnoreCase(String str):
		 * 
		 * Compares two strings lexicographically, ignoring case differences.
		 * 
		 */		
		
		String text1 = "WELCOME TO JAVA PROGRAMMING";
		
		String text2 = "WELCOME";
		
		String text3 = "TO JAVA PROGRAMMING";
		
		String text4 = "WELCOME";
		
		System.out.println(text1.compareTo(text2));
		
		System.out.println(text1.compareTo(text3));
		
		System.out.println(text1.compareTo(text4));
		
		System.out.println("=======================");
		
		System.out.println(text1.compareToIgnoreCase(text4));
		
	}



	}


