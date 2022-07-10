package com.interviewPrgrams;

public class ReverseWordByWord {
	
	public static void main(String[] args) {
	
	String str="I am Rohan";
	
	String reversed="";
			
	String[] array=str.split(" ");
	
	int i;
	
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	
	for(i=array.length-1;i>=0;i--)
	{
		reversed=reversed+array[i]+" ";
	}
	
	System.out.println("Revesed the given sentence word by word is: "+reversed);
	
  }
	

}
