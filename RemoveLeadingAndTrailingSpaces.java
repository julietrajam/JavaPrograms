package com.interviewPrgrams;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		
		String input=" Rohan Krishna  is 3 years old  ";
		
		System.out.println("Using Trim Function :"+input.trim());
		
		//strip
		System.out.println("Using Strip Function :"+input.strip());
		
		//strip Leading
		System.out.println("Using Strip Leading Function :"+input.stripLeading());
		
		//strip trailing
		System.out.println("Using Strip Trailing Function :"+input.stripTrailing());
		
		//Regex
		System.out.println("Using LEading and Trailing Regex :"+input.replaceAll("^[ \t]+|[ \t]+$",""));
		
		//Regex Leading
		System.out.println("Using Regex Leading Function :"+input.replaceAll("^[ \t]", ""));
		
		//Regex Trailing
		System.out.println("Using Regex Trailing Function :"+input.replaceAll("[ \t]+$", ""));
		
		
		
		
	}
	
}
