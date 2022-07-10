package com.interviewPrgrams;

import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {
	
	int a[]= {12,10,23,44,15};
	
	int numberToFind=2;
	
	boolean found=false;
	
	public void elementPresentOrNot(){
		
		for(int number:a)
		{
			if(number==numberToFind)
			{
				found=true;
				
			    break;
			}			
		} 
		
		if(found)
		{
			System.out.println("Number "+numberToFind+" is Present");
		}
		else
		{
			System.out.println("Number "+numberToFind+ " is not present");
		}
	
	}
	
	public void usingInstream()
	{
		boolean found=IntStream.of(a).anyMatch(element->element==numberToFind);
		if(found)
			System.out.println("Using Intstream element " +numberToFind+ " is found");
		else
			System.out.println("Using Intstream element " +numberToFind+ " not found");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayContainsElementOrNot o1=new ArrayContainsElementOrNot();
		o1.elementPresentOrNot();
		o1.usingInstream();
	}
	
	}


