package com.interviewPrgrams;

public class ReplaceVowelsWithStarsRegex {
	
	public static void main(String[] args) {
		
		String input="I love India";
		System.out.println("Given String :"+input);
		
		String replaceText=input.replaceAll("[AEIOUaeiou]", "*");
		System.out.println("Replaced Text :"+replaceText);
		
		
	}

}
