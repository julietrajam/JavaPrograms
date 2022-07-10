package com.interviewPrgrams;

public class FindOccurenceOfCharInString {
	
	public static void main(String[] args) {
		
		char toFind='a';
		int occurence=0;
		String input="Rohan Krishna";
		
		input=input.toLowerCase();
		
		int i;
		
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)==toFind)
			{
				occurence=occurence+1;
			}
		}
		
		System.out.println("The character "+toFind+ " is present "+occurence+ " times");
		
	}

}
