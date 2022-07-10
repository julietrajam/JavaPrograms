package com.interviewPrgrams;

public class SmallestNumber {
	
	public static void main(String[] args) {
		
	
	int a[]= {50,10,5,40,3,12};
	
	int i,j,temp=0;
	
	
	
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	
	System.out.println("Smallest number in the array:"+temp);

	}
}
