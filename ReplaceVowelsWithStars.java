package com.interviewPrgrams;

public class ReplaceVowelsWithStars {
	
	public static void main(String[] args) {
		
	String input="I love India";
	
	System.out.println("Given Sentence :"+input);
	
	char[] charArray=input.toCharArray();
	
	for(int i=0;i<input.length();i++)
	{
		if(input.charAt(i)=='A' || input.charAt(i)=='E' || input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U'
		 ||input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u' )
		{
			charArray[i]='*';
		}
	}
	
	for(int i=0;i<input.length();i++)
	{
		System.out.print(charArray[i]);
	}
	}

}
