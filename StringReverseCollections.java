package com.interviewPrgrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverseCollections {
	
	public static void main(String[] args) {
		
		String name="Rohan";
		
		char[] array=name.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		
		for(Character character:array)
		{
			list.add(character);
		}
		
		Collections.reverse(list);
		
		System.out.print(list);
		
		/*
		 * ListIterator iterator=list.listIterator();
		 * 
		 * while(iterator.hasNext()) { System.out.print(iterator.next()); }
		 */
	}

}
