package com.interviewPrgrams;

public class StringLength {
	
	public static void main(String[] args) {
		
		String name="Krishna";
		
		char[] charArray=name.toCharArray();
		
		int length=0;
		
		for(char ch:charArray)
		{
			length++;
		}
		
		System.out.println("Length of the given string is: "+length);
		
	}

}
