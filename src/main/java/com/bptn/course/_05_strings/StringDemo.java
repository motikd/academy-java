package com.bptn.course._05_strings;

import java.util.Scanner;

// New Comment
public class StringDemo {

	public static void main(String[] args) {
		
//		String userName = "   test user  ";
//		System.out.println(userName.length());
//		System.out.println(userName.charAt(2));
//		System.out.println(userName.substring(4));
//		System.out.println(userName.substring(2,4));
//		System.out.println(userName.equals("testuser"));
//		System.out.println(userName.trim());
//		System.out.println(userName.indexOf('r'));
		
//		Read user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = scanner.nextLine();
		
//		Declare storage variables
		int vowelCount = 0;
		int consonantCount = 0;
		
//		Convert everything to lowercase
		String lowerCaseInput = input.toLowerCase();
		
//		Loop through each character in the string
		for(int i=0; i<lowerCaseInput.length(); i++) {
			char ch = lowerCaseInput.charAt(i);
//			Check if its vowel or consonant
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				Update the count
				vowelCount++;
			} else if(ch>='a' && ch<='z') {
				consonantCount++;
			}
		}
		
//		Print the count
		System.out.println("The number of vowels are: "+vowelCount);
		System.out.println("The number of consonants are: "+consonantCount);
		System.out.println("The number of vowels are: "+vowelCount);
		System.out.println("The number of consonants are: "+consonantCount);
		System.out.println("The number of vowels are: "+vowelCount);
		System.out.println("The number of consonants are: "+consonantCount);
		System.out.println("The number of vowels are: "+vowelCount);
		System.out.println("The number of consonants are: "+consonantCount);
		System.out.println("The number of vowels are: "+vowelCount);
		System.out.println("The number of consonants are: "+consonantCount);
	}

}