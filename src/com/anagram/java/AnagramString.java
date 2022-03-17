package com.anagram.java;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		boolean  comparestrings;
		String str1 = "HEART";
		String str2 = "EARTH";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
	       Arrays.sort(ch1);
	       Arrays.sort(ch2);
	       comparestrings = Arrays.equals(ch1,ch2);
       if(comparestrings) {
    	   System.out.println("Two strings are Anagram to each other..");  
       }
       else {
    	   System.out.println("Two strings are not Anagram to each other.."); 
       }
	}

}
