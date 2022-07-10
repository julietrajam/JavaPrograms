package com.interviewPrgrams;

public class ExtractNumberFromStringAndAdd {
	
	public static void main(String[] args) {
		
		String input="RohanKrishna17";
		
		int total=0;
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			if(Character.isDigit(ch))
				total=total+Character.getNumericValue(ch);
			
			
		}
		System.out.println("Total: "+total);
		
	}

}
