package com.interviewPrgrams;

public class StringReverseBuffer {
	
	public static void main(String[] args) {
	
	String name="Juliet";
	
	StringBuffer sf=new StringBuffer();
	sf.append(name);
	
	System.out.println("Given String:" +name);
	
	System.out.println("Reverse of a String: "+ sf.reverse());
	
	}

}
