package com.interviewPrgrams;

public class FindOccurenceOfCharacterInStringWoIteration {
	
	public static void main(String[] args) {
		
		/*
		 * Without using iteration
		 * 1.Convert the inputs to a uniform format
		 * 2.Find the length of the actual input
		 * 3.Replace the tofind char with blankspace
		 * 4.Find the length after replacing
		 * 5.Occurence =actual length-length after replacing
		 */
		
		char toFind='a';
		
		String input="Rohan Krishna";
		System.out.println("The given String :"+input);
		
		System.out.println("The given character to find is :"+toFind);
		
		input=input.toUpperCase();
		
		String charToFind=Character.toString(toFind).toUpperCase();
		
		int actualLength=input.length();
		System.out.println("Actual length of String: "+actualLength);
		
		input=input.replace(charToFind, "");
		
		int lengthAfterReplacing=input.length();
		
		System.out.println("Length After Replacing: "+lengthAfterReplacing);
		
		int exactOccurence=actualLength-lengthAfterReplacing;
		
		System.out.println("The "+toFind+ "given character occured "+exactOccurence+ " times");
		
		
		
	}

}
