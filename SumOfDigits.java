package com.interviewPrgrams;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int n=123,s=0,a;
		
		System.out.println("Given number: "+n);
		
		//To get a number in runtime
		//Scanner scanner=new Scanner(System.in);
		//a=scanner.nextInt();
		
		while(n>0)
		{
			a=n%10;
			s=s+a;
			n=n/10;
		}
		
		
		System.out.println("Sum Of Digits: "+s);
	}

}
