package com.interviewPrgrams;

public class StringReverseLogicFor {
	
	public static void main(String[] args) {
		
		String name="I am Juliet Rajam";
		
		char[] charArray=name.toCharArray();
		
		String reversed="";
		
		System.out.println("Given String: "+name);
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			reversed=reversed+charArray[i];
		}
		
		System.out.println("Reverse of a String: "+reversed);
		
	}

}
