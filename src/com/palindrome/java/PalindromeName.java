package com.palindrome.java;

public class PalindromeName {
	public static void main(String[] args) {
		String str1 = "HANNAH";
		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {
			char[] ch1 = str1.toCharArray();
			str2 = str2 + ch1[i];

		}

		if (str1.equals(str2)) {
			System.out.println("The String is Palindrome..");
		} else {
			System.out.println("The String is Not Palindrome..");
		}

	}

}
