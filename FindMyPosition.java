package com.interviewPrgrams;

import java.util.Scanner;

public class FindMyPosition {
	
	public static void main(String[] args) {
		
		char givnChar;
		
		System.out.println("Enter a character");
		
		Scanner s=new Scanner(System.in);
		givnChar=s.next().charAt(0);
		
		givnChar=Character.toLowerCase(givnChar);
		
		int asciivalue=(int)givnChar;
		
		int position=asciivalue-96;
		//uppercase
		//int position=asciivalue-64;
		
		System.out.println("Position of the character is: "+position);
		
		
		
	}

}
