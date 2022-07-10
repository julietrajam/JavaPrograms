package com.interviewPrgrams;

import java.util.*;

import java.util.Arrays;

import java.util.Set;
import java.util.HashSet;

public class FindMissingAlphabetsInString {

	public static void main(String[] args) {
		
		/*1.Get the input String
		 * 2.Covert it into common case either lower or upper
		 * 3.Remove the blankspace if any
		 * 4.Create a String array with english alphabets
		 * 5.Create two hashsets, one with user input and other alphabets
		 * 6.Compare the two sets and find the missing characters
		 */
		
		
		String input="abcdef";
		
		input=input.toLowerCase();
		
		input=input.replaceAll(" ", "");
		
		System.out.println("Given charactes :"+input);
		
		String[] inputarray=input.split("");
		
		String[] alphabets="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1=new HashSet<String>(Arrays.asList(inputarray));
		
		HashSet<String> set2=new HashSet<String>(Arrays.asList(alphabets));
		
		set2.removeAll(set1);
		
		System.out.println("The missing characters are: "+set2);
		
		
		
	}
	
}
