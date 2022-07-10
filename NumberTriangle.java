package com.interviewPrgrams;

import java.util.Scanner;

public class NumberTriangle {
	
	public static void main(String[] args) {
		
		int i,j,limit;
		int startingNumber=1;
		
		System.out.println("Enter the limit:");
		Scanner s=new Scanner(System.in);
		limit=s.nextInt();
		
		for(i=0;i<limit;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(startingNumber+" ");
				startingNumber=startingNumber+1;
				
			}
			System.out.println(" ");
		}
		
		
		
	}

}
