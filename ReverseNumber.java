package com.interviewPrgrams;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int n=123,a,s=0;
		
		System.out.println("Given number: "+n);
		
		while(n>0)
		{
			a=n%10;
			s=(s*10)+a;
			n=n/10;
			
		}
		
		System.out.println("Reverse of a number: "+s);
		
	}

}
