package com.ramya.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringCompressor {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the word to be compressed");
		String word = scn.nextLine();
		
		System.out.println("the compressedValue :::"+compressor(word));
	}

	
	public static String compressor(String input) {
		String returnVal = "";
		//Map<Character , Integer> charMap = new TreeMap<Character , Integer>();
		// If you want in reverse order
		//Map<Character, Integer>   charMap = new TreeMap<>(Collections.reverseOrder());
		Map<Character, Integer>   charMap = new HashMap<>();
		
		char[] charArray = input.toCharArray();
		for(char c : charArray) {
			
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
			
			

		}
		
		
		
		returnVal = charMap.toString();
		return returnVal;
	}
	
}
