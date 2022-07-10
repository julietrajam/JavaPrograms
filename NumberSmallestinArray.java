package com.interviewPrgrams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberSmallestinArray {
	
	
		

	int a[]= {12,20,2,1,5,4,200};
	
	public void findSmallest()
	{
	
	  int smallest=Integer.MAX_VALUE;
	  
	  for(int i=0;i<a.length;i++) 
	  { 
		  if(a[i]<smallest) 
		  { 
			  smallest=a[i]; 
		  } 
	  }
	  
	  System.out.println("Smallest number in the given array is: "+smallest);
	 
	}
	
	public void usingArray()
	{
	Arrays.sort(a);
	System.out.println("Smallest number in the array using Array Function: "+a[0]);
	}
	
	
	public void usingCollections()
	{
		Integer array[]= {20,10,5,30,12,2};
		List<Integer> list=Arrays.asList(array);
		Collections.sort(list);
		
		System.out.println("Smallest number in the array using Collections: "+array[0]);
		
	}
	
	
	public static void main(String[] args) {
		
		NumberSmallestinArray o1=new NumberSmallestinArray();
		o1.usingArray();
		o1.findSmallest();
		o1.usingCollections();
		
	}
}
