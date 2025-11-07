package com.ramya.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PallindromeFinder {
	
	
	
	public static void main(String args[]) {
//		Scanner input = new Scanner(System.in)	;
//		System.out.println("Type the comma seperated words now");
//		String inputTyped= input.nextLine();
//		List<String> result = Arrays.asList(new String[]{"one", "two", "three"});
		
		List<String> words = Arrays.asList("madam", "wow" , "ramya","test");
		
		List<String> pallindrome = words.stream().filter(PallindromeFinder::isPallindrome).collect(Collectors.toList());
		
		System.out.println(pallindrome.toString());
				
		
	}
	
	
	public static boolean isPallindrome(String word) {
		String reverse = new StringBuilder(word).reverse().toString();
		if (word.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
		
	}

}
