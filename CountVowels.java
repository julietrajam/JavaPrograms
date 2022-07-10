package com.interviewPrgrams;

public class CountVowels {
	
	public static void main(String[] args) {
		
		String input="Rohan";
		System.out.println("Given String is :"+input);
		
		int vowelCount=0;
		
		input=input.toLowerCase();
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
			{
				vowelCount=vowelCount+1;
			}
		}
		
		System.out.println("Total number of vowels in the given string :"+vowelCount);
	}

}
