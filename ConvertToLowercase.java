package com.interviewPrgrams;

public class ConvertToLowercase {
	
	public static void main(String[] args) {
		
		String input="I am Rohan Krishna";
		
		char[] chararray=input.toCharArray();
		
		for(int i=0;i<input.length();i++)
		{
			if(chararray[i]>=65 && chararray[i]<=90)
				chararray[i]=(char) (chararray[i]+32);
			else
			if(chararray[i]>=97 && chararray[i]<=122)
				chararray[i]=(char) (chararray[i]-32);
		}
		
		for(int i=0;i<chararray.length;i++)
		{
			System.out.print(chararray[i]);
		}
	}

}
