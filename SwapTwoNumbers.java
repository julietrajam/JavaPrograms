package com.interviewPrgrams;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
	int a=100,b=200;
	
	System.out.println("Before Swapping:");
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	
	a=a-b; //a=100-200  a=-100
	b=a+b; //b=-100+200 b=100
	a=b-a; //a=100--100 a=200      
	
	System.out.println("After Swapping:");
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	
	}

}
